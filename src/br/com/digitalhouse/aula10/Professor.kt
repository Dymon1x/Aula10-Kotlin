package br.com.digitalhouse.aula10

interface Professor{
    var nome: String
    var sobrenome: String
    var tempoCasa: String
    var codProf: Int

    fun verificaProf(codProfessor: Int){
        if(this.codProf == codProfessor){
            println("O professor do código ${this.codProf} é igual ao do professor do código $codProfessor")
        }else{
            println("Os codigos de professores são diferentes")
        }
    }
}