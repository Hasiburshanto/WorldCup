package com.example.shanto.worldcup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class OpeningPage extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_opening_page);
        progressBar=findViewById(R.id.progressBarID);
        Thread thread =new Thread((new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        }));
        thread.start();

    }
    public void doWork() {

        for (progress = 10; progress < 110; progress = progress + 10) {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        Intent intent=new Intent(OpeningPage.this,MenuBar.class);
        startActivity(intent);
    }
}
