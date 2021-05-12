console.log(process.argv);


var operacao = process.argv[2];
var num1 = parseInt(process.argv[3]);// parseInt converte texto para numero, antes o resultado estava dando 43, pq estava juntando os numeros e considerando texto;
var num2 = parseInt(process.argv[4]);// ai faz a soma de dois numeros e nao dois textos, ai da a soma correta que e 7;
var resultado = 0;


switch(operacao) {
    case "soma":
        resultado = num1 + num2;
        break;
    case "subtracao":
        resultado = num1 - num2;
        break;
    case "multiplicacao":
        resultado = num1 * num2;
        break;
    case "divisao":
        resultado = num1 / num2;
        break;
    case "porcentagem":
        resultado = num1 * num2 / 100;
        break;
    case "resto":
        resultado = num1 % num2;
        break;
    default: // defaut é para caso nao entre nenhum resultado.
    resultado = 0;
     
}


console.log(resultado);