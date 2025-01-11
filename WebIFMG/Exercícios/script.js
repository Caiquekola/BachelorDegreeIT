function make(){
    document.getElementById('btn').style.display = 'none';
    document.getElementById('btn2').innerHTML = pessoa.imprimir();

}

const pessoa = {
    nome : "Caique",
    imprimir : function (){
        return this.nome;
    }
};

const myElement = document.getElementById("demo");

function getLocation() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(showPosition);
  } else {
    myElement.innerHTML = "Geolocation is not supported by this browser.";
  }
}

function showPosition(position) {
  myElement.innerHTML = "Latitude: " + position.coords.latitude +
  "<br>Longitude: " + position.coords.longitude;
}