
const val NUMBER = 6;
fun main(){
    println(calc(6.0F));


}
fun calc(x:Float):Float{
    if (x == null ) {
        println("Números nulos");
    }
    return x * NUMBER;

}