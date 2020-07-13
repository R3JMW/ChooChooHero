import { NgModule, ModuleWithProviders } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CchDatepickerModule } from '../basic/cch-datepicker/cch-datepicker.module';
import { CchDaterangepickerModule } from '../basic/cch-daterangepicker/cch-daterangepicker.module';

@NgModule({
  declarations: [],
  imports: [CommonModule, CchDatepickerModule, CchDaterangepickerModule],
  exports: [CchDatepickerModule, CchDaterangepickerModule]
})
export class CchModule {
  static forRoot(): ModuleWithProviders {
    return {
      ngModule: CchModule,
      providers: []
    };
  }
}
