import { TranslateLoader } from '@ngx-translate/core';
import { Observable, of } from 'rxjs';

export class DefaultHttpTranslateLoader implements TranslateLoader {
  constructor() {}
  getTranslation(_lang: any): Observable<any> {
    const _abc: string = null;
    // if (!lang) {
    // } else {
    // }
    return of(null);
  }
}
