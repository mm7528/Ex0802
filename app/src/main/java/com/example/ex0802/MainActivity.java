package com.example.ex0802;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    View view1;
    Switch switch1;
    RadioButton rb1,rb2,rb3,rb4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1= (View)findViewById(R.id.main_layout);
        btn=(Button)findViewById(R.id.button);
        switch1=(Switch)findViewById(R.id.swch);
        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
        rb3=(RadioButton) findViewById(R.id.rb3);
        rb4=(RadioButton) findViewById(R.id.rb4);
        btn.setEnabled(false);
    }

    public void changeMode(View view) {
        if(switch1.isChecked()) {
            btn.setEnabled(true);
        }
        else{
            btn.setEnabled(false);
        }
    }

    public void btnClick(View view) {

       if(rb1.isChecked()) view1.setBackgroundColor(Color.YELLOW);
       else if(rb2.isChecked()) view1.setBackgroundColor(Color.GREEN);
       else if(rb3.isChecked()) view1.setBackgroundColor(Color.CYAN);
       else view1.setBackgroundColor(Color.MAGENTA);
    }

    public void rdClick(View view) {
        if(! btn.isEnabled()){
            if(rb1.isChecked()) view1.setBackgroundColor(Color.YELLOW);
            else if(rb2.isChecked()) view1.setBackgroundColor(Color.GREEN);
            else if(rb3.isChecked()) view1.setBackgroundColor(Color.CYAN);
            else view1.setBackgroundColor(Color.MAGENTA);
        }
    }
}
