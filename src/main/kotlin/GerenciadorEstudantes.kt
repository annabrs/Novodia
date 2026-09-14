class GerenciadorEstudantes {
    private val lista = mutableListOf<String>()

    fun executar() {
        while (true) {
            print("Digite o nome do estudante (ou 'PARE' para encerrar): ")
            val entrada = readln()

            if (entrada.equals("PARE", ignoreCase = true)) {
                break
            }
            lista.add(entrada)
        }

        println("\nQuantidade de estudantes cadastrados: ${lista.size}")
        println("Lista de estudantes:")
        lista.forEach { println("- $it") }
    }
}

fun main() {
    val programa = GerenciadorEstudantes()
    programa.executar()
}