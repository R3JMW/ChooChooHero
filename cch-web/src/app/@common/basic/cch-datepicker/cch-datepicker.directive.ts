import {
  Directive,
  ElementRef,
  OnInit,
  AfterViewInit,
  Input,
  OnDestroy,
  OnChanges,
  SimpleChanges,
  Provider,
  forwardRef,
  Output,
  EventEmitter,
  Renderer2
} from '@angular/core';
import * as moment from 'moment';
import { ControlValueAccessor, NG_VALUE_ACCESSOR } from '@angular/forms';
import { fromEvent } from 'rxjs';

const SELECT_VALUE_ACCESSOR: Provider = {
  provide: NG_VALUE_ACCESSOR,
  useExisting: forwardRef(() => CchDatepickerDirective),
  multi: true
};
@Directive({
  selector: 'input[cch-datepicker]',
  providers: [SELECT_VALUE_ACCESSOR]
})
export class CchDatepickerDirective implements OnInit, AfterViewInit, OnChanges, OnDestroy, ControlValueAccessor {
  private onChange: any;

  private onTouched: any;

  public disabled: boolean;

  @Output('show')
  show: EventEmitter<any> = new EventEmitter<any>();

  @Output('hide')
  hide: EventEmitter<any> = new EventEmitter<any>();

  @Output('clearDate')
  clearDate: EventEmitter<any> = new EventEmitter<any>();

  @Output('changeDate')
  changeDate: EventEmitter<any> = new EventEmitter<any>();

  @Output('changeMonth')
  changeMonth: EventEmitter<any> = new EventEmitter<any>();

  @Output('changeYear')
  changeYear: EventEmitter<any> = new EventEmitter<any>();

  @Output('changeDecade')
  changeDecade: EventEmitter<any> = new EventEmitter<any>();

  @Output('changeCentury')
  changeCentury: EventEmitter<any> = new EventEmitter<any>();

  private defaultOptions: DatepickerOptions = {
    format: {
      toDisplay: date => {
        return moment(date).format(this.displayFormat);
      },
      toValue: date => {
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
  options: DatepickerOptions;

  constructor(private elementRef: ElementRef, private renderer2: Renderer2) {
    if (!$) {
      throw new Error('JQuery is necessary when using this component');
    }
    if (!$.fn.datepicker) {
      throw new Error('bootstrap-datepicker is necessary when using this component');
    }
  }
  ngOnInit(): void {}

  ngOnChanges(changes: SimpleChanges): void {
    throw new Error('Method not implemented.');
  }

  ngAfterViewInit(): void {
    $(this.elementRef.nativeElement).datepicker(Object.assign(this.defaultOptions, this.options));

    // Init Events
    fromEvent($(this.elementRef.nativeElement), 'show').subscribe((event: JQuery.Event) => this.onShow(event));
    fromEvent($(this.elementRef.nativeElement), 'hide').subscribe((event: JQuery.Event) => this.onHide(event));
    fromEvent($(this.elementRef.nativeElement), 'changeDate').subscribe((event: JQuery.Event) =>
      this.onChangeDate(event)
    );
  }

  ngOnDestroy(): void {
    $(this.elementRef.nativeElement).remove();
  }

  writeValue(obj: any): void {
    $(this.elementRef.nativeElement).datepicker('update', obj);
  }

  registerOnChange(fn: any): void {
    this.onChange = fn;
  }

  registerOnTouched(fn: any): void {
    this.onTouched = fn;
  }

  setDisabledState?(isDisabled: boolean): void {
    this.disabled = isDisabled;
  }

  private onShow(event: JQuery.Event) {
    this.onTouched();
    this.show.emit(event);
  }

  private onHide(event: JQuery.Event) {
    this.hide.emit(event);
  }

  private onClearDate(event: JQuery.Event) {
    this.clearDate.emit(event);
  }

  private onChangeDate(event: any) {
    this.onTouched();
    this.onChange(moment(event.date).format(this.valueFormat));
    this.changeDate.emit(event);
  }
}
