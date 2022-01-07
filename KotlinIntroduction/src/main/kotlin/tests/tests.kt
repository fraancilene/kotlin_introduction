fun main(){
    // 1
    val pi = 3.14159265358979323
    val formatted = "Pi: %.2f".format(pi);
    println(formatted);

    // 2
    val name = "Maria Clara"
    for(n in name){
        println(n)
    }

//    var text = "Kotlin"
//    text = null
//    text += "Language"

    val y:Int? = null
    val z = 3
    val number = y?:z?:5;
}