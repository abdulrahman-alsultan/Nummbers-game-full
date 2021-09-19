import kotlin.random.Random

fun main(){


    var num = 0
    while(num < 3){
        print("Guess a number between 0 and 10 or quit:")
        var selectedNumber = Random.nextInt(11)

        var input = readLine()
        when(input){
            "quit" -> break
        }
        try {
            var guess = input!!.toInt()
            when{
                guess in 0..10 -> {
                    when(guess){
                        selectedNumber -> println("You get it!")
                        else -> {
                            println("Wrong guess. The answer was $selectedNumber")
                            num++
                        }
                    }
                }
                else -> println("You should choose from 0 to 10")
            }
        }catch (e: Exception){
            println("Please enter numbers only.")
            continue
        }
    }
    print("Game Over")

}