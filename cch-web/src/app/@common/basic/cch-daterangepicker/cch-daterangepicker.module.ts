import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CchDaterangepickerDirective } from './cch-daterangepicker.directive';

@NgModule({
  declarations: [CchDaterangepickerDirective],
  imports: [CommonModule],
  exports: [CchDaterangepickerDirective]
})
export class CchDaterangepickerModule {}
