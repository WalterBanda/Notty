package practice.learning.pluralsightnotty;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import practice.learning.pluralsightnotty.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        practice.learning.pluralsightnotty.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        TextView editText = findViewById(R.id.edit_text);

        binding.fab.setOnClickListener(view -> {
            String t = "Click on fab 🍻 \n to Increment: " + i++;
            editText.setText(t);
        });
    }
}