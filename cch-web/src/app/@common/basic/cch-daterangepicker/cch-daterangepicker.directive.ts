import {
  Directive,
  ElementRef,
  OnInit,
  AfterViewInit,
  Input,
  OnChanges,
  OnDestroy,
  SimpleChanges,
  Renderer2
} from '@angular/core';
import * as moment from 'moment';

@Directive({
  selector: '[cch-daterangepicker]'
})
export class CchDaterangepickerDirective implements OnInit, AfterViewInit, OnChanges, OnDestroy {
  private defaultOptions: DatepickerOptions = {
    format: {
      toDisplay: (date, format, language) => {
        return moment(date).format(this.displayFormat);
      },
      toValue: (date, format, language) => {
        return new Date(date);
      }
    },
    todayHighlight: true
  };

  @Input()
  displayFormat = 'MM/DD/YYYY';

  @Input()
  valueFormat = 'YYYY-MM-DD';

  @Input()
  options: DatepickerOptions = {};

  constructor(private renderer2: Renderer2, private elementRef: ElementRef) {
    if (!$) {
      throw new Error('JQuery is necessary when using this component.');
    }
    if (!$.fn.datepicker) {
      throw new Error('bootstrap-datepicker is necessary when using this component.');
    }
  }

  ngOnInit(): void {}

  ngOnChanges(changes: SimpleChanges): void {
    throw new Error('Method not implemented.');
  }

  ngAfterViewInit(): void {
    this.renderer2.addClass(this.elementRef.nativeElement, 'input-group');
    this.renderer2.addClass(this.elementRef.nativeElement, 'input-daterange');
    $(this.elementRef.nativeElement)
      .each(() => {
        // $((this.elementRef.nativeElement as HTMLDocument).getElementsByClassName('start')).datepicker();
        // $((this.elementRef.nativeElement as HTMLDocument).getElementsByClassName('end')).datepicker();
      })
      .datepicker(Object.assign(this.defaultOptions, this.options));
    // $((this.elementRef.nativeElement as HTMLDocument).getElementsByClassName('start')).bind('changeDate', (e: any) => {
    //   console.log(e);
    // });
    // $((this.elementRef.nativeElement as HTMLDocument).getElementsByClassName('end')).bind('changeDate', (e: any) => {
    //   console.log(e);
    // });
  }

  ngOnDestroy(): void {
    $(this.elementRef.nativeElement).remove();
  }
}
