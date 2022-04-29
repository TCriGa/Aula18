package Exercicio02

import java.time.LocalDate

class Pessoa(
    private var dia: Int = 0,
    private var mes: Int = 0,
    private var ano: Int = 0


) {
    private var nomePessoa: String = ""
    private var diaAtual: Int = LocalDate.now().dayOfMonth
    private var mesAtual: Int = LocalDate.now().monthValue
    private var anoAtual: Int = LocalDate.now().year

    var resultaDoAno =0
    var resultadoDoDia =0
    var resultadoDoMes = 0

    fun informarNome(): String {
        println("Por gentileza, Informe o seu nome: ")
        nomePessoa = readln()


        return nomePessoa


    }

    fun informarIdade(): Pessoa {
        println("Informe o dia do seu nascimento: ")
        dia = readln().toInt()

        println("Informe o mês do seu nascimento:")
        mes = readln().toInt()

        println("Informe o ano do seu nascimento: ")
        ano = readln().toInt()


        return Pessoa(dia, mes, ano)


    }


    fun ajustaDataDeNascimento(): Pessoa {

        resultadoDoDia = (diaAtual - dia - 31).inv()
        resultadoDoMes = mesAtual - mes
        resultaDoAno = if (mesAtual < mes){
            anoAtual - (ano + 1)
        }else
            anoAtual - ano

        return Pessoa(resultadoDoDia, resultadoDoMes, resultaDoAno)

    }

    fun exibirMensagem() {

        if (resultadoDoMes < 0) {
            println("$nomePessoa tem $resultaDoAno anos e $resultadoDoDia dias")
        } else
            println("$nomePessoa tem $resultaDoAno anos, $resultadoDoMes mês e $resultadoDoDia dias")
    }


}