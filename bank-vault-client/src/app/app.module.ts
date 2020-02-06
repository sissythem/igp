import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { AngularFontAwesomeModule } from 'angular-font-awesome';
import { LoaderInterceptorService } from './services/loader-interceptor.service';
import { HeaderComponent } from './components/header/header.component';
import { AtmComponent } from './pages/atm/atm.component';
import { LoaderComponent } from './components/loader/loader.component';
import { AccountComponent } from './pages/account/account.component';
import { AccountDetailsComponent } from './pages/account-details/account-details.component';
import { AccountBackendComponent } from './pages/account-backend/account-backend.component';
import { AtmBackendComponent } from './pages/atm-backend/atm-backend.component';
import { HomeComponent } from './pages/home/home.component';
import { AuthComponent } from './pages/auth/auth.component';
import { AccountService } from './services/accounts.service';
import { RestService } from './services/rest.service';
import { HttpErrorInterceptor } from './http-error.interceptor';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AtmComponent,
    LoaderComponent,
    AccountComponent,
    AccountDetailsComponent,
    AccountBackendComponent,
    AtmBackendComponent,
    HomeComponent,
    AuthComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    AngularFontAwesomeModule
  ],
  providers: [
    AccountService,
    RestService,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: LoaderInterceptorService,
      multi: true
    },
    {
      provide: HTTP_INTERCEPTORS,
      useClass: HttpErrorInterceptor,
      multi: true
    }],
  bootstrap: [AppComponent]

})
export class AppModule { }
