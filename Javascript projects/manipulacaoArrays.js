// os indices nos arrays comecam no 0;

var carros = ["gol", "palio", "uno", "argo"];
var carro = carros.pop()// tira o ultimo elemento do array;
//console.log(carro);
//console.log(carros);

//console.log(carros[carros.length - 1]);// imprime o elemento anterior do array, imprime "uno";
// push insere o elemento no fim do array e retorna seu novo tamanho;

carros.push("Ford Ka");//adiciona ao array;
//console.log(carros);


//shift remove o primeiro elemento do array e retorna ele e atualiza os outros indices;
carro = carros.shift();

//console.log("carros = " + carros);
// x é o numero de elementos no array

x = carros.unshift("Onix");
// unshift insere elemento no inicio do array;
//console.log(x);

// atualizar elemento do indice informado;
carros[2] = "Novo Uno";
//console.log(carros);

// remove elemento do indice informado, deixando um undefined no lugar;
//delete carros[2];
//console.log(carros);

// adiciona elemento a partir do numero colocado, no caso do 2, então comeca a mudar a partir do novo uno, 0 gol, 1 palio e 2 novo uno, 
//empura o novo uno para tras;
// o "0" indica quantos elementos devem ser removidos a frente do elemento adicionado, no caso nenhum;
carros.splice(2, 0,  "hrv", "creta");

carros.splice(2, 1);
// removeu a partir do 2 elemento, ja que comeca do "0" e o "1" é o numero de lementos removidos, no caso o hvr;
//console.log(carros);

// concat junta os arrays;
var carrosAntigos = ["brasilia", "monza", "fusca"]; //"[]" = array;
var carrosAntigos2 = ["Corcel", "Chevet"];
//var todosCarros = carros.concat(carrosAntigos) // ou var todosCarros = carrosAntigos.concat(carros) para carros antigos vim na frente;
var todosCarros = carros.concat(carrosAntigos, carrosAntigos2);
//console.log(todosCarros);

/* slice remove um indice criando um novo array, sem mecher no array anterior, no caso todosCarros
continua igual e foi criado o array "novoArray"*/;

var novoArray = todosCarros.slice(1);
console.log(todosCarros);
//console.log(novoArray);

var novoArray2 = todosCarros.slice(2, 5);
console.log(novoArray2);







































