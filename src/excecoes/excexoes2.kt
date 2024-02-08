package excecoes

fun main(){

    var str:String? =null
    //elvis
    println(str?:"NULO")
    // verifica a variavel se caso nula executa o texto

    //Let
    str?.let{
        it.lowercase()
        it.uppercase()
    }

}