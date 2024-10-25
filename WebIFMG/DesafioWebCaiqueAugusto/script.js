const form = document.getElementById('form');
const username = document.getElementById("username");
const email = document.getElementById("email");
const password = document.getElementById("password");
const passwordConfirmation = document.getElementById("password-confirmation");

form.addEventListener("submit",(event) =>{
    event.preventDefault();

    checkForm();
    
})

username.addEventListener("blur",() =>{
    checkInputUsername();
})

email.addEventListener("blur",() =>{
    checkInputEmail();
})

password.addEventListener("blur",() =>{
    checkInputPassword();
})

passwordConfirmation.addEventListener("blur",() => {
    checkInputPasswordConfirmation();
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

function checkInputPassword(){
    if(password.value===""){
        errorInput(password,"A senha é obrigatória!");
    }else if(password.value.length < 8){
        errorInput(password,"A senha precisa ter no mínimo 8 caracteres!")
    }else{
        password.parentElement.className = "form-content";
    }
}

function checkInputPasswordConfirmation(){
    if(passwordConfirmation.value===""){
        errorInput(passwordConfirmation,"A confirmação de senha é obrigatória!");
    }else if(passwordConfirmation.value!=password.value){
        errorInput(passwordConfirmation,"As senhas não conferem");
    }else{
        passwordConfirmation.parentElement.className = "form-content";
    }
}

function checkForm(){
    checkInputUsername();
    checkInputPassword();
    checkInputEmail();
    checkInputPasswordConfirmation();

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
