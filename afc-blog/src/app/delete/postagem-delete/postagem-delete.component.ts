import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Posts } from 'src/app/model/Posts';
import { PostagemService } from 'src/app/service/postagem.service';
import { environment } from 'src/environments/environment.prod';

@Component({
  selector: 'app-postagem-delete',
  templateUrl: './postagem-delete.component.html',
  styleUrls: ['./postagem-delete.component.css']
})
export class PostagemDeleteComponent implements OnInit {
  postagem: Posts = new Posts()
  idPost: number


  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private postagemService: PostagemService
  ) { }

  ngOnInit(){

    window.scroll(0,0)

    if(environment.token==''){
       this.router.navigate(['/login'])
     }
     
     this.idPost = this.route.snapshot.params['id']
     this.findByIdPostagem(this.idPost)
  }

  findByIdPostagem(id: number){
    this.postagemService.getByIdPosts(id).subscribe((resp: Posts)=>{
      this.postagem = resp
    })
  }

  apagar(){
    this.postagemService.deletePosts(this.idPost).subscribe(()=>{
      alert('Postagem apagada com sucesso!')
      this.router.navigate(['/home'])
    })
  }
}
