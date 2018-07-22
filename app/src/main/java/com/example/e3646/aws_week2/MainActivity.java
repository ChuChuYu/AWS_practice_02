package com.example.e3646.aws_week2;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private String s = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button1); //C
        btn2 = (Button)findViewById(R.id.button2); //+/-
        btn3 = (Button)findViewById(R.id.button3); //%
        btn4 = (Button)findViewById(R.id.button4); // /
        btn5 = (Button)findViewById(R.id.button5); //7
        btn6 = (Button)findViewById(R.id.button6); //8
        btn7 = (Button)findViewById(R.id.button7); //9
        btn8 = (Button)findViewById(R.id.button8); //*
        btn9 = (Button)findViewById(R.id.button9); //4
        btn10 = (Button)findViewById(R.id.button10); //5
        btn11 = (Button)findViewById(R.id.button11); //6
        btn12 = (Button)findViewById(R.id.button12); //-
        btn13 = (Button)findViewById(R.id.button13); //1
        btn14 = (Button)findViewById(R.id.button14); //2
        btn15 = (Button)findViewById(R.id.buttob15); //3
        btn16 = (Button)findViewById(R.id.button16); //+
        btn17 = (Button)findViewById(R.id.button17); //0
        btn18 = (Button)findViewById(R.id.buttob18); //.
        btn19 = (Button)findViewById(R.id.button19); //=

        btn1.setText(R.string.btn1);
        btn2.setText(R.string.btn2);
        btn3.setText(R.string.btn3);
        btn4.setText(R.string.btn4);
        btn5.setText(R.string.btn5);
        btn6.setText(R.string.btn6);
        btn7.setText(R.string.btn7);
        btn8.setText(R.string.btn8);
        btn9.setText(R.string.btn9);
        btn10.setText(R.string.btn10);
        btn11.setText(R.string.btn11);
        btn12.setText(R.string.btn12);
        btn13.setText(R.string.btn13);
        btn14.setText(R.string.btn14);
        btn15.setText(R.string.btn15);
        btn16.setText(R.string.btn16);
        btn17.setText(R.string.btn17);
        btn18.setText(R.string.btn18);
        btn19.setText(R.string.btn19);

        num = (TextView)findViewById(R.id.textView1);
        ans = (TextView)findViewById(R.id.textView);

        btn5.setOnClickListener(Number);
        btn6.setOnClickListener(Number);
        btn7.setOnClickListener(Number);
        btn9.setOnClickListener(Number);
        btn10.setOnClickListener(Number);
        btn11.setOnClickListener(Number);
        btn13.setOnClickListener(Number);
        btn14.setOnClickListener(Number);
        btn15.setOnClickListener(Number);
        btn17.setOnClickListener(Number);

        btn4.setOnClickListener(Calculate);
        btn8.setOnClickListener(Calculate);
        btn12.setOnClickListener(Calculate);
        btn16.setOnClickListener(Calculate);

        btn19.setOnClickListener(new OnClickListener) {

            @Override
            public void onClick(View v){
                double n2 = Double.parseDouble((num.getText().toString()));
                DecimalFormat nf = new DecimalFormat("0.00")

                if(s.equal("+")){
                    ans.setText(nf.format(n1+n2));
                        }
                else if(s.equal("-")){
                    ans.setText(nf.format(n1-n2));
                }
                else if(s.equal("*")){
                    ans.setText(nf.format(n1*n2));
                }
                else if(s.equal("/")){
                    ans.setText(nf.format(n1/n2));
                }
                num.setText("");

            }

        }

        private Button.OnClickListener Number = new Button.OnClickListener()


        @override
         public void onClick(View v){
            String text = num.getText().toString();
            switch(v.getId()){
                case R.id.button17:
                {num.setText(text+"0");
                break;}

                case R.id.button13:
                {num.setText(text+"1");
                break;}

                case R.id.button14:
                {num.setText(text+"2");
                break;}

                case R.id.button15:
                {num.setText(text+"3");
                break;}

                case R.id.button9:
                {num.setText(text+"4");
                break;}

                case R.id.button10:
                {num.setText(text+"5");
                break;}

                case R.id.button11:
                {num.setText(text+"6");
                break;}

                case R.id.button5:
                {num.setText(text+"7");
                break;}

                case R.id.button6:
                {num.setText(text+"8");
                break;}

                case R.id.button7:
                {num.setText(text+"9");
                break;}

            }

            public Button.OnClick(View v){

                try{
                    num = Double.parseDouble(num.getText().toString());
                }
                catch{
                    (Exception e){

                    }

                    num.setText("");
                    switch(v.getId()){
                        case R.id.button16:
                        {s = "+";
                            break;}

                        case R.id.button12:
                        {s = "-";
                            break;}

                        case R.id.button8:
                        {s = "*";
                            break;}

                        case R.id.button4:
                        {s = "/";
                            break;}

                    }
                }

            @override
            public boolean onCreateOptionMenu(Menu menu){
                    getMenuInflater().inflate(R.menu.AWS_week2, menu);
                    return true;
                }
            }
        }
    }

}
