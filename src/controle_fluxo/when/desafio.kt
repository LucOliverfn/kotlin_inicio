package controle_fluxo.`when`

fun main(){
 desafio()
}

fun desafio(){
    val salario =10000f
    var inv_ana = 0f
    var inv_paula = 0f
    var meses =0
    do{
        inv_ana += (salario * 0.05f) + (salario * 0.05f) + (inv_ana * 0.002f)
        inv_paula += (salario * 0.05f) + (inv_paula * 0.008f)
        meses++
    }while (inv_paula<inv_ana)
    println("O tempo para os investimentos se equipararem é de $meses meses")
}