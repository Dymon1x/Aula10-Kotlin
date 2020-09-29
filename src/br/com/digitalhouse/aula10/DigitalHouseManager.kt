package br.com.digitalhouse.aula10

import java.util.*

class DigitalHouseManager() {
    var listaAlunos = mutableListOf<Aluno>()
    var listaProf = mutableListOf<Professor>()
    var cursos = mutableListOf<Curso>()
    var matricula = mutableListOf<Matricula>()

    // CURSO
    fun registrarCurso(nome: String, codCurso: Int, qtdeMaxAluno: Int) {
        val c = Curso(nome, codCurso, null, null, qtdeMaxAluno, listaAlunos)
        cursos.add(c)
        println("Curso Registrado com o cód ${c.codCurso}")
    }

    fun excluirCurso(codCurso: Int) {
        for (c in cursos) {
            //println("Cursos - ${c.nome} e cód - ${c.codCurso}")
            if (c.codCurso == codCurso) {
                cursos.remove(c)
                println("Curso Removido - cód: ${c.codCurso}")
            }
        }
    }

    //PROFESSOR ADJUNTO e TITULAR - registrar
    fun registrarProfAdjunto(nome: String, sobrenome: String, codProf: Int, qtdeHoras: Int) {
        val adj = ProfAdjuntos(nome, sobrenome, 0, codProf, qtdeHoras)
        listaProf.add(adj)
        println("Professor Adjunto Registrado com o cód ${adj.codProf}")
    }

    fun registrarProfTitular(nome: String, sobrenome: String, codProf: Int, especialidade: String) {
        val titular = ProfTitulares(nome, sobrenome, 0, codProf, especialidade)
        listaProf.add(titular)
        println("Professor Titular Registrado com o cód: ${titular.codProf}")
    }


    fun excluirProf(codProf: Int) {
        for (p in listaProf) {
            //println("Professor: ${p.nome} - cód:${p.codProf}")
            if (p.codProf == codProf){
                listaProf.remove(p)
                println("Professor removido do sistema - cód: $p.")

            }
        }
    }


    // ALUNO
    fun registraAluno(nome: String, sobrenome: String, codAluno: Int) {
        val aluno = Aluno(codAluno, nome, sobrenome)
        listaAlunos.add(aluno)
        println("Aluno cód: ${aluno.codAluno} - Adicionado com sucesso")
    }

    //ALUNO EM CURSO - matricular
    fun matricularAlunoCurso(codAluno: Int, codCurso: Int) {
        for (a in listaAlunos) {
            if (a.codAluno == codAluno) {
                for (c in cursos) {
                    if (c.codCurso == codCurso) {
                        var matricular = Matricula(a, c, Date())
                        matricula.add(matricular)
                        println("Matricula Realizada com Sucesso no curso: ${c.nome}")
                    } /*else {
                        println("Matricula Incompleta no curso: ${c.nome}")
                    }*/
                }
            }
        }
    }

    fun alocarProf(codCurso: Int, codProfTitulares: Int, codProfAdjuntos: Int) {
        for (p in listaProf) {
            if (p.codProf == codProfTitulares) {
                for (c in cursos) {
                    if (c.codCurso == codCurso) {
                        p as ProfTitulares
                        c.profTitulares == p
                        println("Professor Titular foi Alocado")
                    } else if (p.codProf == codProfAdjuntos) {
                        for (c in cursos) {
                            if (c.codCurso == codCurso) {
                                p as ProfAdjuntos
                                c.profTitulares == p
                                println("Professor Adjunto foi Alocado")
                            }
                        }
                    }
                }
            }
        }
    }


}

