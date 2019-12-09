package com.example.calcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText et1, et2, et3;
    private TextView tv1, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
    }
    public void calcular(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        String valor3=et3.getText().toString();
        int a=Integer.parseInt(valor1);
        int b=Integer.parseInt(valor2);
        int c=Integer.parseInt(valor3);
        double v=Math.pow(b,2)-4*a*c;
        if(v>0){
            double x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            double x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            String resu1=String.valueOf(x1);
            tv1.setText(resu1);
            String resu2=String.valueOf(x2);
            tv2.setText(resu2);
        }
        if(v<0){
            double r=-b/(2*a);
            double c1=Math.sqrt(-1*(Math.pow(b,2)-4*a*c))/(2*a);
            String real=String.valueOf(r);
            String compl=String.valueOf(c1);
            tv1.setText(real+"+"+compl+"i");
            tv2.setText(real+"-"+compl+"i");
        }
        if(a==0){

        }
    }

}
