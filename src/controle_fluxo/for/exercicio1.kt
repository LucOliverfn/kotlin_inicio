package controle_fluxo.`for`

fun main(){
    ex1()
    ex2()
    ex3()
    ex4()
    ex5()
}

fun ex1(){
    for (contador in 1..50) {
        print(" $contador")
    }
    println("")
}

fun ex2(){
    val inicio = 50
    for (contador in 50 downTo 1){
        print(" $contador")
    }
    println("")
}

fun ex3(){
    for (contador in 1..50) {
        if (contador%5==0){
            print(" $contador")
        }
    }
    println("")
}

fun ex4(){
    var soma =0
    for (contador in 1..500){
        soma+=contador
    }
    println("A soma no intervalo de 1 a 500 é de $soma")
}

fun ex5(){
    print("DIgite quantas linhas voce deseja adicionar ao programa:")
    val numero = readLine()
    if (numero!=null && numero!=""){
        val n = numero.toInt()
        for (contador in 1..n){
            for (count in 1..contador){
                print("#")
            }
            println()
        }
    }
}
