package br.com.digitalhouse.aula10

class ProfAdjuntos(
    override var nome: String,
    override var sobrenome: String,
    override var tempoCasa: String,
    override var codProf: Int,
    var horaMonitoria: Int
) : Professor {
    constructor()
}