import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { of } from 'rxjs';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-http-error',
  templateUrl: './http-error.component.html',
  styleUrls: ['./http-error.component.scss']
})
export class HttpErrorComponent implements OnInit {
  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    throw new Error('Try Error Handler');
  }

  public onSpyCall(): void {
    of(1)
      .pipe(
        map(e => {
          throw new Error('500');
        })
      )
      .subscribe(
        res => console.log(res),
        err => console.error(err),
        () => console.log('complete')
      );
  }

  public onCall(): void {
    this.http.get<any>('assets/data/mock-page.json').subscribe(
      res => console.log(res),
      err => console.error(err),
      () => console.log('complete')
    );
  }
}
