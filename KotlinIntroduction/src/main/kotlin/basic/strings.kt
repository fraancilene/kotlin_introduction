package basic

fun main(){
    /**
     * Strings possuem diversos métodos associados;
     * indexação, concatenação, comparação, formatação;
     * pode ser concatenada com plus/+;
     * também é tratada como um array de char;
     */

    // INDEXAÇÃO
    // string como array; First(), last(), String.length; String[index]
    val s = "Hello, World";
    println(s[1]);
    println(s.first());
    println(s[s.length-1]); // -1 pq começa a contar do 0 então assim da o tamanho correto
    println(s.length-1); // imprime a quantidade de caracteres
    println(s.last());

    // CONCATENAÇÃO
    val hello = "Bem vindo(a)"
    val name = "ana";
    val y = "Olá";

    println(y + " " + name);
    println("${y}, ${name}!");
    println("Bem vindo(a), ${name}!");
    println("$hello, ${name.capitalize()}!");

    // FORMATAÇÃO
    val s1 = "francilene";
    val s2 = "          testando        "
    // capitalização de strings
    println(s1.capitalize());
    println(s1.uppercase());
    println(s1.lowercase());
    println(s1.decapitalize());
    // remoção de espaços
    println(s2.trimEnd());
    println(s2.trimStart());
    println(s2.trim());
    // substituição de caracteres
    println(s1.replace("f", "F"));
    println(s1.replace("e", "es"));

    // formatação
    println();




}