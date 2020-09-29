package br.com.digitalhouse.aula10

fun main() {
    val dhm = DigitalHouseManager()
    println("Alunos ****************")
    dhm.registraAluno("Leonardo", "Carvalho", 13)
    dhm.registraAluno("Maria", "Silva", 17)
    dhm.registraAluno("João", "Souze", 20)

    println("")
    println("Professores Titulares ************")
    dhm.registrarProfTitular("Henrique", "Souza", 1, "C#")
    dhm.registrarProfTitular("Ana", "Beatriz", 3, "Kotlin")

    println("")
    println("Professores Adjuntos ************")
    dhm.registrarProfAdjunto("Maria", "Clara", 13, 6)
    dhm.registrarProfAdjunto("José", "Silva", 19, 6)

    println("")
    println("Cursos ******************")
    dhm.registrarCurso("Full Stack", 20001, 3)
    dhm.registrarCurso("Android", 20002, 2)

    println("")
    println("Alocando os professores nos cursos ****")
    dhm.alocarProf(20001, 1, 13)
    dhm.alocarProf(20002, 3, 19)

    println("")
    println("Matriculando Alunos no Curso Full Stack *****")
    dhm.matricularAlunoCurso(13, 20001)
    dhm.matricularAlunoCurso(17, 20001)

    println("")
    println("Matriculando Alunos no Curso de Android ******")
    dhm.matricularAlunoCurso(13, 20002)
    dhm.matricularAlunoCurso(17, 20002)
    dhm.matricularAlunoCurso(20, 20002)

    println("")
    println("Removendo Curso ********")
    dhm.excluirCurso(20001)
    println("")
    println("Removendo Professor *******")
    dhm.excluirProf(13)
}