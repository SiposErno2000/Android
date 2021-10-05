import java.io.File
import java.io.InputStream
import java.util.*
import kotlin.collections.ArrayList

class QuizController {
    private val questions : MutableList<Question> = ArrayList()
    lateinit var question : String
    private var list : MutableList<String> = ArrayList()
    private var counter = 1

    init {
        val input : InputStream = File("bemenet.txt").inputStream()
        input.bufferedReader().forEachLine {
            if (counter == 1) {
                question = it
                counter++
            } else if (counter == 2 || counter == 3 || counter == 4 || counter == 5) {
                list.add(it)
                counter++

                if (counter == 6) {
                    questions.add(Question(question, list))
                    list = ArrayList()
                    counter = 1
                }
            }
        }
    }

    fun randomizeQuestions() {
        questions.shuffle()
    }

    fun doQuiz() {
        randomizeQuestions()
        var correctAnswers = 0

        println("Hany kerdesre szeretnel valaszolni? Kerdesek szama:" +questions.size)
        val sc = Scanner(System.`in`)
        val num = sc.nextInt()

        if (num > 0 && num <= questions.size) {
            for (i in 0..num-1) {
                println(questions[i].question)
                println(questions[i].answers)

                print("A helyes valasz:")
                val num = sc.nextInt()
                if (num == 1) {
                    correctAnswers++
                }
            }
        } else if (num > 0 && num > questions.size){
            println("Nincsen ennyi kerdes!")
        } else {
            println("Correct/Total:${correctAnswers}/${questions.size}")
        }
    }
}