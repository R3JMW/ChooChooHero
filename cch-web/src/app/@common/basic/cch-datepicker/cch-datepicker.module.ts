import { NgModule, ModuleWithProviders } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CchDatepickerDirective } from './cch-datepicker.directive';

@NgModule({
  declarations: [CchDatepickerDirective],
  imports: [CommonModule],
  exports: [CchDatepickerDirective]
})
export class CchDatepickerModule {
  static forRoot(): ModuleWithProviders {
    return {
      ngModule: CchDatepickerModule,
      providers: []
    };
  }
}
