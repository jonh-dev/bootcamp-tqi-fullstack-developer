const alunos = [
	{
		nome: 'João',
		nota: 5,
		turma: '1B',
	},
	{
		nome: 'Mayara',
		nota: 9,
		turma: '1B',
	},
	{
		nome: 'Sael',
		nota: 6,
		turma: '2C',
	},
    {
		nome: 'Jack',
		nota: 3,
		turma: '2F',
	},
];


function alunosAprovados(alunos, media) {
	let aprovados = [];

	for (let i = 0; i < alunos.length; i++) {
		let { nota, nome } = alunos[i];

		if (nota >= media) {
			aprovados.push(nome);
		}
	}

	return aprovados;
}

console.log(alunosAprovados(alunos, 5));