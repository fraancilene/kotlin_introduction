package estruturas

fun main() {
    /**
     * WHILE, DO..WHILE, FOR E FOREACH
     * estruturas imilares às convencionais em outras linguagens;
     * aceita os comandos in, range, util, dowTo e step
     */

    /*
    * FOR
    * for(variavelIndexadora in/until/dowTo faixa de valores/condicional step intervalo)
    *
    * in - conta do valor inicial até o valor final estabelecido
    * until - conta do valor atual até o valor estabelecido menos 1
    * downTo - conta de maneira decrescente
    * step - determina o intervalo da contagem
    * */

    // exemplos
    for(i in 0..20 step 2){
        println("$i ");
    }

    for(i in 10 downTo 0){
        println("$i ");
    }

    for(i in 0 until 10){
        println("$i ");
    }

    var text = "Kotlin";
    for (letter in text){
        println(letter);
    }

    fun letters(){
        val sArray = "Olha essa String";
        for (l in sArray){
            println(l.toUpperCase());
        }
    }

    letters();
}


