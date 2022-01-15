fun main(args: Array<String>) {
    print("*, /, + or -: ")
    val symbol = readLine()
    if (symbol == "*") {
        print("Enter first number: ")
        val number1 = Integer.valueOf(readLine())
        print("Enter second number: ")
        val number2 = Integer.valueOf(readLine())
        val res = number1 * number2
        println("Answer is: $res")
    } else if (symbol == "/") {
        print("Enter first number: ")
        val number1 = Integer.valueOf(readLine())
        print("Enter second number: ")
        val number2 = Integer.valueOf(readLine())
        val res = number1 / number2
        println("Answer is: $res")
    } else if (symbol == "+") {
        print("Enter first number: ")
        val number1 = Integer.valueOf(readLine())
        print("Enter second number: ")
        val number2 = Integer.valueOf(readLine())
        val res = number1 + number2
        println("Answer is: $res")
    } else if (symbol == "-") {
        print("Enter first number: ")
        val number1 = Integer.valueOf(readLine())
        print("Enter second number: ")
        val number2 = Integer.valueOf(readLine())
        val res = number1 - number2
        println("Answer is: $res")
    } else {
        println("Something went wrong!")
    }
}