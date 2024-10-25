const form = document.getElementById('form');
const username = document.getElementById("username");
const age = document.getElementById("age");
const number1 = document.getElementById("number1");
const number2 = document.getElementById("number2");
const concatenatePhrase = document.getElementById("concatenate");
const sum = document.getElementById("sum");

function concatenate(){
    checkConcatenate();
}

function sumNumbers(){
    checkSum();
}

function checkInputNumber1(){
    if(number1.value===""){
        //mostrar o aviso e mostrar a mensagem de erro
        errorInput(number1,"Preencha com um número!")
    }else{
        number1.parentElement.className = "form-content";
    }
}

function checkInputNumber2(){
    if(number2.value===""){
        //mostrar o aviso e mostrar a mensagem de erro
        errorInput(number2,"Preencha com um número!")
    }else{
        number2.parentElement.className = "form-content";
    }
}

function checkInputUsername(){
    if(username.value===""){
        //mostrar o aviso e mostrar a mensagem de erro
        errorInput(username,"Preencha um username!")
    }else{
        username.parentElement.className = "form-content";
    }
}


function checkInputUsername(){
    if(username.value===""){
        //mostrar o aviso e mostrar a mensagem de erro
        errorInput(username,"Preencha um username!")
    }else{
        username.parentElement.className = "form-content";
    }
}



function checkInputAge(){
    if(age.value===""){
        errorInput(age,"A idade é obrigatória!");
    }else{
        age.parentElement.className = "form-content";
    }
}



function checkConcatenate(){
    checkInputUsername();
    checkInputAge();
    

    const formItems = form.querySelectorAll(".info .form-content");
    console.log(formItems);
    
    const isValid = [...formItems].every((item)=>{
        return item.className === "form-content"
    });

    if(isValid){
        alert("Concatenação sucedida!");
        concatenatePhrase.innerText = `Seu nome é ${username.value} e você tem ${age.value} anos!`;
        concatenatePhrase.className = "concatenate";
    }else{
        alert("Preencha todos os campos corretamente!");
        concatenatePhrase.className = "concatenate error"
    }
}

function checkSum(){
    checkInputNumber1();
    checkInputNumber2();
    

    const formItems = form.querySelectorAll(".numeros .form-content");
    console.log(() =>{
        formItems.values
    });

    const isValid = [...formItems].every((item)=>{
        return item.className === "form-content"
    });

    if(isValid){
        alert("Soma sucedida!");
        const newsum = parseFloat(number1.value)  + parseFloat(number2.value) ;
        sum.innerText = `A soma dos números é: ${newsum}`;
        sum.className = "sum";
    }else{
        alert("Preencha todos os campos corretamente!");
        sum.className = "sum error"
    }
}

function errorInput(input,message){
    const formItem = input.parentElement;
    const textMessage = formItem.querySelector("a");

    textMessage.innerText = message;

    formItem.className = "form-content error";
}
