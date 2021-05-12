// não precisa colocar carros : quando o nome da propriedade tem o mesmo nome do valor, "carro";
    // concessionaria é o conteúdo;

var fs = require("fs");
var nomeArquivo = "carros.json";
var carros = ["Gol", "Palio", "Uno", "Celta"];
var loja = {
    nome: "loja XYZ",
    carros
}
fs.writeFile(nomeArquivo, JSON.stringify(loja), function(err){
    if (err) {
        console.log(err)
    }
})






