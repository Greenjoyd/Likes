fun main(args: Array<String>) {
    println("сколько лайков?")
    val likes = readln()
    val likesInt = likes.toInt()
    val percent = likesInt % 10
    if (percent == 0) {
        println("У вас пока " + likes + " лайков")
    } else if (likesInt >= 2 && likesInt <= 4) {
        println("У вас " + likes + " лайка")
    }else if (likesInt==11 || likesInt==111 || likesInt==211|| likesInt==311|| likesInt==411){
        println("У вас " + likes + " лайков")//Я не придумал ничего лучше:(
    } else if (percent == 1) {
        println("У вас " + likes + " лайк")
    } else if (percent >= 2 && percent <= 4) {
        println("У вас " + likes + " лайков")
    } else if (percent >= 5) {
        println("У вас " + likes + " лайков")
    }
}