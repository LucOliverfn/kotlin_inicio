package controle_fluxo.`when`

import controle_fluxo.ex2

fun ex1(cargo:String):Float{
    var bonus = 0f
    when (cargo){
        "Gerente"-> bonus = 2000f
        "Coordenador"-> bonus = 1500f
        "Engenheiro"-> bonus = 1000f
        "Estagiario"-> bonus = 500f

    }
    return (bonus)
}
fun main(){
    val bonus = "Gerente"
    println("O bonus para o cargo $bonus é de ${ex1(bonus)}")

}