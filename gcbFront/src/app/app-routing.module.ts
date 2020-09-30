import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CidadeComponent } from './cidade/cidade.component';
import { DoctorComponent } from './doctor/doctor.component';
import { EspecialidadeComponent } from './especialidade/especialidade.component';
import { EstadoComponent } from './estado/estado.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'doctor', component: DoctorComponent},
  {path: 'cidade', component: CidadeComponent},
  {path: 'estado', component: EstadoComponent},
  {path: 'especialidade', component: EspecialidadeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
