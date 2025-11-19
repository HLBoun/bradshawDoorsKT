fun main() 
{
    println("Hello poor soul, what is your name?\n")
    val name = readln()

    println("Welcome to your judgment," + name + "!\n")
    println(
        "Choosing a door will determine the fate for your eternal soul.\n"
                + "Enter a number [1], [2], or [3]...\n")

    val userChoice = readln()
    println("You have chosen door:" + userChoice)

    if (userChoice == "1")
    {
        println("This door revealed a hungry lion that shall chew on yur bones for the rest of eternity")
    }

    if (userChoice == "2") 
    {
        println("This door reveals a pit of deadly snakes and you have fallen into the pit.")
    }
    if (userChoice == "3") 
    {
        println("This door reveals everything you ever wanted, money, girls anything.")

        val userChoice = readln()
    }
}
