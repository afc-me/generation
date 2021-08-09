import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { Posts } from '../model/Posts';
import { Tema } from '../model/Tema';
import { User } from '../model/User';
import { AuthService } from '../service/auth.service';
import { PostagemService } from '../service/postagem.service';
import { TemaService } from '../service/tema.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  postagem: Posts = new Posts()
  listaPosts: Posts[]

  listaTemas: Tema[]
  idTema: number
  tema: Tema = new Tema()
  user: User = new User()
  idUser = environment.id

  nome = environment.nome
  foto = environment.foto
  usuario = environment.usuario

  constructor(
    private router: Router,
    private postagemService: PostagemService,
    private temaService: TemaService,
    private authService: AuthService
  ) { }

  ngOnInit() {
    
    if(environment.token==''){
     // alert('Sua seção expirou, faça login novamente.')
      this.router.navigate(['/login'])
    }
    this.getAllTemas()
    this.getAllPosts()
    console.log(this.findByIdUser())
  }

  getAllTemas(){
    this.temaService.getAllTema().subscribe((resp: Tema[])=>{
      this.listaTemas = resp
    })
  }

  findByIdTema(){
    this.temaService.getByIdTema(this.idTema).subscribe((resp: Tema)=>{
      this.tema = resp
    })
  }

  getAllPosts(){
    this.postagemService.getAllPosts().subscribe((resp: Posts[])=>{
      this.listaPosts = resp
    })
  }

  findByIdUser(){
    this.authService.getByIdUser(this.idUser).subscribe((resp: User)=>{
      this.user = resp
    })
  }

  publicar(){
    this.tema.id = this.idTema
    this.postagem.tema = this.tema

    this.user.id = this.idUser
    this.postagem.usuario = this.user

    console.log(this.postagem)

    this.postagemService.postPosts(this.postagem).subscribe((resp: Posts)=>{
      this.postagem = resp
      alert('Postagem realizada com sucesso!')
      this.postagem = new Posts()
      this.getAllPosts()
    })
  }
}
