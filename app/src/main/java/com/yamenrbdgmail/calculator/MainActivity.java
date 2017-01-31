package com.yamenrbdgmail.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText firstNum;
    private EditText secondNum;
    private TextView result;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn1= (Button) findViewById(R.id.plus);
        btn2= (Button) findViewById(R.id.minus);
        btn3= (Button) findViewById(R.id.divide);
        btn4= (Button)findViewById(R.id.multiply);
        btn5 = (Button) findViewById(R.id.clc);
        firstNum = (EditText) findViewById(R.id.operand1);
        secondNum = (EditText) findViewById(R.id.operand2);
        result = (TextView) findViewById(R.id.result);


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstNum.setText("");
                secondNum.setText("");
                result.setText("0.0");
                firstNum.requestFocus();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((firstNum.getText().length()>0) && (secondNum.getText().length()>0)){
                    double op1 = Double.parseDouble(firstNum.getText().toString());
                    double op2 = Double.parseDouble(secondNum.getText().toString());
                    double res=op1+op2;
                    result.setText(Double.toString(res));

                }
                else{
                    Toast.makeText(MainActivity.this,"pleas enter numbers first",Toast.LENGTH_LONG).show();
                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((firstNum.getText().length()>0)&& (secondNum.getText().length()>0)){
                    double op1 = Double.parseDouble(firstNum.getText().toString());
                    double op2 = Double.parseDouble(secondNum.getText().toString());
                    double res=op1-op2;
                    result.setText(Double.toString(res));
                }
               else{
                    Toast.makeText(MainActivity.this,"pleas enter the numbers",Toast.LENGTH_LONG).show();
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((firstNum.getText().length()>0)&&(secondNum.getText().length()>0)){
                    double op1 = Double.parseDouble(firstNum.getText().toString());
                    double op2 = Double.parseDouble(secondNum.getText().toString());
                    double res=op1/op2;
                    result.setText(Double.toString(res));
                }
               else{
                    Toast.makeText(MainActivity.this,"pleas enter the numbers",Toast.LENGTH_LONG).show();
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((firstNum.getText().length()>0)&& (secondNum.getText().length()>0)){
                    double op1 = Double.parseDouble(firstNum.getText().toString());
                    double op2 = Double.parseDouble(secondNum.getText().toString());
                    double res=op1*op2;
                    result.setText(Double.toString(res));
                }
                else {
                    Toast.makeText(MainActivity.this,"pleas enter the numbers",Toast.LENGTH_LONG).show();
                }


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
