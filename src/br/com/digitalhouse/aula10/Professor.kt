package br.com.digitalhouse.aula10

abstract class Professor(
    var nome: String,
    var sobrenome: String,
    var tempoCasa: Int,
    var codProf: Int,
) {

    override fun equals(p: Any?): Boolean {
        p as Professor
        return this.codProf == p.codProf
    }

}