package Exercicio02


import kotlin.system.exitProcess

class Menu {

    var menuP: Pessoa = Pessoa()

    init {
        println("|--*--*    Bem vindo ao sistema calcular Idade   *--*--|")
    }

    fun boasVindas() {
        println("|----------01- Inserir dados( data, mês, Ano)----------|")
        println("|----------02- Mostrar idade atual---------------------|")
        println("|----------03 - Sair-----------------------------------|")
    }

    fun menuPessoa() {

        do {

            boasVindas()
            when (readln().toInt()) {
                1 -> {
                    menuP.informarNome()
                    menuP.informarIdade()
                    menuP.ajustaDataDeNascimento()


                }
                2 -> {
                    menuP.exibirMensagem()

                }

                3 -> {
                    println("Grata por utilizar o nosso sistema ;)!!!")
                    exitProcess(0)

                }
                else -> {
                    println("Opção Inválida. Digite novamente. XD!!!")

                }
            }

        }while (true)

    }
}
