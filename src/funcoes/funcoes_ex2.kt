package funcoes

fun main(){

    val str = "Programação em kotlin"
    println("O tamanho da string é ${str.length}")
    println("O primeiro cararacter da string é ${str[0]}")
    println(str.startsWith("pro"))
    println(str.endsWith("lin"))
    println("   ddddddddddddddddddd chapei viadoo                           ".trim())
    println("tudo caixa alta ${str.uppercase()}")

}