package Exercicio01

class Caixa {
    var produtoCaixa: Produto = Produto()
    val listaDeProduto: ArrayList<Produto> = ArrayList()


    fun listarQuantidadeProduto(): Int {
        println("Informe a quantidade de produtos adquiridos: ")
        return readln().toInt()
    }


    fun cadastrarProduto(): Produto {

        println("Informe o nome do produto adquirido: ")
        produtoCaixa.nomeProdutop = readln()

        println("Informe a quantidade do ${produtoCaixa.nomeProdutop} ")
        produtoCaixa.qtdProdutop = readln().toInt()

        println("Informe o preço do produto ${produtoCaixa.nomeProdutop}")
        produtoCaixa.valorProdutop = readln().toDouble()



        return Produto(produtoCaixa.nomeProdutop, produtoCaixa.qtdProdutop, produtoCaixa.valorProdutop)
    }


    fun caixaTotal(): Double {
        var resultado = 0.0
        listaDeProduto.forEach {
            resultado += produtoCaixa.valorProdutop * produtoCaixa.qtdProdutop

        }
        return resultado
    }

    fun inserirQtdProduto(Produto: Produto) {
        listaDeProduto.add(Produto)
    }

    fun exibirMensagem() {
        println("|-----------Valor Total da Compra:--------------|")

        println(caixaTotal())


        println("|------------Lista de Produtos: ----------------|")
        listaDeProduto.forEach {
            println("Produro = ${it.nomeProdutop}")
            println("Quantidade = ${it.qtdProdutop}")
            println("Preço = R$ ${it.valorProdutop}")

        }
    }


}






