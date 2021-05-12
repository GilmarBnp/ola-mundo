/* criar um jogo no qual o jogador tenha que adivinhar um numero. O jogo deve gerar um numero aleatório
entre  1 e 100, e depois desafiar o jogador a descobrir qual o numero em no maximo 10 tentativas. A cada
tentantiva, caso o jogador nao tenha acertado o número, o jogo deve informar se o numero informado é maior 
ou menor que o sorteado. O jogo termina se o jogador acertar o número ou acabarem o número de tentativas.

    1) Gerar um número aleatório entre 1 e 100
    2) Inicializar o número de tentativas como 10 criar uma variável para mostrar o número de tentativas
    3) Pedir ao jogador para adivinhar qual é o número
    4) Decrementar o número de tentativas
    5) Verificar se a tentativa está correta
    6) Se a tentativa estiver correta~
        - Informar que acertou o número
        - Encerrar o jogo
    7) Se estiver incorreta, e acabarem as tentativas:
        - Informar que ele não venceu
        - Encerrar o jogo
    8) Se estiver incorreta, w ainda existirem tentativas:
        - Informar se a tentativa é maior ou menor que o número informado
        - Pedir outra tentativa para o jogador
*/

var readline = require("readline");//Criar uma interface para escolher numero pelo terminal;
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

var numeroAleatorio = Math.round(Math.random() * 100);
if (numeroAleatorio === 0) { 
    numeroAleatorio = 1;}

var numeroTentativas = 10;
//o usuario pode demorar para digitar o numero, então com a function(numero) ele continua executando;
// o numero esta dando string, precisa converter para numero, os === não entra no parabens porque so recebe numero e nao string, se colocar == recebe o string e converte;


console.log(typeof(numeroAleatorio));// typeof diz o tipo do numero aleatório "number";

pergunta()
function pergunta(){
    rl.question("Digite um número: ", function(numero){
        numero = parseInt(numero);
        numeroTentativas--;
        if (numero === numeroAleatorio) {
            console.log("Parabéns voce acertou o numero!")
        rl.close();
        } else if (numeroTentativas === 0 ) {
            console.log("Que pena, você não descobriu o número em 10 tentativas")
            rl.close;
        }else if (numero > numeroAleatorio){
            console.log("Número errado você ainda tem: "  + numeroTentativas  + " tentativas. " +
                "O numero é maior que o sorteado"); 
                pergunta();
            }  
        else if (numero < numeroAleatorio){
            console.log("Número errado você ainda tem: "  + numeroTentativas  + " tentativas. " +
            "O numero é menor que o sorteado");
            pergunta(); 
        }
    
    
    })
}

    
 











