
for (var i = 0; i < 10; i++) {
    console.log(i);
}


var carros = ["gol", "palio", "uno", "celta", "argo"];
for (var i = 0; i < carros.length; i++) {
    //console.log(carros[i]);
}
for (var i = carros.length -1; i >= 0; i--) {
    console.log(carros[i]);
}
// o menos 1 para comecar apartir do celta e o i-- para começar de tras para frente e i++ da frente para trás; 

// usa length para não ficar precisando trocar o numero da variavel, ex 10 para 11 sempre que adicionar um elemento novo, tipo carro;

// o i >=0 porque nao vai passar da palavra "gol" o gol é considerado 0, palio 1, uno 2...;


var i = 0;// while faz a mesma coisa que for, carros.lenght é a comparação da varialvel carros;
//se colocar var i = 10 nao vai impremir nada, porque o tamanho do array carros é 5, do 0 a 4;
//se nao colocar o i++ ele fica travado no 0
while(i < carros.length) {
    //console.log(carros[i])
    i++;
}

//while(true) {console.log("ola")}; //while true cria um laço infinito;

//nao precisa mais declarar variavel i;
while (i < 10){
    //console.log(i);
i++
}


var i = 0;
while (i < carros.length) {
    console.log(carros[i]);
    if (carros[i] === "uno") {
    //console.log("encontrei o uno");
    break;
}
i++;

}


var numeros = [1 , 2 , 3 , 4 , 5 , 6,  7 , 8 , 9 , 10];
var i = 0;
while (i < numeros.length) {
   var num = numeros[i];
    i++;

    if (num % 2 === 0) {
        console.log(num + " é par");
    continue
    }
    
    console.log(num + " é impar");
}
// é pra executar pelo menos uma vez

var j = 0;
do {
    j++ 
    console.log(j);
} while (j < 10);



for (var carro of carros) {// of pega a variavel carro;
    console.log(carro);
}

for (var i = 0; i < carros.length; i++) {
    console.log(carros[i]);
}












