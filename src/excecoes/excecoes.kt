package excecoes

fun main(){

    val s:String? = null
    //null safety
    println(s?.length)
    try {
        println(s!!.length)
    }catch (e:NullPointerException){
        println("O bagulho é nulo")
    } finally {
        println("fim")
    }

}