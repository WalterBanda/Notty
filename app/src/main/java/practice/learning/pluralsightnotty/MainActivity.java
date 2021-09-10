package practice.learning.pluralsightnotty;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

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

//        Fab Click listener 🤔
        binding.fab.setOnClickListener(view -> {
            TextView editText = MainActivity.this.findViewById(R.id.edit_text);
            String stringValue = editText.getText().toString();
            int originalValue = Integer.parseInt(stringValue);
            int newValue = MyWorker.doubleTheValue(originalValue);
            editText.setText(Integer.toString(newValue));

            Snackbar.make(view, "Changed 📦 Value to: " + newValue + " from: " + originalValue + " 🎉", Snackbar.LENGTH_SHORT).show();
        });
    }
}