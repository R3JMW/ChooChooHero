import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const HTTP_URL = {
    LOGIN: '/auth/login',
    REGISTER: '/auth/register',
};

@Injectable({
    providedIn: 'root'
})
export class HttpUserService {

    constructor(private http: HttpClient) { }

    public login(userName: string, userPassword: string): Observable<any> {
        const user: {} = {
            userName,
            userPassword
        }
        return this.http.post<any>(`${HTTP_URL.LOGIN}`, user);
    }
}
