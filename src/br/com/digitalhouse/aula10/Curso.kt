package br.com.digitalhouse.aula10

class Curso(
    val nome: String,
    val codCurso: Int,
    val profTitulares: ProfTitulares? = null,
    val profAdjuntos: ProfAdjuntos? = null,
    var qtdeMaxAluno: Int,
    var alunosMatriculados: MutableList<Aluno>
) {
    override fun equals(c: Any?): Boolean {
        c as Curso
        return this.codCurso == c.codCurso
    }

    fun adicionarUmAluno(aluno: Aluno): Boolean {
        return if(alunosMatriculados.size < qtdeMaxAluno) {
            print("Aluno matriculado com sucesso")
            this.alunosMatriculados.add(aluno)
        } else {
            println("Aluno não foi matriculado")
            false
        }
    }

    fun excluirAluno(aluno: Aluno) {
        alunosMatriculados.remove(aluno)
    }
}