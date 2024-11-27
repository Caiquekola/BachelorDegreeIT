const form = document.getElementById('form');
const username = document.getElementById("username");
const email = document.getElementById("email");
const mensagem = document.getElementById("mensagem");
const button = document.getElementById("button");


const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;


form.addEventListener("submit", (event) => {
    event.preventDefault();

    checkForm();

})

form.addEventListener('keypress', function (event) {
    if (event.key === 'Enter') {
        event.preventDefault();

        checkForm();
    }
})

username.addEventListener("blur", () => {
    checkInputUsername();
})

email.addEventListener("blur", () => {
    checkInputEmail();
})

mensagem.addEventListener("blur", () => {
    checkInputMensagem();
})
//Se a mensagem for clicada na primeira vez então apague o texto
mensagem.addEventListener("click",() =>{
    if(mensagem.value.trim()==="Escreva aqui sua mensagem"){
        mensagem.value="";
    }
})
//Adicionar mouseleave retornando a mensagem caso esteja vazia
mensagem.addEventListener("mouseleave",()=>{
    if(mensagem.value.trim()===""){
        mensagem.value = "Escreva aqui sua mensagem";
    }
})

//Adicionando efeito ao botão cadastrar via javascript
button.addEventListener("mouseenter",()=>{
    button.style.background = "linear-gradient(20deg, #0a9396 0%, #94d2bd 100%)";
    button.style.transform = "scale(1.03)"
})

button.addEventListener("mouseleave",()=>{
    button.style.background = "linear-gradient(20deg, #0a9396 0%, #0a9396 100%)";
    button.style.transform = "scale(1.00)"

})



function checkInputUsername() {
    if (username.value === "") {
        //mostrar o aviso e mostrar a mensagem de erro
        errorInput(username, "Preencha um username!")
    } 
    else if(username.value < 3){
        errorInput(username,"Mínimo 3 Caracteres")
    }
    else {
        username.parentElement.className = "form-content";
    }
}

function checkInputEmail() {

    const emailValue = email.value.trim();

    if (emailValue === "") {
        errorInput(email, "O email é obrigatório!");
    } else if (!regex.test(emailValue)) {
        errorInput(email,"Insira um email válido  ex: email@exemplo.com")
    } else {
        email.parentElement.className = "form-content";
    }

}

function checkInputMensagem() {
    if (mensagem.value === "" | mensagem.value === "Escreva aqui sua mensagem") {
        errorInput(mensagem, "A mensagem é obrigatória!");
    } else if (mensagem.value.length < 10) {
        errorInput(mensagem, "A mensagem precisa ter no mínimo 10 caracteres!")
    } else {
        mensagem.parentElement.className = "form-content";
    }
}



function checkForm() {
    checkInputUsername();
    checkInputMensagem();
    checkInputEmail();

    const formItems = form.querySelectorAll(".form-content");

    const isValid = [...formItems].every((item) => {
        return item.className === "form-content"
    });

    if (isValid) {
        alert("Formulário enviado com sucesso!");
    } else {
        alert("Preencha todos os campos corretamente!");
    }
}

function errorInput(input, message) {
    const formItem = input.parentElement;
    const textMessage = formItem.querySelector("a");

    textMessage.innerText = message;

    formItem.className = "form-content error";
}


console.log(regex.test("email@exemplo.com")); // true
console.log(regex.test(" email@exemplo.com ")); // false (devido aos espaços)
console.log(regex.test("email@.com")); // false
console.log(regex.test("email@exemplo")); // false
console.log(regex.test("email@exemplo.com.br"));