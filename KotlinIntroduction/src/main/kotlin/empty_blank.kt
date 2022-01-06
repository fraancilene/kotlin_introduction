fun main(){
    /**
     * EMPTY X BLANK
     * métodos de comparação
     * a string está vazia, em branco ou é nula?
     * Se o tamanho da string s.length fo 0 está empty e blank;
     * se o tamanho for > 0 mas todos os caracteres são espaços em branco, está blank mas
     * não está empty;
     */

    val s = "";
    println(s.isEmpty());
    println(s.isBlank());
    println(s.isNullOrBlank() || s.isNullOrEmpty());
    println(s.length);

    val s2 = "              ";
    println(s2.isEmpty());
    println(s2.isBlank());
    println(s2.length);

}