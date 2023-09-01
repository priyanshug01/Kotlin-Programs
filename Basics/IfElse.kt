fun main() {
    var num = 80
    if(num>90)
        println("Number is Greater than 90")
    else if(num>70 && num<=90)
        println("The Number is Less than 90 but Greater than 70")
    else
        println("The Number is Less than 70")

    val text = if(num>50) "Greater than 50" else "Less than 50"
    println("$text")//only works for ifelse and single statement not for multiple statements
}