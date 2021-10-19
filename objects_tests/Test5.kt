package objects_tests

fun main(){

    var a=6
    var b=17
    var i=0


    if (a<b){
        for (i in a..b){
            println(i)
        }
    }else{for (i in b downTo a){
        println(i)
    }

    }
}