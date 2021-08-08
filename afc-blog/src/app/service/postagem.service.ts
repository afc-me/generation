import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Posts } from '../model/Posts';

@Injectable({
  providedIn: 'root'
})
export class PostagemService {

  constructor(private http: HttpClient) { }

  token = {
    headers: new HttpHeaders().set('Authorization', environment.token)
  }

  getAllPosts(): Observable<Posts[]>{
    return this.http.get<Posts[]>('http://localhost:8080/posts', this.token)
  }

  postPosts(posts: Posts): Observable<Posts>{
    return this.http.post<Posts>('http://localhost:8080/posts', posts, this.token)
  }

}
