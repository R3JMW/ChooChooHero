import { Component, OnInit, AfterViewInit, ViewChild, ElementRef } from '@angular/core';

import { HttpUserService } from '../@common/services/http-user.service';

@Component({
  selector: 'app-error-handler-research',
  templateUrl: './error-handler-research.component.html',
  styleUrls: ['./error-handler-research.component.scss']
})
export class ErrorHandlerResearchComponent implements OnInit, AfterViewInit {
  @ViewChild('#error')
  private element: ElementRef;

  public dtOptions: DataTables.Settings = {};

  public date = 'aaaa';

  constructor(private userHttp: HttpUserService) {
    window.onerror = (...args) => {
      console.log('window.onerror: ', args);
    };

    window.addEventListener('error', args => {
      console.log('error event: ', args);
    });
  }

  ngOnInit(): void {
    this.userHttp.login('admin', 'admin').subscribe(
      res => console.log(res, new Error()),
      err => console.log(err),
      () => console.log('complete')
    );
  }

  ngAfterViewInit(): void {
    // this.element.nativeElement

    // setTimeout(() => this.anyFunctions().toString(), 200);
    // setTimeout(() => $('error').datepicker({}), 300);
    setTimeout(function () {
      this.anyFunctions;
    }, 300);
  }

  private anyFunctions: string;
}
