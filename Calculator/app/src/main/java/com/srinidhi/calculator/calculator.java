package com.srinidhi.calculator;

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

public class calculator extends AppCompatActivity {
    public String sign="";
    public String total="";
    public Double num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

         Button button0= (Button)findViewById(R.id.button0);
        Button button1= (Button)findViewById(R.id.button1);
        Button button2= (Button)findViewById(R.id.button2);
        Button button3= (Button)findViewById(R.id.button3);
        Button button4= (Button)findViewById(R.id.button4);
        Button button5= (Button)findViewById(R.id.button5);
        Button button6= (Button)findViewById(R.id.button6);
        Button button7= (Button)findViewById(R.id.button7);
        Button button8= (Button)findViewById(R.id.button8);
        Button button9= (Button)findViewById(R.id.button9);
        Button button00= (Button)findViewById(R.id.button00);
        Button buttonE= (Button)findViewById(R.id.buttonE);
        Button buttonA= (Button)findViewById(R.id.buttonA);
        Button buttonS= (Button)findViewById(R.id.buttonS);
        Button buttonD= (Button)findViewById(R.id.buttonD);
        Button buttonM= (Button)findViewById(R.id.buttonM);
        Button buttonC= (Button)findViewById(R.id.buttonC);
        Button buttonCos= (Button)findViewById(R.id.buttonCos);
        Button buttonSin= (Button)findViewById(R.id.buttonSin);
        Button buttonTan= (Button)findViewById(R.id.buttonTan);
        Button buttonPi= (Button)findViewById(R.id.buttonPi);

        Button buttonDot= (Button)findViewById(R.id.buttonDot);

        button0.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("0");
                    }
                }
        );
        button00.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("00");
                    }
                }
        );
        button1.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("1");
                    }
                }
        );
        button2.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("2");
                    }
                }
        );
        button3.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("3");
                    }
                }
        );
        button4.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("4");
                    }
                }
        );
        button5.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("5");
                    }
                }
        );
        button6.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("6");
                    }
                }
        );
        button7.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("7");
                    }
                }
        );
        button8.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("8");
                    }
                }
        );
        button9.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append("9");
                    }
                }
        );
        buttonDot.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append(".");
                    }
                }
        );
        buttonPi.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.append(Double.toString(Math.PI));
                    }
                }
        );
        buttonC.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        output.setText("");
                    }
                }
        );
        buttonA.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        num1=Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="+";
                    }
                }
        );
        buttonS.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        num1=Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="-";
                    }
                }
        );
        buttonD.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        num1=Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="/";
                    }
                }
        );
        buttonM.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        num1=Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="*";
                    }
                }
        );
        buttonCos.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        num1=Double.parseDouble(output.getText().toString());
                        output.setText(Double.toString(Math.cos(num1)));

                    }
                }
        );

        buttonSin.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        num1=Double.parseDouble(output.getText().toString());
                        output.setText(Double.toString(Math.sin(num1)));

                    }
                }
        );

        buttonTan.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        EditText output= (EditText)findViewById(R.id.output);
                        num1=Double.parseDouble(output.getText().toString());
                        output.setText(Double.toString(Math.tan(num1)));

                    }
                }
        );
        buttonE.setOnClickListener(

                new Button.OnClickListener() {

                    public void onClick(View v) {

                        EditText output= (EditText)findViewById(R.id.output);
                        num2 = Double.parseDouble(output.getText().toString());
                        if (sign=="+")
                        {
                            output.setText(Double.toString(num1+num2));
                        }
                        else if (sign=="-")
                        {
                            output.setText(Double.toString(num1-num2));
                        }
                        else if (sign=="/")
                        {
                            if (num2==0)
                            {
                                output.setText("Cannot divide by zero");
                            }
                            else {
                                output.setText(Double.toString(num1 / num2));
                            }
                        }
                        else if (sign=="*")
                        {
                            output.setText(Double.toString(num1*num2));
                        }
                        sign="";


                    }
                }
        );




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
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
