package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2,n3;
    TextView  Text;
    Button button;



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        try {
            int a = Integer.parseInt(n3.getText().toString());
        }
        catch (NumberFormatException e){
            System.out.println("HI");
        }
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 0;
                if (a == 1){
                    int sum= Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());;
                    Text.setText("The answer is :"+sum);

                } else if (a==2) {
                    int min= Integer.parseInt(n1.getText().toString())-Integer.parseInt(n2.getText().toString());;
                    Text.setText("The answer is :"+min);


                } else if (a==3) {
                    int mul= Integer.parseInt(n1.getText().toString())*Integer.parseInt(n2.getText().toString());;
                    Text.setText("The answer is :"+mul);


                } else if (a==4) {
                    int div= Integer.parseInt(n1.getText().toString())/Integer.parseInt(n2.getText().toString());;
                    Text.setText("The answer is :"+div);


                }

            }
        });




    }
}