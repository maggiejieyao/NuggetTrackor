package ca.bcit.nuggettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private int counter2;
    public static final String EXTRA_NUMBER2 = "ca.bcit.nuggettracker.EXTRA_NUMBER2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent myIntent = getIntent();
        counter2 = (int)myIntent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);
        EditText nugCounter = findViewById(R.id.nugCount);
        nugCounter.setText(""+counter2);
    }

    public void submitFunction(View view){
        Intent myIntent = new Intent(this, ThirdActivity.class);
        EditText nugCounter = findViewById(R.id.nugCount);
        String nugString = nugCounter.getText().toString();
        int nugC = new Integer(nugString).intValue();
        myIntent.putExtra(EXTRA_NUMBER2, nugC);
        startActivity(myIntent);
    }


}
