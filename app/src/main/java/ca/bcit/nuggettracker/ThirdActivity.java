package ca.bcit.nuggettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent myIntent = getIntent();
        int counter3 = (int)myIntent.getIntExtra(SecondActivity.EXTRA_NUMBER2, 0);
        int chickens = (int)counter3 / 50;
        int calories = (int)counter3 * 60;
        TextView totalNug = findViewById(R.id.totalNugget);
        if(chickens < 1){
            totalNug.setText("You ate only "+counter3+" pieces nugget,"+"\n"+"And "+calories+" calories...");
        }else{
            totalNug.setText("You ate "+chickens+" chickens,\n"+"And "+calories+" calories...");
        }


        /*Button openVideo = findViewById(R.id.openURL);
        openVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playVideo("gFAZVWd5Edk");
                Log.i("Video", "Video Playing....");

            }
        });
*/
    }
    public void openAct(View view){
        Intent myIntent3 = new Intent(this, FourthActivity.class);
        startActivity(myIntent3);

    }

}
