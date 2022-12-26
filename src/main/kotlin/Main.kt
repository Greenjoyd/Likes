fun main(args: Array<String>) {
    println("сколько лайков?")
val likes = readln()
    if (likes.toInt()==0){
        println("У вас пока "+likes+" лайков")
    }else if (likes.toInt()==1){
        println("У вас "+likes+" лайк")
    }else if (likes.toInt()>=2&&likes.toInt()<=4){
        println("У вас "+likes+" лайка")
    }else if (likes.toInt()>=5){
        println("У вас "+likes+" лайков")
    }
}