import { Component, OnInit } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';

import * as _ from 'lodash';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  constructor(private translate: TranslateService) {
    this.translate.setDefaultLang('en');
  }
  ngOnInit(): void {
    _.chain([]).uniqWith(_.isEqual);
  }
}
