import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./home/home.component";
import { MenuUsuarioComponent } from "./menu-usuario/menu-usuario.component";
import { MenuCartaoComponent } from "./menu-cartao/menu-cartao.component";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'menu-usuario', component: MenuUsuarioComponent},
  {path: 'menu-cartao', component: MenuCartaoComponent},
]

@NgModule({
  declarations:[],
  imports:[RouterModule.forRoot(routes)],
  exports:[RouterModule]
})

export class AppRoutingModule{}
