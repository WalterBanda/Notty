package practice.learning.pluralsightnotty;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import practice.learning.pluralsightnotty.databinding.ActivityNoteBinding;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Bind the android xml to the activity
        ActivityNoteBinding binding = ActivityNoteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        Create Toolbar 🛠
        setSupportActionBar(binding.toolbar);

//        Layout 🏗 References
        Spinner courseSpinner = findViewById(R.id.spinner_courses);
    }
}