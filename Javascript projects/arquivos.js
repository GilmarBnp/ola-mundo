// Fs é um nome qualquer, file sistem;
// writeFileserve para criar um arquivo;
// readFile serve para ler um arquivo;

var fs = require("fs");
var x = null;
var nomeArquivo = "meuArquivo.txt";
if (x) {
    console.log("x tem valor");
} else {
    console.log("x não tem valor")
}

console.log("1");

fs.writeFile(nomeArquivo, "um texto qualquer", function(err){
    if (err !== null) {
        console.log(err);
    } else {
        console.log("arquivo escrito com sucesso");
    // /n é uma quebra de linha;
        fs.appendFile(nomeArquivo, "\nnova linha no texto", function(err) {
            if (err) {
                console.log(err);
            }else {
                // o readFile so vai ler depois que adicionou uma nova linha;
                fs.readFile(nomeArquivo, "utf-8", function(err, data) {
             // fs.readFile("meu arquivo.txt", "utf-8", function(err, data), criou uma variavel para o meu arquivo.txt=nomeArquivo;
                    if (err) {
                        console.log(err);
                    
                    } else {
                        console.log(data);
            }
        })


        
            }
        }) 
        
    }

});

console.log("2");



