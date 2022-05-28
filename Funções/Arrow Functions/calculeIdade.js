function calculaIdade(anos){
    return `Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos de idade.` 
}

const pessoa1 = {
    nome: 'João',
    idade: 30,
};

const pessoa2 = {
    nome: 'Mayara',
    idade: 31,
};

const animal = {
    nome: 'Miucha',
    idade: 11,
    raca: 'Daschund',
};

console.log(calculaIdade.apply(pessoa1, [5]));