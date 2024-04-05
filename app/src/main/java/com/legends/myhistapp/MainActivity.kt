package com.legends.myhistapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // declare variables
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)


        searchButton.setOnClickListener {
            // create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            // if age is not full and age is in range between 20 and 50
            if (age != null && age in 20..100) {
                // when age is 30 display Thato else when is .. and so on
                val employeeName = when (age) {
                    39 -> "Martin Luther King" +
                            "----"+
                            "Martin Luther King Jr. is widely recognized for his significant role in the American civil rights movement during the 1960s. His most renowned work is the \"I Have a Dream\" speech, presented in 1963. In this iconic address, he shared his vision of a United States free from segregation and racial prejudice."
                    47 -> "Alexander Hamilton " + "----" +
                            "Alexander Hamilton, a notable figure in the formation of the United States, made a name during the American Revolutionary War, played a crucial role in the creation of the Constitution, and held the position of the first treasury secretary. Hamilton is celebrated as the architect of the American financial system, having laid its cornerstone."
                    73 -> "Charles Darwin" + "----" +
                            " "
                    62 -> "Aristotle" + "----"+
                            "Aristotle is a highly influential philosopher in ancient Greek history, who delivered significant advancements in various disciplines, including logic, critique, rhetoric, physics, biology, psychology, mathematics, metaphysics, ethics, and politics. After twenty years as a student under Plato, Aristotle gained fame for diverging from Plato's theory of forms. Compared to both Plato and Socrates, Aristotle demonstrated a stronger inclination towards empirical thought."
                    50 -> "Micheal Jackson" + "----" +
                            "Michael Joseph Jackson was a prominent American musician, composer, and dancer, regarded as one of the most impactful and legendary pop music performers ever. He gained the nickname \"King of Pop\" from his close friend, actress Elizabeth Taylor, which subsequently became popular among his admirers."
                    78 -> "Mahatma Gandhi" + "----" +
                            ""
                    65-> "Walt Disney" + "----" +
                            "Walter Elias Disney was a groundbreaking American figure in the realm of motion pictures and television, celebrated for his innovation in animated cartoons and the creation of iconic characters such as Mickey Mouse and Donald Duck. He is also recognized for conceptualizing and establishing Disneyland, a massive amusement park that welcomed visitors outside Los Angeles starting in 1955."
                    80 -> "Donatello" + "----" +
                            "Donato di Niccolò di Betto Bardi, affectionately known as Donatello, was a distinguished early Renaissance artist born in Florence around 1386 and passed away in the same city in 1466. His exceptional talent and expressive creations solidified his reputation as the most remarkable sculptor of his time. Donatello's sculptures, crafted in marble, bronze, and wood, showcased anatomical accuracy and individuality in a way that had not been seen since antiquity."
                    65 -> "Genghis Khan" + "----" +
                            "Genghis Khan, originally named Temujin, was a military mastermind who rose from humble beginnings to establish a dominant Mongol Empire. After uniting the nomadic tribes of the Mongolian plateau, he embarked on a conquest that expanded the empire across vast expanses of central Asia and China. His descendants continued the expansion, reaching as far as Poland, Vietnam, Syria, and Korea. At its height, the Mongol Empire encompassed approximately 11 to 12 million square miles, comparable to the size of Africa."
                    56 -> "Adolf Hitler" + "----" +
                            "Adolf Hitler, born in Austria and a German politician, assumed the role of Nazi Germany's dictator from 1933 until his demise in 1945. He gained power as the Nazi Party's leader, becoming chancellor in 1933, and later took the title of Führer und Reichskanzler in 1934."

                    else -> null
                }

                val message = if (employeeName != null) " $employeeName."
                else "No historical figure around the age of $age"
                resultTextView.text = message


            } else {
                resultTextView.text =
                    "Invalid input. Please enter a valid age between 20 and 100."
            }


        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}