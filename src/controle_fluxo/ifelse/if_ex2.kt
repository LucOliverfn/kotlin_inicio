package controle_fluxo.ifelse

fun main(){
    val id = 40
    maiorDeIdade(id)
    saudacoes(true)
}
fun maiorDeIdade(idade:Int){
    if (idade>=18){
         println("Ele é maior de idade")
    } else{
        println("Ele é menor de idade")
    }
}
fun saudacoes (dia:Boolean):String{
    return if (dia){
        "BOM DIA"
    } else{
        return "boa noite"
    }
}