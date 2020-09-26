package br.com.digitalhouse.aula10

class ProfTitulares(
    override var nome: String,
    override var sobrenome: String,
    override var tempoCasa: String,
    override var codProf: Int,
    var especialidade: String
) : Professor {
    constructor()

}