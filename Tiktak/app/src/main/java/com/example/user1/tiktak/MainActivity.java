package com.example.user1.tiktak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    CharSequence a="null",win="null",first,second,third,fourth,fifth,sixth,seventh,eight,nine;
    static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.bt1);
        b2=(Button)findViewById(R.id.bt2);
        b3=(Button)findViewById(R.id.bt3);
        b4=(Button)findViewById(R.id.bt4);
        b5=(Button)findViewById(R.id.bt5);
        b6=(Button)findViewById(R.id.bt6);
        b7=(Button)findViewById(R.id.bt7);
        b8=(Button)findViewById(R.id.bt8);
        b9=(Button)findViewById(R.id.bt9);
        b10=(Button)findViewById(R.id.bt10);
        b11=(Button)findViewById(R.id.bt11);
        b12=(Button)findViewById(R.id.bt12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 a=b1.getText();
                 b3.setText("");
                 b4.setText("");
                 b5.setText("");
                 b6.setText("");
                 b7.setText("");
                 b8.setText("");
                 b9.setText("");
                 b10.setText("");
                 b11.setText("");
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b10.setEnabled(true);
                b11.setEnabled(true);
                count=0;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 a=b2.getText();
                 b3.setText("");
                 b4.setText("");
                 b5.setText("");
                 b6.setText("");
                 b7.setText("");
                 b8.setText("");
                 b9.setText("");
                 b10.setText("");
                 b11.setText("");
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b10.setEnabled(true);
                b11.setEnabled(true);
                count=0;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(a.equals("x")){
                     b3.setText("x");
                     a="0";
                     win="x";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("0")){
                    b3.setText("0");
                    a="x";
                    win="0";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("null")){
                    Toast.makeText(MainActivity.this,"please select your choice",Toast.LENGTH_SHORT).show();
                }
                b3.setEnabled(false);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(a.equals("x")){
                    b4.setText("x");
                    a="0";
                    win="x";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("0")){
                    b4.setText("0");
                    a="x";
                    win="0";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("null")){
                    Toast.makeText(MainActivity.this,"please select your choice",Toast.LENGTH_SHORT).show();
                }
                b4.setEnabled(false);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b5.setEnabled(false);
                if(a.equals("x")){
                    b5.setText("x");
                    a="0";
                    win="x";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("0")){
                    b5.setText("0");
                    a="x";
                    win="0";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("null")){
                    Toast.makeText(MainActivity.this,"please select your choice",Toast.LENGTH_SHORT).show();
                }
                b5.setEnabled(false);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b6.setEnabled(false);
                if(a.equals("x")){
                    b6.setText("x");
                    a="0";
                    win="x";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("0")){
                    b6.setText("0");
                    a="x";
                    win="0";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("null")){
                    Toast.makeText(MainActivity.this,"please select your choice",Toast.LENGTH_SHORT).show();
                }
                b6.setEnabled(false);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b7.setEnabled(false);
                if(a.equals("x")){
                    b7.setText("x");
                    a="0";
                    win="x";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("0")){
                    b7.setText("0");
                    a="x";
                    win="0";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("null")){
                    Toast.makeText(MainActivity.this,"please select your choice",Toast.LENGTH_SHORT).show();
                }
                b7.setEnabled(false);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b8.setEnabled(false);
                if(a.equals("x")){
                    b8.setText("x");
                    a="0";
                    win="x";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("0")){
                    b8.setText("0");
                    a="x";
                    win="0";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("null")){
                    Toast.makeText(MainActivity.this,"please select your choice",Toast.LENGTH_SHORT).show();
                }
                b8.setEnabled(false);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b9.setEnabled(false);
                if(a.equals("x")){
                    b9.setText("x");
                    a="0";
                    win="x";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("0")){
                    b9.setText("0");
                    a="x";
                    win="0";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("null")){
                    Toast.makeText(MainActivity.this,"please select your choice",Toast.LENGTH_SHORT).show();
                }
                b9.setEnabled(false);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(a.equals("x")){
                    b10.setText("x");
                    a="0";
                    win="x";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("0")){
                    b10.setText("0");
                    a="x";
                    win="0";
                    count++;
                    if(count>=3)
                        myfun();
                }
                else if(a.equals("null")){
                    Toast.makeText(MainActivity.this,"please select your choice",Toast.LENGTH_SHORT).show();
                }
                b10.setEnabled(false);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(a.equals("x")){
                    b11.setText("x");
                    a="0";
                    win="x";
                    count++;
                    if(count>=3)
                    myfun();
                }
                else if(a.equals("0")){
                    b11.setText("0");
                    a="x";
                    win="0";
                    count++;
                    if(count>=3)
                    myfun();
                }
                else if(a.equals("null")){
                    Toast.makeText(MainActivity.this,"please select your choice",Toast.LENGTH_SHORT).show();
                }
                b11.setEnabled(false);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                b10.setText("");
                b11.setText("");
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b10.setEnabled(true);
                b11.setEnabled(true);
                a="null";
                count=0;
                Toast.makeText(MainActivity.this,"select your option",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void myfun(){
        first=b3.getText();
        second=b4.getText();
        third=b5.getText();
        fourth=b6.getText();
        fifth=b7.getText();
        sixth=b8.getText();
        seventh=b9.getText();
        eight=b10.getText();
        nine=b11.getText();
        if(first.equals(second)&&second.equals(third)&&third.equals("")==false||
                fourth.equals(fifth)&&fifth.equals(sixth)&&sixth.equals("")==false||
                seventh.equals(eight)&&eight.equals(nine)&&nine.equals("")==false||
                first.equals(fourth)&&fourth.equals(seventh)&&seventh.equals("")==false||
                second.equals(fifth)&&fifth.equals(eight)&&eight.equals("")==false||
                third.equals(sixth)&&sixth.equals(nine)&&nine.equals("")==false||
                first.equals(fifth)&&fifth.equals(nine)&&nine.equals("")==false||
                third.equals(fifth)&&fifth.equals(seventh)&&seventh.equals("")==false)
        {
            Toast.makeText(MainActivity.this,win+"is winner",Toast.LENGTH_SHORT).show();
            first="null";
            second="null";
            third="null";
            fourth="null";
            fifth="null";
            sixth="null";
            seventh="null";
            eight="null";
            nine="null";
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
        }
        else if(count==9)
        {
            Toast.makeText(MainActivity.this,"match tie",Toast.LENGTH_SHORT).show();
            first="null";
            second="null";
            third="null";
            fourth="null";
            fifth="null";
            sixth="null";
            seventh="null";
            eight="null";
            nine="null";
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
        }
    }
}
