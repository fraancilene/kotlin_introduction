package funcoes

fun main(){
    /**
     * FUNÇÕES SINGLE-LINE
     * fun nomdeDaFunção(nome:tipo) = retorno;
     * função de uma única linha; infere o tipo de retorno
     *
     * FUNÇÕES EXTENSÕES
     * fun tipo.nomeDaFunção();
     * cria uma função que só pode ser chamada por um tipo específico, cujo valor pode ser
     * referenciado dentro da função através da palavra this.
     */


    // chamando função single-line
    println(getFullName("Francilene", "Silva"));


}

// exemplo de função single-line
private fun getFullName(name:String, lastname:String) = "$name $lastname";

// exemplo de função extensão
fun String.randomCapitalizedLetter() =
    this[(0..this.length-1).random()].toUpperCase();