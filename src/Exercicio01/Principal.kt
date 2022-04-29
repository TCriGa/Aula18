package Exercicio01

fun main() {


    val caixaInicial: Caixa = Caixa()
    val quantidade = caixaInicial.listarQuantidadeProduto()

    for (i in 1..quantidade) {

        caixaInicial.inserirQtdProduto(caixaInicial.cadastrarProduto())
    }

    caixaInicial.exibirMensagem()
}