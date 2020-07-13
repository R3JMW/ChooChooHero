import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DataTablesModule } from 'angular-datatables';

import { PaperTableRoutingModule } from './paper-table-routing.module';
import { PaperTableComponent } from './paper-table.component';


@NgModule({
  declarations: [PaperTableComponent],
  imports: [
    CommonModule,
    DataTablesModule,
    PaperTableRoutingModule
  ]
})
export class PaperTableModule { }
