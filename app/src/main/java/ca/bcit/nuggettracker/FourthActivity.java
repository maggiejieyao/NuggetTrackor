package ca.bcit.nuggettracker;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class FourthActivity extends YouTubeBaseActivity {
    private static final String TAG = "FourthActivity";
    YouTubePlayerView mYouTubePlayerView;
    Button display;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Log.d(TAG, "OnCreate:Starting");
        //display = (Button)findViewById(R.id.butReplay);
        mYouTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtubePlayer);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "OnClick: Done Intializing.");
                youTubePlayer.loadVideo("gFAZVWd5Edk");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "OnClick: Failed Intializing.");

            }
        };
        /*display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "OnClick: Intializing YouTube Player.");
                mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(), mOnInitializedListener);

            }
        });*/
        Log.d(TAG, "OnClick: Intializing YouTube Player.");
        mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(),mOnInitializedListener);


    }

}
