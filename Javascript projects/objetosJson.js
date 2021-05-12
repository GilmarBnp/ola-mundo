var pessoa = {
     nome: "João", //pode ser com aspass ou não;
     idade: 40,
     telefone: "(99) 99999-9999",
     temCarro: true,
     animaisDeEstimacao: [// Array de string;
        "toto",
        "bob"
     ],
     pai: { //um objeto;
        nome: "jose",
        idade: "68",
     }
    };  

//console.log(pessoa);

//console.log(pessoa.nome); //para imprimir apenas o nome do objeto "pessoa";

//console.log(pessoa.pai);

console.log(pessoa.pai.nome);

pessoa.animaisDeEstimacao.push("billy");//adicionar coisas no array animais de estimacao;

//pessoa.nome= pessoa.nome + " Silva";
//pessoa.nome += " Silva";
//console.log(pessoa);


//pessoa.mae= "Maria";// adicionar ao array;
pessoa.mae = {
    nome: "Maria",
    idade: "66",//como objeto Json;
}

console.log(JSON.stringify(pessoa));// converter Json em string;

//function salvarDadosPessoa(nome, idade, telefone, tem carro, animaisDeEstimacao) {} ou;
    
    //salvarDadosPessoa(pessoa);//so esta imprimindo, nao esta salvando de verdade;

    function salvarDadosPessoa(pessoa) {
    //console.log(pessoa);
   
}




