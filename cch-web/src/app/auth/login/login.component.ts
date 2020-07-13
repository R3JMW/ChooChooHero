import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { HttpUserService } from 'src/app/@common/services/http-user.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

    public form: FormGroup;

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private formBuilder: FormBuilder,
        private httpUser: HttpUserService
    ) {
        this.form = this.formBuilder.group({
            userName: ['', Validators.required],
            userPassword: ['', Validators.required]
        });
    }

    ngOnInit(): void {

    }

    public login(): void {
        if (!this.form.errors) {
            const { userPassword, userName } = this.form.getRawValue();
            this.httpUser.login(userName, userPassword).subscribe(
                res => this.router.navigate([this.route.snapshot.params.url || '/home'], { ...this.route.snapshot.params.init }),
                err => { },
                () => { }
            );
        }
    }

}
