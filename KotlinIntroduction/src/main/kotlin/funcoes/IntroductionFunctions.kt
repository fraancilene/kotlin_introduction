package funcoes

class IntroductionFunctions(){
    /**
     * INTRODUÇÃO A FUNÇÕES
     * Prefixo Fun nome da função(nome:tipo): tipoRetorno{}
     * função anônimas, single-line, inline, extensões, lambdas, ordem superior
     */

   // simplificando uma função
   // opção 1
    private fun getFullName(name:String, lastName:String):String {
        val fullname = "$name, $lastName";
        return  fullname;
    }

    // opção 2
    private fun getFullName2(name:String, lastName:String):String {
        return "$name, $lastName";
    }

    // opção 3
    private fun getFullName3(name:String, lastName:String) = "$name, $lastName";


}