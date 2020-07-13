import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PaperTableComponent } from './paper-table.component';


const routes: Routes = [
    { path: '', component: PaperTableComponent }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class PaperTableRoutingModule { }
