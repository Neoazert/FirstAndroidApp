package com.p1502985.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button bouton;
    int i =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","create");

        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.text);
        bouton = (Button) findViewById(R.id.button_click);

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                tv.setText(""+i);
                bouton.setText(R.string.Merci);
                Log.d("MainActivity","onClick");


            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","stop");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","start");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","Destroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","Pause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","Resume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","Restart");

    }


}
