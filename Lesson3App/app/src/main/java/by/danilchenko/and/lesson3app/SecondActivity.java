package by.danilchenko.and.lesson3app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Admin on 17.11.2015.
 */
public class SecondActivity extends Activity implements View.OnClickListener {
    public static final String LOG_TAG="Debug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Button secondButton=(Button) findViewById(R.id.second_button);
        secondButton.setOnClickListener(this);
        Log.d(LOG_TAG, "A2 onCreate finished");

        Intent intent= getIntent();
        String userInputText=intent.getStringExtra("userInput");

        TextView showTextView = (TextView) findViewById(R.id.showField);
        showTextView.setText(userInputText);


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "A2 onStart finished");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "A2 onResume finished");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "A2 onPause finished");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "A2 onStop finished");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "A2 onRestart finished");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "A2 onDestroy finished");
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
