package com.example.intent1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class child_activity extends AppCompatActivity implements child_activity1 {
    @Override
    public void conCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.child_activity);
        Button btn1 = (Button)  findViewById(R.id.btn1);
        TextView txt1 = (TextView) findViewById(R.id.textView1);
        btn1.setOnClickListener(new View.OnClickListener(){

                @Override
                        public void onClick(View v){
                                //TODO Auto-generated method stub
                Intent intent1 = new Intent(child_activity.this,MainActivity.class);
                                                                startActivity(intent1);
            }
        });
    }
}
