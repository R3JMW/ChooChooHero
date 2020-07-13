import { ErrorHandler } from '@angular/core';

export class DefaultErrorHandler implements ErrorHandler {
  constructor() {
    console.warn('Default Error Handler Init Success');
  }
  handleError(error: any): void {
    console.error('====================================================================');
    console.error(error);
    console.error('====================================================================');
  }
}
