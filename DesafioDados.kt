import java.util.*

fun main (args : Array<String>){

    do {
        println("Digite um palpite de 1 a 6: ")
        val palpite = readLine()?.toInt()!!

        val random = Random()
        val dado = random.nextInt(6) + 1
        println("O dado caiu no $dado")


        when (palpite == dado) {
            true -> println("Você acertou!!")
            false -> println("Você errou!")
        }
    } while (palpite != dado)

}