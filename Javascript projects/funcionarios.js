// else = se não;
//if = se;
//JSON.parse = converte texto em json;
//criar uma variavel para os funcionarios;
//.funcionarios para pegar o array "funcionarios" dentro do funcionarios.json;




var fs = require("fs");
var arquivo = "funcionarios.json";
var setor   = '"Comercial"';

fs.readFile(arquivo, "utf-8", function (err, data) {
    if (err){
        console.log(err);
    } else {
        var objFunc = JSON.parse(data);

        nomeMaiorSalario (objFunc);
        nomeMenorSalario (objFunc);
        mediaSalario(objFunc);
        maiorMenorMediaPorSetor (objFunc,setor)
    }
});


function nomeMaiorSalario (p1) {
     //  Função que retorna o nome do funcionário que tem o maior salário da empresa.
     // i++ para percorrer toda tabela array
 
    var maior = p1.funcionarios[0].salario;
    var nome = p1.funcionarios[0].nome;

    for ( var i = 0; i < p1.funcionarios.length; i++) {
        if (p1.funcionarios[i].salario > maior) {
        maior = p1.funcionarios[i].salario;
        nome = p1.funcionarios[i].nome;
        }
    };
    console.log("Funcionario com maior salario: " + nome + " " + maior);
};

function nomeMenorSalario (p1) {
    //  Função que retorna o nome do funcionário que tem o menor salário da empresa.

    var menor = p1.funcionarios[0].salario;
    var nome = p1.funcionarios[0].nome;

    for ( var i = 0; i < p1.funcionarios.length; i++) {
        if (p1.funcionarios[i].salario < menor) {
        menor = p1.funcionarios[i].salario;
        nome = p1.funcionarios[i].nome;
        }
    };
    console.log("Funcionario com menor salario: " + nome + " " + menor);
};

function mediaSalario (p1) {
    //  Função que retorna a média salarial dos funcionários
    var media = 0
    var soma = 0;
    
    for ( var i = 0; i < p1.funcionarios.length; i++) {
        soma += p1.funcionarios[i].salario
    };
    media = soma / i;
    console.log("Media Salarial = " + media + " de " + i + "funcionários");
};

function maiorMenorMediaPorSetor (p1, p2) {
    //   Função que retorna o nome do funcionário com maior salário do setor
    //   retorna o nome do funcionário com menor salário do setor e 
    //   retorna a média de salário do setor. (tudo junto e misturado)

    var somaSalario  = 0;
    var totalSetor   = 0;
    var mediSalario  = 0;
    var primeiraVez  = true;

    for ( var i = 0; i < p1.funcionarios.length; i++) {

        if (JSON.stringify(p1.funcionarios[i].setor) === p2) {
            if (primeiraVez) {
                var maiorSalario = p1.funcionarios[i].salario;
                var menorSalario = p1.funcionarios[i].salario;
                var nomeMaior    = p1.funcionarios[i].nome;
                var nomeMenor    = p1.funcionarios[i].nome;
                primeiraVez = false;                
            }

            if (p1.funcionarios[i].salario > maiorSalario) {           // calcula maiorSalario
                maiorSalario = p1.funcionarios[i].salario;
                nomeMaior    = p1.funcionarios[i].nome;
            } else if (p1.funcionarios[i].salario < menorSalario){     // Calcula menorSalario
                menorSalario = p1.funcionarios[i].salario;
                nomeMenor    = p1.funcionarios[i].nome;              
            }
            somaSalario += p1.funcionarios[i].salario;                 // Calcula a Média
            totalSetor ++;
        }

    };
    mediaSalario = somaSalario / totalSetor;
    mediaSalario = parseFloat(mediaSalario).toFixed(2);

    console.log("Setor: " + p2 + ". Funcionário com maior salario: " + nomeMaior + " " + maiorSalario);
    console.log("Setor: " + p2 + ". Funcionário com menor salario: " + nomeMenor + " " + menorSalario);
    console.log("Setor: " + p2 + ". Media Salarial = " + mediaSalario + " de " + totalSetor + " funcionários");
};