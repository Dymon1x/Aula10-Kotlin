package br.com.digitalhouse.aula10

//Parte A
class Aluno(var codAluno: Int, var nome: String,var sobrenome: String){
    private val listaAlunos = mutableListOf<Aluno>()

    constructor(nome: String, sobrenome: String, codAluno: Int) {
        if (this.codAluno == codAluno) {
            println("O Codigo de aluno ${this.codAluno} é igual do codigo de aluno de $codAluno ")
        } else {
            println("Os codigos de alunos são diferentes")
        }
        this.codAluno = codAluno
    }

    fun adicionarUmAluno(aluno: Aluno): Boolean {
        return listaAlunos.add(aluno)
    }

    fun excluirAluno(aluno: Aluno) {
        listaAlunos.remove(aluno)
    }
}