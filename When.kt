fun obterMnemonica (cor:Cor) =
    when(cor){
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"

    }

fun obterTemperatura (cor:Cor):String {
    return when(cor){
        Cor.VERMELHO,Cor.LARANJA,Cor.AMARELO -> "Quente"
        Cor.AZUL, Cor.VERDE -> "Fria"
    }

}

fun main (){
    val mnemonica = obterMnemonica(Cor.VERMELHO )
    val temp = obterTemperatura(Cor.VERMELHO)
    println(mnemonica + " " + temp)
}




