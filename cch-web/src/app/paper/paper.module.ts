import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CKEditorModule } from '@ckeditor/ckeditor5-angular';

import { PaperRoutingModule } from './paper-routing.module';
import { PaperComponent } from './paper.component';


@NgModule({
  declarations: [PaperComponent],
  imports: [
    CommonModule,
    CKEditorModule,
    PaperRoutingModule
  ]
})
export class PaperModule { }
