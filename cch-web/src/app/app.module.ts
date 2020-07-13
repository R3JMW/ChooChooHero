import { BrowserModule } from '@angular/platform-browser';
import { NgModule, ErrorHandler } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { LoadingBarRouterModule } from '@ngx-loading-bar/router';

import { AppRoutingModule } from './app-routing.module';
import { TranslateModule, TranslateLoader } from '@ngx-translate/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';

import { HttpInterceptorProviders } from './@common/interceptor/http-interceptor-providers';
import { ErrorHandlerFactory } from './@common/error-handler/error-handler-factory';
import { DefaultHttpTranslateLoader } from './@common/translate-loader/default-http-translate-loader.service';
import { CchModule } from './@common';

@NgModule({
  declarations: [AppComponent],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule,
    LoadingBarRouterModule,
    CchModule.forRoot(),
    TranslateModule.forRoot({
      loader: { provide: TranslateLoader, useClass: DefaultHttpTranslateLoader }
    }),
    AppRoutingModule
  ],
  providers: [
    HttpInterceptorProviders,
    {
      provide: ErrorHandler,
      useFactory: ErrorHandlerFactory
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
