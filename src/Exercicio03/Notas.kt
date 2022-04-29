package Exercicio03

class Notas(private var notas: DoubleArray, private var media: Double = 0.0) {

    fun coletarDados() {
        notas.forEachIndexed { i, _ ->
            println("Informe a ${i + 1} ª nota: ")
            notas[i] = readln().toDouble()
            validarNotas()
        }
    }

    fun mediaNotas(): Double {
        var soma = 0.0
        notas.forEachIndexed { i, _ ->

            soma += notas[i]
            media = soma / notas.size

        }
        println("A média do(a) aluno (a) é $media")
        return media
    }

    private fun validarNotas(): DoubleArray {
        notas.forEachIndexed { i, _ ->
            while (notas[i] !in 0.0..10.0) {
                println("Nota inválida. Digite novamente")
                println("Informe a ${(i + 1)} nota do Aluno:")
                notas[i] = readln().toDouble()
            }
        }
        return notas

    }
}