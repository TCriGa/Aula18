package Exercicio03

import kotlin.system.exitProcess

class MenuNotas {
    private val acessarNotas: Notas = Notas(DoubleArray(4))

    init {
        println("|--*--*  Bem vindo ao sistema escolar de SymCity *--*--|")
    }

    private fun boasVindasNotas() {
        println("|-------------------------------------------------------|")
        println("|        Por favor, digite a opção desejada:           |")
        println("|------------------------------------------------------|")
        println("|--------------01 - Inserir notas do aluno:------------|")
        println("|--------------02 - Mostrar média do aluno: -----------|")
        println("|--------------03 - Sair ------------------------------|")
        println("|------------------------------------------------------|")
    }

    fun menu() {

        do {
            boasVindasNotas()
            when (readln().toInt()) {
                1 -> acessarNotas.coletarDados()
                2 -> acessarNotas.mediaNotas()
                3 -> {
                    println("Obrigada por utilizar o nosso sistema ;) !!!!")
                    exitProcess(0)
                }
                else -> println("Opção inválida. Por favor, digite novamente")
           }
        } while (true)
    }
}
