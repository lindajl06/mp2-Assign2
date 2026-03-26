package que.tal.holalingo

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import que.tal.holalingo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.edButton.setOnClickListener {
            val userInput = binding.edAnswer.text.toString().trim()
            if (userInput.equals("Selamat Pagi", ignoreCase = true)) {
                binding.edCheck.text = "¡Muy bien! Jawaban Benar"
                binding.edCheck.setTextColor(Color.GREEN)
            } else {
                binding.edCheck.text = "Lo siento, coba lagi!"
                binding.edCheck.setTextColor(Color.RED)
            }
        }
    }
}