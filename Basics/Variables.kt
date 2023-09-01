fun main() {
    //String
    var userName: String = "Priyanshu"
    //userName = "PG"//priyanshu gets replaced by PG
    //userName = 5//cant assign integer to string variable
    println("Hello $userName!\n")

    //Integer(negative and whole numbers) 32 bits
    val age = 5
    //age = 20//doesnt work
    val maxIntValue = Int.MAX_VALUE //type inference
    val minIntValue: Int = Int.MIN_VALUE
    println("Range of Integers: $minIntValue to $maxIntValue ")
    println("Your age is $age!\n")

    //Byte(Small Range) 8 bits
    val maxByteValue: Byte = Byte.MAX_VALUE
    val minByteValue = Byte.MIN_VALUE
    println("Range of Byte: $minByteValue to $maxByteValue\n")

    //Short(Small Range of Integers) 16 bits
    val maxShortValue: Short = Short.MAX_VALUE
    val minShortValue = Short.MIN_VALUE
    println("Range of Short: $minShortValue to $maxShortValue\n")

    //Long(large Range) 64 bits
    val num = 29L//long data declaration 'L'
    //val num1 = 32345678987654//long integer
    val maxLongValue: Long = Long.MAX_VALUE
    val minLongValue = Long.MIN_VALUE
    println("Range of long: $minLongValue to $maxLongValue")
    println("The Number is: $num\n")

    //Float(Decimal/Fractional Numbers) 32 bits
    var num1: Float = 5F//'f' or 'F'
    val maxFloatValue: Float = Float.MAX_VALUE
    val minFloatValue = Float.MIN_VALUE
    println("Range of float: $minFloatValue to $maxFloatValue")
    println("The Number is: $num1\n")

    //Double(Decimal/Fractional Numbers) 64 bits
    var num2: Double = 5.7
    val maxDoubleValue: Double = Double.MAX_VALUE
    val minDoubleValue = Double.MIN_VALUE
    println("Range of double: $minDoubleValue to $maxDoubleValue")
    println("The Number is: $num2\n")

    //Char(Single Alphabets,Symbol) 16 bits
    var num3: Char = 'A'
    println("The Number is: $num3\n")

    //Boolean(true/false) 1 bit
    val num4: Boolean = true
    println("The Number is: $num4")

}
/*Variables store data(maybe predefined or user input)
camelCase is preferred!
General format - var variablename: datatype = data
$ is like %d in C lang
another way is using val instead of var
but in val you cannot change the data as in var case(PG instead of Priyanshu)
kotlin has type inference i.e. no need to define the datatype in variable declaration
Another type - var variablename = value
Total 8 Datatypes with specific function*/