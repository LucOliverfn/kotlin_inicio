package controle_fluxo.whilee

fun main(){
    ex1()
    ex2()
    ex3("Meu nome é Julius")
}

fun ex1(){
    var soma =0
    val caixa =2000f
    var balao =7f
    while(balao<caixa){
        soma++
        balao+=7f
    }
    if (balao>caixa){
        soma--
    }
    println("Para encher uma caixa d'agua de 2000 litros com um balão de 7 litros serão necessarios $soma balões")
}
fun ex2(){
    var contador =1
    print(contador)
    while(contador<=50){
        contador++
        if (contador%5==0 && contador%3==0 ){
            print(" fizzbuzz")
            continue
        }

        if (contador%3==0){
            print(" buzz")
            continue
        }
        if (contador%5==0){
            print(" fizz")
            continue
        }
        else{
            print(" $contador")
        }

    }
    println()
}

fun ex3(texto:String){
    var tamanho =texto.length-1
    while (tamanho>=0){
        print(texto[tamanho])
        tamanho-=1
    }
}