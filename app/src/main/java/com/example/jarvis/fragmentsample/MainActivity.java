package com.example.jarvis.fragmentsample;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends FragmentActivity
        //implements HeadlinesFragment.OnHeadlineSelectedListener
{


    private Button start, pause, stop;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.news_articles);
        setContentView(R.layout.activity_main);

        String[] countries = {"India", "Pakistan", "Canada"};
        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adpter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, countries);

        auto.setThreshold(2);
        auto.setAdapter(adpter);
        auto.setTextColor(Color.BLUE);


        /*
        start = (Button) findViewById(R.id.btn_start);
        pause = (Button) findViewById(R.id.btn_pause);
        stop = (Button) findViewById(R.id.btn_stop);
        TextView path = (TextView) findViewById(R.id.path);

        start.setEnabled(false);
        pause.setEnabled(false);
        stop.setEnabled(false);
        final MediaPlayer mMediaPlayer = new MediaPlayer();
        try {

            //String path = "/" + "BadtameezDil.mp3";
            //mMediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath());
            path.setText(Environment.getExternalStorageDirectory().getPath());
            //mMediaPlayer.setDataSource("/mnt/sdcard/BadtameezDil.mp3");
            mMediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "BadtameezDil.mp3");
            mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    start.setEnabled(true);
                    pause.setEnabled(true);
                    stop.setEnabled(true);
                }
            });
            mMediaPlayer.prepareAsync();

        } catch (Exception e) {


            e.printStackTrace();
        }
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer.stop();
            }
        });
*/
    }
}
