let nome = document.querySelector('#nome')
let email = document.querySelector('#email')
let review = document.querySelector('#review')
let file = document.querySelector('#file')
let enviar = document.querySelector('#enviar')

nome.style.width = '100%'
email.style.width = '100%'

function validaNome(){
    let txtNome = document.querySelector('#txtNome')
    if(nome.value.length < 3){
        txtNome.innerHTML ='Nome Inválido'
        txtNome.style.color = 'red'
    }
    else{
        txtNome.innerHTML='Nome Válido'
        txtNome.style.color="purple"
    }
}

function validaEmail(){
    let txtEmail = document.querySelector('#txtEmail')
    if(email.value.indexOf('@') == -1 ||email.value.indexOf('.com') == -1 ){
        txtEmail.innerHTML= 'E-mail Inválido'
        txtEmail.style.color = 'red'
    }
    else{
        txtEmail.innerHTML='E-mail Válido'
        txtEmail.style.color="purple"
    }
}

function validaReview(){
    let txtReview = document.querySelector('#txtReview')
    if(review.value.length < 10){
        txtReview.innerHTML ='Caracteres Insuficientes'
        txtReview.style.color = 'red'
    }
    else{
        txtReview.innerHTML=' '
    }
}
