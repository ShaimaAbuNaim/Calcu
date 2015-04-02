package com.example.abunaim.calcu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    TextView answer;
    TextView screenshow;
    String result1 = "", result2 = "";//always consider inputs as two number inputs
    float finalresult = 0;
    String operator = "";
    int addtomemory=0;
    // int size=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenshow = (TextView) findViewById(R.id.txtdisply);
        screenshow.setText("0");


        Button value0 = (Button) findViewById(R.id.button0);
        Button value1 = (Button) findViewById(R.id.button1);
        Button value2 = (Button) findViewById(R.id.button2);
        Button value3 = (Button) findViewById(R.id.button3);
        Button value4 = (Button) findViewById(R.id.button4);
        Button value5 = (Button) findViewById(R.id.button5);
        Button value6 = (Button) findViewById(R.id.button6);
        Button value7 = (Button) findViewById(R.id.button7);
        Button value8 = (Button) findViewById(R.id.button8);
        Button value9 = (Button) findViewById(R.id.button9);

        Button equal = (Button) findViewById(R.id.buttonequ);
        Button add = (Button) findViewById(R.id.buttonsum);
        Button substract = (Button) findViewById(R.id.buttonsub);
        Button multiply = (Button) findViewById(R.id.buttonmul);
        Button div = (Button) findViewById(R.id.buttonsqr);
        Button clear = (Button) findViewById(R.id.buttonc);
        Button back = (Button) findViewById(R.id.buttonbck);
        Button addmemory=(Button)findViewById(R.id.buttonaddmem);
        Button memoryclear=(Button)findViewById(R.id.buttonmc);
        Button memoryread=(Button)findViewById(R.id.buttonmr);

        value0.setOnClickListener(this);
        value1.setOnClickListener(this);
        value2.setOnClickListener(this);
        value3.setOnClickListener(this);
        value4.setOnClickListener(this);
        value5.setOnClickListener(this);
        value6.setOnClickListener(this);
        value7.setOnClickListener(this);
        value8.setOnClickListener(this);
        value9.setOnClickListener(this);
        // decimalPoint.setOnClickListener(this);
        add.setOnClickListener(this);
        substract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        div.setOnClickListener(this);
        clear.setOnClickListener(this);
        back.setOnClickListener(this);
        equal.setOnClickListener(this);
        addmemory.setOnClickListener(this);
        memoryclear.setOnClickListener(this);
        memoryread.setOnClickListener(this);

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

    public void shownumbers(String num){
        Toast t = Toast.makeText(getApplicationContext(),"the max length is 19 ",Toast.LENGTH_SHORT);
        if (screenshow.getText().toString().length() >= 19) {
            t.show();

        }else if (screenshow.getText().toString()=="0") {
                screenshow.setText(num);
                result1+=num;
            }else {

            screenshow.setText(screenshow.getText().toString() + num);
            result1 += num;


        }


    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.button0:
                shownumbers("0");


                break;

            case R.id.button1:

              shownumbers("1");


                break;

            case R.id.button2:


                shownumbers("2");
                break;

            case R.id.button3:
               shownumbers("3");

                break;

            case R.id.button4:
               shownumbers("4");
                break;

            case R.id.button5:
             shownumbers("5");
                break;

            case R.id.button6:
               shownumbers("6");
                break;

            case R.id.button7:
               shownumbers("7");
                break;

            case R.id.button8:
               shownumbers("8");
                break;

            case R.id.button9:
               shownumbers("9");
                break;


            case R.id.buttonequ: //equal sign
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("*")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(screenshow.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = screenshow.getText().toString();
                result2 = "";
                operator = "=";//equal
                screenshow.setText("\n" + "=" + String.valueOf(finalresult));
                break;

            case R.id.buttonsum:



                //addition

                screenshow.setText(screenshow.getText().toString() + "+");
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("*")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(screenshow.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = "";
                result2 = "";
                operator = "+";//addition



                break;

            case R.id.buttonsub: //substraction
                screenshow.setText(screenshow.getText().toString() + "-");
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("*")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(screenshow.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = "";
                result2 = "";
                operator = "-";//substraction
                break;

            case R.id.buttonmul://multiplication
                screenshow.setText(screenshow.getText().toString() + "*");
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("*")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(answer.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = "";
                result2 = "";
                operator = "*";//multiplication
                break;

            case R.id.buttonsqr: //devision
                screenshow.setText(screenshow.getText().toString() + "/");
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("*")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(answer.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = "";
                result2 = "";
                operator = "/";//devision
                break;

            case R.id.buttonc: //clear
                screenshow.setText("");
                result1 = "";
                result2 = "";
                operator = "";
                finalresult = 0;
                break;
            case R.id.buttonbck:
                if (screenshow.getText().toString().length() > 0) {
                    int start = 0;
                    int end = screenshow.getText().toString().length() - 1;
                    String bcktxt = screenshow.getText().toString().substring(start, end);
                    screenshow.setText(bcktxt);

                    break;

                }
            case R.id.buttonaddmem:
                addtomemory = Integer.parseInt(screenshow.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), "the value added to memory", Toast.LENGTH_SHORT);
                toast.show();
                break;


            case R.id.buttonmc:
                addtomemory=0;
                break;
            case R.id.buttonmr:
                screenshow.setText(addtomemory+"");

                result1= addtomemory+"";
                addtomemory=0;




        }
    }
}

