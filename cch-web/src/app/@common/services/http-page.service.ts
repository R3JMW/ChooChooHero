import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class HttpPageService {

    constructor(private http: HttpClient) { }

    /**
     * Get page list with pagination information
     * @param pager 
     * @param size 
     */
    public getPagesWithPagination(pager: number = 0, size: number = 10): Observable<any> {
        // return this.http.get<any>(`/content?pager=${pager}&size${size}`);
        return this.http.get<any>(`assets/data/mock-page.json`);
    }

    /**
     * Get full page information by page id
     * @param id 
     */
    public getPageById(id: number): Observable<any> {
        return this.http.get<any>(`/content/${id}`);
    }
}
