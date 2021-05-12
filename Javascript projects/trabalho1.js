var numero = 997;
var primo = "O número " + numero + " é primo";
var noPrimo = "O número " + numero + " não é primo";
var resultado = noPrimo;

for (i = 2; i < numero; i++) {
	resultado = primo;

	if (numero % i == 0) {
		resultado = noPrimo;
		break;		
	}
}

if (numero == 2) {
	resultado = primo;
}

console.log(resultado);


