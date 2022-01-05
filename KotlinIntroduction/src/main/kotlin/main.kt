const val EQUAL = 0;
const val LESS = -1;
const val MORE = 1;

fun main() {
    /** NULLABILITY
     * qualquer tipo pode ser nulo, porém isso deve ser explicitado na declaração de variável
     * através do uso da interrogação(?);
     * A inferência de tipo não atribui nullability;
     */

    // exemplo de atribuição de valor nulo corretamente
    var month:Int? = null;

    // var day:Int = null; erro de compilação

    // OPERADORES ARITMÉTICOS
    /** os operadores podem ser chamados tanto como expressão quanto como
     * comando. o resultado será o mesmo. A função soma também funciona para concatenar strings
     */

    var x = 10;
    var y = 3;
    // expressões
    var soma = x + y;
    var sub = x - y;
    var multi = x * y;
    var div = x / y;
    var res = x % y;
    println("($x + $y) = ${soma}");
    println("($x - $y) = ${sub}");
    println("($x * $y) = ${multi}");
    println("($x / $y) = ${div}");
    println("($x % $y) = ${res}");

    // comandos
    x.plus(y);
    x.minus(y);
    x.times(y);
    x.div(y);
    x.mod(y);

    // atribuição
    /*x += y;
    x -= y;
    a *= y;
    a /= y;
    a %= y*/

    // OPERADORES COMPARATIVOS
    /** Os comandos compareTo retornam os valores -1(menor que), 0 (igual) ou 1 (maior que).
     * já os operadores retornam valores booleanos. O comando equals retorna um booleano
     */

    // expressões
    println(x > y);
    println(x < y);
    println(x >= y);
    println(x <= y);
    println(x == y);
    println(x != y);

    // comandos
    println(x.compareTo(y) > MORE);
    println(x.compareTo(y) < LESS);
    println(x.compareTo(y) >= EQUAL);
    println(x.compareTo(y) <= EQUAL);
    println(x.equals(y));
    println(!(x.equals(y)));

    // OPERADORES LÓGICOS
    /*
     * quando utiliza-se o comando, é recomendado colocar a expressão entre parênteses
     * E (&&) - (expressão 1) and (expressão 2)
     * OU (||) - (expressão 1) or (expressão 2)
     */





}