package funcoes

fun main(){
    helloworld()
    println("A soma de 50 e 20 é ${soma(50,20)}")
    val soma = soma(20,50)
    println(soma)
}
fun helloworld(){
    println("Hello World")
}
fun soma(a:Int, b:Int):Int{
    var soma:Int = 0
    soma = a+b
    return (soma)
}