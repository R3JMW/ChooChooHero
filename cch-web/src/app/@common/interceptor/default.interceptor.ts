import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpErrorResponse,
  HttpResponseBase
} from '@angular/common/http';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/internal/operators';

export class DefaultInterceptor implements HttpInterceptor {
  constructor() {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    return next.handle(request).pipe(
      tap(
        null,
        err => this.defaultHttpErrorHandler(err),
        () => console.log('tap complete')
      )
    );
  }

  private defaultHttpErrorHandler(err: HttpResponseBase): void {
    // Do something
    if (err instanceof HttpErrorResponse) {
      switch (err.status) {
        case 401:
          // Unauthorized
          // Navigate to Login Page
          break;
        case 403:
          // Forbidden
          break;
        case 404:
          // Not Found
          break;
        case 500:
          // Internal Server Error
          break;
        case 503:
          // Service Unavailable
          break;
        case 504:
          // Gateway Timeout
          throw new Error('Gateway Timeout');
      }
    }
  }
}
