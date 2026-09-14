class BuscadorPlanetas {
    private val planetas = listOf(
        "Mercúrio", "Vênus", "Terra", "Marte",
        "Júpiter", "Saturno", "Urano", "Netuno", "Plutão"
    )

    fun executar() {
        println("Planetas no sistema solar: $planetas")
        print("Digite o nome de um planeta: ")
        val busca = readln()

        val encontrado = planetas.any { it.equals(busca, ignoreCase = true) }

        if (encontrado) {
            println("O planeta $busca está na lista! ✨")
        } else {
            println("O planeta $busca não foi encontrado na lista.")
        }
    }
}

fun main() {
    val programa = BuscadorPlanetas()
    programa.executar()
}