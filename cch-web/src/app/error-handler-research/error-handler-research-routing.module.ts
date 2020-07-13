import { NgModule, ErrorHandler } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ErrorHandlerResearchComponent } from './error-handler-research.component';
import { HttpErrorComponent } from './http-error/http-error.component';
import { JqueryErrorComponent } from './jquery-error/jquery-error.component';
import { ProviderErrorComponent } from './provider-error/provider-error.component';
import { ErrorHandlerFactory } from '../@common/error-handler/error-handler-factory';
import { RecordErrorHandler } from '../@common/error-handler/record-error-handler.service';
import { OutsideZoneComponent } from './outside-zone/outside-zone.component';

const routes: Routes = [
  {
    path: '',
    component: ErrorHandlerResearchComponent,
    children: [
      { path: 'http', component: HttpErrorComponent },
      { path: 'jquery', component: JqueryErrorComponent },
      { path: 'provider', component: ProviderErrorComponent },
      { path: 'outside', component: OutsideZoneComponent }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: [
    {
      provide: ErrorHandler,
      useFactory: ErrorHandlerFactory,
      deps: [RecordErrorHandler]
    }
  ]
})
export class ErrorHandlerResearchRoutingModule {}
