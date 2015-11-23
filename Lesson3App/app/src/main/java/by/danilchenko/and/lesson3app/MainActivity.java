package by.danilchenko.and.lesson3app;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Admin on 03.11.2015.
 */
public class MainActivity extends Activity implements View.OnClickListener {
    public static final String LOG_TAG="Debug";
    Button button1=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        button1= (Button) findViewById(R.id.button1);


        button1.setOnClickListener(this);

        String button1Text=button1.getText().toString();

        Log.d(LOG_TAG,"A1 onCreate finished");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "A1 onStart finished");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "A1 onResume finished");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "A1 onPause finished");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "A1 onStop finished");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "A1 onRestart finished");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "A1 onDestroy finished");
    }

    @Override
    public void onClick(View view) {
        if(view.getId()!=0) switch (view.getId()) {
            case R.id.button1:
                Log.d(LOG_TAG, "Button 1 Clicked");
                Toast.makeText(getApplicationContext(),"Button1 Clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,SecondActivity.class);
                EditText textEdit=(EditText) findViewById(R.id.editField);
                String textInputValue=textEdit.getText().toString();
                Log.d(LOG_TAG, "Input:"+textInputValue);
                intent.putExtra("userInput",textInputValue);

                startActivity(intent);

                break;


        }
    }
}
