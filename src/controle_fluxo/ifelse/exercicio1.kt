package controle_fluxo.ifelse

fun ex1(cargo:String):Float{
    var bonus = 0f
    if (cargo=="Gerente"){
        bonus =2000f
    }
    else if (cargo=="Coordenador"){
        bonus= 1500f
    }
    else if (cargo=="Engenheiro"){
        bonus= 1000f
    }
    else if (cargo=="Estagiario"){
        bonus= 500f
    }
    return (bonus)
}
fun ex2(cargo:String, ano:Int):Float{
    var bonus = 0f
    if (cargo=="Gerente"){
        if (ano<=2){
            bonus = 2000f
        }else{
            bonus =3000f
        }
    }
    else if (cargo=="Coordenador"){
        if (ano<=1){
            bonus = 1500f
        }else{
            bonus =1800f
        }
    }
    else if (cargo=="Engenheiro"){
        bonus=1000f
    }
    else if (cargo=="Estagiario"){
        bonus=500f
    }
    return (bonus)
}

fun main(){
    val bonus = "Gerente"
    println("O bonus para o cargo $bonus é de ${ex1(bonus)}")
    println("O bonus para o cargo $bonus é de ${ex2(bonus,3)}")
}



