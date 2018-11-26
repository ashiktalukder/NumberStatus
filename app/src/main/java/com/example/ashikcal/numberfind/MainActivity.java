package com.example.ashikcal.numberfind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;

    private Button button;
    private Button button2;
    private TextView resulttextView;
    private TextView resulttextView2;
    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        resulttextView = (TextView) findViewById(R.id.resultTextview);
         button = (Button) findViewById(R.id.button);

      button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try{

            int number =Integer.parseInt (editText.getText().toString());

            boolean flag = false ;
            for(int i=2;i<number/2;i++){
                if(number % i ==0){
                    flag=true;
                    break;
                }

            }
            if(!flag){
                resulttextView.setText(number + " ..is prime number");
            }
            else resulttextView.setText(number + " ..is Not prime number");


        }catch (Exception e){

            Toast.makeText(MainActivity.this,"Please enter number",Toast.LENGTH_SHORT).show();
        }

        editText = (EditText) findViewById ( R.id.editText );
        resulttextView2 = (TextView) findViewById ( R.id.resultTextview2 );
        button2 = (Button) findViewById ( R.id.button2 );

        button2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                try{

                    int number2 = Integer.parseInt ( editText.getText ().toString () );
                    if(number2 %2 == 0){
                        resulttextView2.setText ( number2 +"..is Even number" );
                    }else resulttextView2.setText ( number2 +"..is Odd number" );

                }

                catch (Exception e){

                    Toast.makeText(MainActivity.this,"Please enter number",Toast.LENGTH_SHORT).show();
                }
            }

        } );


            }



}
