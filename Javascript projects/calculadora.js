console.log(process.argv);


var operacao = process.argv[2];
var num1 = parseInt(process.argv[3]);// parseInt converte texto para numero, antes o resultado estava dando 43, pq estava juntando os numeros e considerando texto;
var num2 = parseInt(process.argv[4]);// ai faz a soma de dois numeros e nao dois textos, ai da a soma correta que e 7;
var resultado = 0;

if (operacao === "soma") {
    resultado = num1 + num2;
}
else if (operacao === "subtracao") {// so if ele compara todas as variaveis, com else if so compara se a primeira nao for verdadeira, ai fica melhor para economizar processamento;
    resultado = num1 - num2;
}
else if (operacao === "multiplicacao") {
    resultado = num1 * num2;
}
else if (operacao === "divisao") {
    resultado = num1 / num2;
}
else if (operacao === "resto") {
    resultado = num1 % num2;
}
else if (operacao === "porcentagem") {
    resultado = num1 * num2 / 100;
}


console.log(resultado);