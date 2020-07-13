import { Provider } from '@angular/core';
import { HTTP_INTERCEPTORS } from '@angular/common/http';

import { DefaultInterceptor } from './default.interceptor';

export const HttpInterceptorProviders: Provider = [
  { provide: HTTP_INTERCEPTORS, useClass: DefaultInterceptor, multi: true }
];
