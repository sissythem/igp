import { Injectable, Injector } from '@angular/core';
import { HttpEvent, HttpInterceptor, HttpHandler, HttpRequest, HttpResponse } from '@angular/common/http';
import { Observable, pipe } from 'rxjs';
import { tap } from 'rxjs/operators';
import { LoaderService } from './loader.service';

@Injectable({
  providedIn: 'root'
})

export class LoaderInterceptorService implements HttpInterceptor {

  constructor(private loaderService: LoaderService) { }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

    this.showLoader();

    return next.handle(this.addAuthHeader(req))
      .pipe(tap((event: HttpEvent<any>) => {
        if (event instanceof HttpResponse) {
          this.onEnd();
        }
      },
        (err: any) => {
          this.onEnd();
        }));
  }
  private onEnd(): void {
    this.hideLoader();
  }
  private showLoader(): void {
    this.loaderService.show();
  }
  private hideLoader(): void {
    this.loaderService.hide();
  }


  private addAuthHeader(req: HttpRequest<any>): HttpRequest<any> {

    const token = window.sessionStorage.getItem('peiraiosToken');
    console.log(token);

    if (token) {
      return req.clone({
        headers: req.headers.set('Authentication', 'Bearer ' + token)
      });
    } else {
      return req;
    }
  }
}
