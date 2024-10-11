import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstline.setTopText("Верхняя строчка, настроенная из кода")
        binding.secondline.setBottomText("Нижняя строчка, настроенная из кода")
    }
}