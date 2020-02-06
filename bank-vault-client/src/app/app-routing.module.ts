import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AtmComponent } from './pages/atm/atm.component';
import { HomeComponent } from './pages/home/home.component';
import { AccountComponent } from './pages/account/account.component';
import { AuthComponent } from './pages/auth/auth.component';
import { AtmBackendComponent } from './pages/atm-backend/atm-backend.component';
import { AccountBackendComponent } from './pages/account-backend/account-backend.component';
import { AccountDetailsComponent } from './pages/account-details/account-details.component';


export const appRoutes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full'},
  { path: 'home', component: HomeComponent },
  { path: 'atms', component: AtmComponent },
  { path: 'accounts/:id', component: AccountDetailsComponent },
  { path: 'accounts', component: AccountBackendComponent },
  { path: 'atms_be', component: AtmBackendComponent },
  { path: 'auth', component: AuthComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
