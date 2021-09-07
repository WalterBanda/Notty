package practice.learning.pluralsightnotty;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import practice.learning.pluralsightnotty.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //    Class Global Variables
    Boolean changedTextState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        practice.learning.pluralsightnotty.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        TextView editText = findViewById(R.id.edit_text);

        binding.fab.setOnClickListener(view -> {
            changedTextState = !changedTextState;
            String textState = changedTextState ? "Changed the Text 🎉" : "🐚 Hello Edit Me Click on the fab";
            editText.setText(textState);
            Snackbar.make(view, "Changed the text to" + textState, Snackbar.LENGTH_SHORT)
                    .setAction("Action", null).show();
        });
    }
}