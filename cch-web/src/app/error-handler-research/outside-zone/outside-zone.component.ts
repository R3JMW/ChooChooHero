import { Component, OnInit, NgZone, HostListener } from '@angular/core';

@Component({
  selector: 'app-outside-zone',
  templateUrl: './outside-zone.component.html',
  styleUrls: ['./outside-zone.component.scss']
})
export class OutsideZoneComponent implements OnInit {
  constructor(private ngZone: NgZone) {}

  ngOnInit(): void {}

  public onCall(): void {
    this.ngZone.runOutsideAngular(() => {
      const notAFunction = null;
      this.ngZone.run(() => notAFunction());
    });
  }

  @HostListener('window:error', ['$event'])
  onWindowErrorHandler(event: ErrorEvent): void {
    console.error(event);
    // window.onerror = (message, source, lineno, colno, error) => {
    //   console.error(message, source, lineno, colno, error);
    // };
    // window.addEventListener('error', () => console.error(message, source, lineno, colno, error));
  }
}
