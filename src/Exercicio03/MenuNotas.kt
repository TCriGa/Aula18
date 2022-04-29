package Exercicio03

import kotlin.system.exitProcess

class MenuNotas {
    companion object ObjetoMenu {
        private val acessarNotas: Notas = Notas(DoubleArray(4))

        init {
            println("|--*--*  Bem vindo ao sistema escolar de SymCity *--*--|")
        }

        private fun boasVindasNotas() {
            println("|-------------------------------------------------------|")
            println("|        Por favor, digite a op??o desejada:           |")
            println("|------------------------------------------------------|")
            println("|--------------01 - Inserir notas do aluno:------------|")
            println("|--------------02 - Mostrar m?dia do aluno: -----------|")
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
                    else -> println("Op??o inv?lida. Por favor, digite novamente")
                }
            } while (true)
        }
    }
}
