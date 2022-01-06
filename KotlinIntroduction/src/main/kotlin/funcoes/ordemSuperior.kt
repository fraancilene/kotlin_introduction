package funcoes

import kotlin.reflect.KFunction2
import kotlin.collections.sum as sum1

fun main(){
    /**
     * Funções de ordem superior
     * recebem outra função ou lambda por parâmetro;
     * bastante uteis para a generalização de funções e tratamento de erros
      */

    val x:Int;
    val z:Int;
    z = calculate(34, 90, ::sum);
    x = calculate(34, 90, {a, b -> a*b}); // pode ser qualquer operação
    println(z);
    //val x1 = calculate(12,4 ::sum1);
    //val y = calculate(12,4){a,b -> a*b};
}

fun sum(a1:Int, a2:Int) = a1.plus(a2);

fun calculate(n1:Int, n2:Int, operation:(Int, Int)-> Int):Int {
    val result = operation(n1, n2);
    return result;
}




