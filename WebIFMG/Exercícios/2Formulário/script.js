const form = document.getElementById('form');
const username = document.getElementById("username");
const email = document.getElementById("email");
const mensagem = document.getElementById("mensagem");





form.addEventListener("submit",(event) =>{
    event.preventDefault();

    checkForm();
    
})

form.addEventListener('keypress',function(event){
    if(event.key==='Enter'){
        event.preventDefault();

        checkForm();
    }
})

username.addEventListener("blur",() =>{
    checkInputUsername();
})

email.addEventListener("blur",() =>{
    checkInputEmail();
})

mensagem.addEventListener("blur",() =>{
    checkInputmensagem();
})



function checkInputUsername(){
    if(username.value===""){
        //mostrar o aviso e mostrar a mensagem de erro
        errorInput(username,"Preencha um username!")
    }else{
        username.parentElement.className = "form-content";
    }
}

function checkInputEmail(){

    if(email.value===""){
        errorInput(email,"O email é obrigatório!");
    }else{
        email.parentElement.className = "form-content";
    }

}

function checkInputMensagem(){
    if(mensagem.value===""|mensagem.value==="Escreva aqui sua mensagem"){
        errorInput(mensagem,"A mensagem é obrigatória!");
    }else if(mensagem.value.length < 8){
        errorInput(mensagem,"A mensagem precisa ter no mínimo 8 caracteres!")
    }else{
        mensagem.parentElement.className = "form-content";
    }
}



function checkForm(){
    checkInputUsername();
    checkInputMensagem();
    checkInputEmail();
    checkInputmensagemConfirmation();

    const formItems = form.querySelectorAll(".form-content");

    const isValid = [...formItems].every((item)=>{
        return item.className === "form-content"
    });

    if(isValid){
        alert("Formulário enviado com sucesso!");
    }else{
        alert("Preencha todos os campos corretamente!");
    }
}

function errorInput(input,message){
    const formItem = input.parentElement;
    const textMessage = formItem.querySelector("a");

    textMessage.innerText = message;

    formItem.className = "form-content error";
}
