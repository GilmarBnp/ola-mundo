function multiplicacao(p1, p2) {
    console.log("function multiplicacao executada");
    var resultado = p1 * p2
    return resultado;

}

var resultado = multiplicacao(4, 3);
console.log("resultado = " + resultado);

console.log(multiplicacao(45, 2));


// saudacao é o nome da variavel e (nome) é a propria variavel
function saudacao(nome) {
    console.log("Olá " +  nome  +  " seja bem vindo!")
     
}
saudacao("Gilmar");



function funcaoSemParametro() {
    var a = 10; // as variaveis so tem vida dentro do parametro da funcao {};
    var b = 2;
    console.log(a * b);
}

funcaoSemParametro()





