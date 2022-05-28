// Strings

// let nome = 'Jonh';
// let sobrenome = 'Schwab';

// nome.concat(sobrenome);

// let concatenado = nome.concat(sobrenome);

// concatenado.length;

// let exemplo = new String ('Exemplo');

// exemplo.length;

// let vazio = '';

// nome[1];

// nome.length;

// concatenado = nome + ' ' + sobrenome; // adicionar espaço
// concatenado = nome + '\n ' + sobrenome; // qubra de linha
// concatenado = `${nome} 
//  ${sobrenome}`; // Teamplate strings
// // concatenado = nome + '\' ' + sobrenome; - para usar aspas dentro das strings

// let frase = 'olá tudo bem?'

// frase.split(''); // separa os argumentos da strings, cada espaço, cada virgula, tudo.

// // frase.split(' '); // split com espaço separa somente após os espaços.

// frase.includes('tudo'); // para descobrir o que tem dentro da string, retornando false ou true.

// frase.startsWith('O'); // para saber se começa com o determinado valor, também retorna false ou true.

// frase.endsWith('?'); // para saber o valor que termina, retorna false ou true.

// // frase.replace(',', '!') - modifica determinado valor da variavel.

// let stringModificada = frase.replace(',', '!');


// Numbers

// let num = 100

// 100 + 3

// 100 / 5

// num / 3

// num % 2

// num2 = 101

// num2 / 2

// Math.PI // função de operações matemáticas

// let fiveByThree = 5 / 3

// fiveByThree

// Math.floor(fiveByThree) // arredondar pra baixo

// Math.ceil(fiveByThree) // arredondar pra cima

// let percent = '10%'

// percent = 10

// percent + '%'

// percent.toString()


// Booleans

// let validation = 3 === 0

// validation

// validation = 3 === 3

// validation = 3 > 4

// validation = 3 > 2

// validation = 3 >= 2

// validation.toString() // retorna o true ou false em string

// !validation // retorna o contrario do valor


// Arrays

// let array = []

// array.push(3)

// array.push(2)

// array.pop(2)

// array.push(2)

// array.push(5)

// array.shift()

// array.unshift(1)

// for(let i = 0; i < array.length; i++){
//     console.log(array[i])
// }

// array.includes(3)

// array.every(item => item === 5)

// array.some(item => item === 5)

// array.reverse()


// Objetos

// let obj = {}

// obj.name = 'Jonh'

// obj.age = 30

// Object.values(obj)

// Object.keys(obj)

// let person = {
//     name:'Sael', 
//     age: 1,
//     adress: 'Rua B'
// }

// person.name

// person['name']

// person['numberOfSiblings'] = 3

// let mom = 'nameOfMom'

// person[mom] = 'Mayara'

// Empty, null e undefined

abacaxi

typeof abacaxi // undefined

let abacaxi = ''

abacaxi // Empty

abacaxi = null // Null

abacaxi

abacaxi === true 

abacaxi === false 

let frutas = abacaxi === false

fruta

!abacaxi // falsy values = valores que são tratados como falsos, mas não são iguais aos dos boleanos.

let maca

!maca

undefined === false