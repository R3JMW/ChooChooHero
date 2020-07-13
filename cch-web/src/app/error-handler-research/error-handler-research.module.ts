import { NgModule, ErrorHandler } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DataTablesModule } from 'angular-datatables';

import { ErrorHandlerResearchRoutingModule } from './error-handler-research-routing.module';
import { ErrorHandlerResearchComponent } from './error-handler-research.component';
import { HttpErrorComponent } from './http-error/http-error.component';
import { ProviderErrorComponent } from './provider-error/provider-error.component';
import { JqueryErrorComponent } from './jquery-error/jquery-error.component';
import { RecordErrorHandler } from '../@common/error-handler/record-error-handler.service';
import { OutsideZoneComponent } from './outside-zone/outside-zone.component';

@NgModule({
  declarations: [ErrorHandlerResearchComponent, HttpErrorComponent, ProviderErrorComponent, JqueryErrorComponent, OutsideZoneComponent],
  imports: [CommonModule, DataTablesModule, ErrorHandlerResearchRoutingModule]
})
export class ErrorHandlerResearchModule {}
