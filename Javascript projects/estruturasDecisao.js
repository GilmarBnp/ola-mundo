var a = 10;
var b = 8;
if (a > b) {// condicao a ser executada caso seja verdadeiro
    console.log("a maior do que b");}
    else if (a < b) {// senao,  executa o codigo a baixo
    console.log("b maior que a");}
    else {console.log("a é igual a b");}

    if (a > b) {console.log("a maioor quee bb");          

} console.log("sempre executar");

var c =40;
var d =30;
if (c >= d) {
    console.log("c maior ou igual a d");
}

if (d <= c) {
    console.log("d menor ou igual a c");
}


var e = 10;
var f = 10;

if (e === f) {
    console.log("e é igual a f");
}

var g = 10;
var h = 11;
if (g != h) {
    console.log ("g diferente de h");
}

 
var i = 4;
var j = 4;
var k = 5;
var l = 7;
if ((i > j) && (l > k)) {// com o && (and) os dois lados tem que ser verdadeiro;
    console.log ("I maior que j");
}
if ((i === j) || (k === l)) {// || (or) dessa afirmação é ou, basta um dos lados ser verdadeiro;
    console.log ("um dos dois eram validos");
if (k === 5) {console.log ("k igual a 5");}
}


var fruta = "melao"
var valor = 0
if (fruta ==="banana") {
    valor = 2;}
    else if (fruta === "maça") {
        valor = 3;} 
    else if (fruta === "abacaxi") {
        valor = 4;}
    else if (fruta === "melao") {
        valor = 5;}
    else if (fruta === "mamao") {
        valor = 5.50;}
    else { // se nao for nenhuma das frutas
        valor = 10;
    } 
    console.log("valor da fruta = "  + valor);
    
    
switch(fruta) {
    case "banana":
        valor = 2;
        // pode ter varios codigos, ex console.log, case é igual a caso;
        break;
    case "maça":
        valor = 3;
        break; // se não colocar o break ele sai executando todos;
    case "abacaxi":
        valor = 4;
    break;
    case "melao":
        valor = 5
        break;
    case "mamao":
        valor = 5.50
        break; // cada case como se fosse um else if, "e se"
default: valor = 10; // equivalente a else, se nao for nenhum; não precisa 
    }
    console.log("valor switch: " + valor);


var x = 10;
var y = 2;
var resultado = ""
if (x > y) {"resultado = x maior que y";
} else { 
    resultado = "senao";
}
console.log(resultado)

resultado = x > y ? "x maior que y" : "se não"; // : equivale a se nao ou else
console.log(resultado);

