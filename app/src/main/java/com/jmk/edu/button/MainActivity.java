package com.jmk.edu.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickWidget(View view){
        int id=view.getId(); String text=null;
        switch(id){
            case R.id.buttonToast:
                text=((Button)view).getText().toString();text="nice"; break;
            case R.id.button4:
               text=((Button)view).getText().toString();
             text="day";break;
            case R.id.toggleButton:
                text=((Button)view).getText().toString();
                break;
            case R.id.button5:
                text=((Button)view).getText().toString();
             text="love";break;
        }
        Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();
    }
}
