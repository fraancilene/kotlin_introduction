package estruturas

const val MIN_IDADE = 16;
const val MAX_IDADE = 58;
fun main(){
    /**
     * IF/ELSE / WHEN, ELVIS OPERATOR
     * popde ser utilizado tanto para controle quanto para atribuição;
     * pode ser encandeado com múltiplas estruturas
     */

    // exemplo if
    /** o valor atribuido tem que estar na ultimalinha do bloco
     * a condicional pode não usar chaves se só fizer a atribuição
     */
    val idade = 14;
    if (idade < MIN_IDADE){
        println("Não pode doar sangue");
    } else if (idade > MAX_IDADE) {
        println("Também não pode doar sangue");
    } else {
        println("Pode doar sangue");
    }

    // exemplo when
    /** equivale ao switch de outras linguagens
     * aceitas tanto valores quanto condicionais
     * aceita range como case
     */

    val x = 10;
    val y = 5;
    when{
        x < y -> {
            println("$x é menor que y")}
        x != y && x > y -> {
            println("x é diferente e maior que y");
        }
        else -> {
            println("Nenhuma das opções");
        }

    }

    // outro exemplo de when
    fun Int.getStudentStatus():String{
        println("Nota $this");
        return when(this){
            in 0..4 -> "Reprovado"
            in 5..7 -> "mediano"
            in 8..9 -> "Bom"
            10 -> "Excelente"
            else -> "Indefinido"
        }
    }
    val grade = (0..10).random();
    println(grade.getStudentStatus())



    /**
     * ELVIS OPERATOR
     * o mais próximo que a linguagem possui de um operador ternário
     * verifica se um valor é nulo e apresenta uma opção caso seja;
     * pode ser encadeado
     */

    val a:Int? = 5;
    val c:Int? = null;
    val t:String = x?.getStudentStatus();
    println(t);

    // se o valor de a for nulo ele recebera c, se a e c for nulo ele receberá 0
    var number = a?: c?: 0
    println(number);

}


