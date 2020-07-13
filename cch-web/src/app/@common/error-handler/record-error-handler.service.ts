import { ErrorHandler } from '@angular/core';

export class RecordErrorHandler implements ErrorHandler {
  constructor() {
    console.warn('Record Error Handler Init Success');
  }
  handleError(error: any): void {
    console.error('++++++++++++++++++++++++++++++++++++++++++++++++++');
    console.error(error);
    console.error('++++++++++++++++++++++++++++++++++++++++++++++++++');
  }
}
