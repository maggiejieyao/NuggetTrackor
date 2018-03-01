package ca.bcit.nuggettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER = "ca.bcit.nuggettracker.EXTRA_NUMBER";
    private int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void didTapButton(View view) {
        ImageButton button = (ImageButton) findViewById(R.id.nugget);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        BounceInterpolator interpolator = new BounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }

    public void IncreaseInteger(View view) {
        didTapButton(view);
        counter = counter + 1;
        display(counter);
    }
    private void display(int number){
        TextView displayInteger = (TextView)findViewById(R.id.nuggetNum);
        displayInteger.setText("Count: "+ number);
    }

    public void submitFunction(View view){
        Intent myIntent = new Intent(this, SecondActivity.class);
        myIntent.putExtra(EXTRA_NUMBER, counter);
        startActivity(myIntent);
    }
}
