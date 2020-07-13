import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'login', loadChildren: () => import('./auth/login/login.module').then(e => e.LoginModule) },
  { path: 'home', loadChildren: () => import('./home/home.module').then(e => e.HomeModule) },
  {
    path: 'error-handler',
    loadChildren: () =>
      import('./error-handler-research/error-handler-research.module').then(e => e.ErrorHandlerResearchModule)
  },
  { path: 'p/:id', loadChildren: () => import('./paper/paper.module').then(e => e.PaperModule) },
  { path: 'p', loadChildren: () => import('./paper-table/paper-table.module').then(e => e.PaperTableModule) }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
