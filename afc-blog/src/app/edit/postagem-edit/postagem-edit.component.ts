import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Posts } from 'src/app/model/Posts';
import { Tema } from 'src/app/model/Tema';
import { PostagemService } from 'src/app/service/postagem.service';
import { TemaService } from 'src/app/service/tema.service';
import { environment } from 'src/environments/environment.prod';

@Component({
  selector: 'app-postagem-edit',
  templateUrl: './postagem-edit.component.html',
  styleUrls: ['./postagem-edit.component.css']
})
export class PostagemEditComponent implements OnInit {
  postagem: Posts = new Posts()
  tema: Tema = new Tema()
  listaTemas: Tema[]
  idTema: number

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private postagemService: PostagemService,
    private temaService: TemaService
  ) { }

  ngOnInit(){

    window.scroll(0,0)

    if(environment.token==''){
       this.router.navigate(['/login'])
     }
     
     let id = this.route.snapshot.params['id']
     this.findByIdPostagem(id)
     this.findAllTemas()
  }

  findByIdPostagem(id: number){
    this.postagemService.getByIdPosts(id).subscribe((resp: Posts)=>{
      this.postagem = resp
    })
  }

  findByIdTema(){
    this.temaService.getByIdTema(this.idTema).subscribe((resp: Tema)=>{
      this.tema = resp
    })
  }

  findAllTemas(){
    this.temaService.getAllTema().subscribe((resp: Tema[])=>{
      this.listaTemas = resp
    })
  }

  atualizar(){
    this.tema.id = this.idTema
    this.postagem.tema = this.tema

    this.postagemService.putPosts(this.postagem).subscribe((resp: Posts)=>{
      this.postagem = resp
      alert('Postagem atualizada com sucesso!')
      this.router.navigate(['/home'])
    })
  }

}
