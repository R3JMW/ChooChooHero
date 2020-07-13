import { ErrorHandler } from '@angular/core';
import { DefaultErrorHandler } from './default-error-handler.service';

export class ErrorHandlerImpl implements ErrorHandler {
  handleError(error: any): void {
    console.error(error);
  }
}

// export const ErrorHandlerFactory = <T extends ErrorHandlerImpl>(t: { new (...args): T }): T => {
//   return new t();
// };

export const ErrorHandlerFactory = (t: any): any => {
  return new DefaultErrorHandler();
};
