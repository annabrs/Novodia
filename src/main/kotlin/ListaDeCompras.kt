class ListaDeCompras {
    private val frutas = mutableListOf("Maçã", "Banana", "Morango", "Uva", "Laranja")

    fun executar() {
        while (frutas.isNotEmpty()) {
            println("\nFrutas disponíveis: $frutas")
            print("Digite o nome de uma fruta para remover (ou 'PARE'): ")
            val entrada = readln()

            if (entrada.equals("PARE", ignoreCase = true)) {
                println("Lista de frutas restantes: $frutas")
                return
            }

            val frutaEncontrada = frutas.find { it.equals(entrada, ignoreCase = true) }

            if (frutaEncontrada != null) {
                frutas.remove(frutaEncontrada)
                println("Fruta foi retirada da lista")
            } else {
                println("Fruta indisponível no nosso mercado")
            }
        }

        println("Lista de compras finalizada")
    }
}

fun main() {
    val programa = ListaDeCompras()
    programa.executar()
}