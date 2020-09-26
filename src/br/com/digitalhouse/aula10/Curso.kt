package br.com.digitalhouse.aula10

//Parte B
class Curso(var nome: String, var codCurso: Int, var quantMaxAluno: Int) {
    var pTitular = ProfTitulares()
    var pAdjunto = ProfAdjuntos()
    var listaAlunos = mutableListOf<Aluno>()

    constructor(codCurso: Int) {
        if (this.codCurso == codCurso) {
            println("O codigo do curso ${this.codCurso} é igual ao codigo do curso $codCurso")
        } else {
            println("Os codigos de curso são diferentes")
        }
    }
}