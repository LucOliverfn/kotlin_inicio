package controle_fluxo.`when`


fun main(){
    ex1()
    println("-----------------------")
    ex2()
    println("-----------------------")
    ex3()
}

fun ex3(){
    print("Digite a sua idade:")
    val idade = readLine()
    if (idade != null && idade!="") {

        if (idade.toInt()<18){
            println("Negado. Menores de idade não são Permitidos.")
        }
    }
    print("Digite o tipo do seu convite:")
    var convite = readLine()
    if (convite != null) {
        convite = convite.lowercase()
    }
    if (convite=="comum"||convite=="premium"||convite=="luxo"){

        print("Digite o codigo do convite pfv :")
        var cod = readLine()


        if (cod != null && cod!="") {
            cod = cod.lowercase()
            if (convite =="comum" && cod.startsWith("xt")) {
                println("Welcome :)")
            } else if (convite =="premium" || convite =="luxo" && cod.startsWith("xl")) {
                println("Welcome :)")

            }else{
                println("NEGADO")
            }
        }
    }else{
        println("Negado.Convite invalido")
    }
}
fun ex2(){
    print("Informe o primeiro lado:")
    val n1 = readLine()
    print("Informe o segundo lado:")
    val n2 = readLine()
    if (n2 != null&& n2!="" && n1 != null && n1!="") {
        n2.toInt()
        n1.toInt()
        if(n1==n2){
            println("A figura é um quadrado")
        }else{
            println("A figura não é um quadrado")
        }
    }

}

fun ex1(){
    print("Informe o primeiro lado:")
    val n1 = readLine()
    print("Informe o segundo lado:")
    val n2 = readLine()
    print("Informe o Terceiro lado:")
    val n3 = readLine()
    if (n2 != null&& n2!="" &&
        n1 != null && n1!=""&&
        n3 != null && n3!=""
        ) {
        n2.toInt()
        n1.toInt()
        if(n1==n2 && n2==n3){
            println("A figura é um Triangulo Equilatero")
        }else{
            println("A figura não é um Triangulo Equilatero")
        }
    }

}

