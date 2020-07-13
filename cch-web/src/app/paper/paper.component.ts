import { Component, OnInit, AfterViewInit } from '@angular/core';
import * as ClassicEditor from '@ckeditor/ckeditor5-build-classic';
import { ChangeEvent } from '@ckeditor/ckeditor5-angular';
import { Subject, interval } from 'rxjs';
import { switchMap, take, debounceTime } from 'rxjs/operators'
import { DomSanitizer } from '@angular/platform-browser';

@Component({
    selector: 'app-paper',
    templateUrl: './paper.component.html',
    styleUrls: ['./paper.component.scss']
})
export class PaperComponent implements OnInit, AfterViewInit {

    public editor = ClassicEditor;

    public disabled: boolean = false;

    private changeSubject: Subject<any> = new Subject<any>();

    public data: any = null;

    constructor(private sanitized: DomSanitizer) { }

    ngOnInit(): void {

    }

    ngAfterViewInit(): void {
        this.changeSubject.pipe(
            debounceTime(500)
        ).subscribe(res => {
            console.log(res);
            this.data = this.sanitized.bypassSecurityTrustHtml(res as string)
        }, err => console.log(err));
    }

    public onChange({ editor }: ChangeEvent) {
        this.changeSubject.next(editor.getData());
    }

}
