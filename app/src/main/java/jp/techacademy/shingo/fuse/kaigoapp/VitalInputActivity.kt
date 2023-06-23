package jp.techacademy.shingo.fuse.kaigoapp

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import jp.techacademy.shingo.fuse.kaigoapp.databinding.ActivityVitalInputBinding
import jp.techacademy.shingo.fuse.kaigoapp.databinding.ActivityMainBinding


class VitalInputActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVitalInputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVitalInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.leftImageView.setOnClickListener {
            finish()
        }
    }
}