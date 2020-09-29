package br.com.digitalhouse.aula10

//Parte A
class Aluno(val codAluno: Int, val nome: String,val sobrenome: String){
    override fun equals(a: Any?): Boolean {
        a as Aluno
        return this.codAluno == a.codAluno
    }
}