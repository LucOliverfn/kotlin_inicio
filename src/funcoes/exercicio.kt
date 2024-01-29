package funcoes

fun main(){
    anos(2)
    println(quant("djwjdwjdwdwdjwdjkw"))
    println(cubo(3))
    println(conversor(100f))

}
fun anos(ano:Int){
    println("$ano anos equivalem a :")
    println("${ano*12} meses")
    println("${ano*365} dias")
    println("${ano*8766} horas")
    println("${ano*525960} minutos")
    println("${ano*31536000} segundos")
}

fun quant(carac:String) = (carac.length)

fun cubo(num:Int) = (num*num*num)

fun conversor(milha:Float): Float{
    val conversao = milha * 1.6f
    return (conversao)
}