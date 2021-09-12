package practice.learning.pluralsightnotty;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import practice.learning.pluralsightnotty.adapters.DataManager;
import practice.learning.pluralsightnotty.databinding.ActivityNoteBinding;
import practice.learning.pluralsightnotty.models.CourseInfo;

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

//        Course References and Variables 📦
        List<CourseInfo> courses = DataManager.getInstance().getCourses();
        ArrayAdapter<CourseInfo> adapterCourses =
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courses);

//        Building 🏗 the spinner️
        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        courseSpinner.setAdapter(adapterCourses);
    }
}