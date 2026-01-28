package com.example.mystery_helper_app;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.mystery_helper_app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //String Variable
    private String[] plot_lines;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //UI material
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Taking plot ideas from string.xml
        plot_lines = getResources().getStringArray(R.array.plot_fragments);

        //Logic to get radom text from strings.xml
        binding.getHelpButton.setOnClickListener(v -> {
            int random_index = (int) (Math.random() * plot_lines.length);
            binding.outputText.setText(plot_lines[random_index]);
        });
    }
}