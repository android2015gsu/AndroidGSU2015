package by.danilchenko.and.lesson3app;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Admin on 03.11.2015.
 */
public class MainActivity extends Activity implements View.OnClickListener {
    public static final String LOG_TAG="Debug";
    Button button1=null;
    Button button2=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        button1= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        String button1Text=button1.getText().toString();
        button2.setText("NEW BUTTON 2 NAME");

        Log.d(LOG_TAG,"onCreate finished");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart finished");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume finished");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause finished");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop finished");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart finished");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy finished");
    }

    @Override
    public void onClick(View view) {
        if(view.getId()!=0) switch (view.getId()) {
            case R.id.button1:
                Log.d(LOG_TAG, "Button 1 Clicked");
                Toast.makeText(getApplicationContext(),"Button1 Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Log.d(LOG_TAG, "Button 2 Clicked");
                Toast.makeText(getApplicationContext(),"Button2 Clicked",Toast.LENGTH_LONG).show();
                
                break;

        }
    }
}
