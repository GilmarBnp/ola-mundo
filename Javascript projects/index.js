console.log("hello world no arquivo externo!");
document.write("texto qualquer");

//DOM - Document Objectc Model 
function clickBotao() {
    document.getElementById("Paragrafo2").innerHTML ="Texto alterado com sucesso";
    //document.getElementById("Paragrafo2").style.display = "none";
    
    for (var i = 0; i < document.getElementsByClassName("paragrafo").length; i++){
        document.getElementsByClassName("paragrafo") [i].style.color = "blue";
        document.getElementsByClassName("paragrafo") [i].style.fontWeight = "bold";
    }
}

function clickBotao2() {
    //document.getElementById("Paragrafo2").innerHTML ="Texto alterado comsucesso";
    document.getElementById("Paragrafo2").style.display = "block";
    var botoes = document.getElementsByTagName("button");
    //for (var i = 0; i < document.getElementsByTagName("button").length; i++){
    //document.getElementsByTagName("button") [i].style.backgroundColor = "gray"
    var i = 0;
    while (i < botoes.length) {
        botoes[i].style.fontSize = "20px"; 
        i++;
        
    }
}
var quantidadeElementos = 0;
function adicionarElemento() {
    var elemento = document.createElement("p");
    elemento.innerHTML = "elemento" + quantidadeElementos;
    quantidadeElementos++;
    document.getElementById("div-elementos").appendChild(elemento); 
  
}
function removerElemento() {
    
    var filhos = document.getElementById("div-elementos").childNodes; 
    var size = filhos.length;
    for (var i = 0; i < size; i++) {
    document.getElementById("div-elementos").removeChild(filhos[0]);
  
}
 
}


  function ligarLampada() {
    document.getElementById("lampada").src = "lampada-ligada-26249.jpg";
}

function desligarLampada() {
    document.getElementById("lampada").src = "lampada-led-esquenta-lampada-incandescente-40w.jpg";
}






