
// if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. the sum of these multiples is 23. Find 
//the sum of all the multiples of 3 or 5 below 1000.
// || = "ou";
var multiplos = [];
for (var i = 3; i < 1000; i++) {
    if ((i % 3 === 0) || (i % 5 === 0 )){
        multiplos.push(i);
    }
}


var sum = 0;
for (var i = 0; i < multiplos.length; i++) {

 sum = sum + multiplos[i];


} // i++ para percorrer toda tabela array


console.log(sum);


