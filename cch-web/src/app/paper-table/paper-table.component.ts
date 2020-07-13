import { Component, OnInit, ViewChild, ElementRef, AfterViewInit } from '@angular/core';
import { DataTableDirective } from 'angular-datatables';

import { HttpPageService } from '../@common/services/http-page.service';
import { Subject } from 'rxjs';

@Component({
    selector: 'app-paper-table',
    templateUrl: './paper-table.component.html',
    styleUrls: ['./paper-table.component.scss']
})
export class PaperTableComponent implements OnInit, AfterViewInit {

    @ViewChild(DataTableDirective, { static: false })
    private dtElement: DataTableDirective;

    public dtTrigger: Subject<any> = new Subject<any>();

    public dtOptions: DataTables.Settings = {
        // fixedColumns: {
        //     rightColumns: 0
        // },
        // fixedHeader: {
        //     header: true,
        //     headerOffset: 48
        // },
        autoWidth: false,
        dom: 'ftrlip',
        columns: [
            {
                title: 'ID',
                className: 'table-header',
                data: 'id'
            }, {
                title: '标题',
                className: 'table-header',
                name: 'title',
                data: 'title'
            }, {
                title: '作者',
                className: 'table-header',
                name: 'author',
                data: 'author'
            }, {
                title: '状态',
                className: 'table-header',
                name: 'status',
                render: () => {
                    return '';
                }
            }, {
                title: '类型',
                className: 'table-header',
                name: 'contentType',
                data: 'contentType'
            }, {
                title: '',
                className: 'table-header',
                orderable: false,
                render: () => {
                    return `
                        <button>View</button>
                    `;
                }
            }
        ]
    }

    constructor(private httpPageService: HttpPageService) {

    }

    ngOnInit(): void {
    }

    ngAfterViewInit(): void {
        this.httpPageService.getPagesWithPagination().subscribe(
            res => this.draw(res),
            err => console.log(err),
            () => console.log('complete')
        );
    }

    private draw(data: any[]): void {
        this.dtElement.dtInstance.then((api: DataTables.Api) => api.clear().rows.add(data).draw());
    }
}
