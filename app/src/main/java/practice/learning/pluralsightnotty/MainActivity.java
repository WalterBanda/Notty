package practice.learning.pluralsightnotty;

import static practice.learning.pluralsightnotty.MyWorker.doubleTheValue;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import practice.learning.pluralsightnotty.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Bind the android xml to the activity
        practice.learning.pluralsightnotty.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        Create Toolbar 🛠
        setSupportActionBar(binding.toolbar);

//        View variable bindings 📦
        TextView editText = findViewById(R.id.edit_text);

//        Fab Click listener 🤔
        binding.fab.setOnClickListener(view -> editText.setText(doubleTheValue(Integer.parseInt(editText.getText().toString()))));
    }
}