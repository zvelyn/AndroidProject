package id.ac.poliban.e020320073.homework7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Key for saving the state of the TextView
    private TextView mTextView;
    private ProgressBar mProgressBar;
    private static final String TEXT_STATE = "CurrentText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null)getSupportActionBar();
        mTextView = findViewById(R.id.textView1);
        mProgressBar = findViewById(R.id.progressBar);

        if (savedInstanceState != null){
            mTextView.setText(savedInstanceState.getString(TEXT_STATE));
        }
    }

    public void startTask(View view) {
        mTextView.setText(R.string.napping);
        new SimpleAsyncTask(mTextView, mProgressBar).execute();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(TEXT_STATE, mTextView.getText().toString());
    }

}