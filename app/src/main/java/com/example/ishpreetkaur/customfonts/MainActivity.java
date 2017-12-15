package com.example.ishpreetkaur.customfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text1);
        t2=findViewById(R.id.text2);
        t3=findViewById(R.id.text3);
        t4=findViewById(R.id.text4);
        Typeface  customFont1= Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        t1.setTypeface(customFont1);

        Typeface customFont2=Typeface.createFromAsset(getAssets(),"fonts/AllerDisplay.ttf");
        t2.setTypeface(customFont2);

        Typeface customFont3=Typeface.createFromAsset(getAssets(),"fonts/Aller_Bd.ttf");
        t3.setTypeface(customFont3);

        Typeface customFont4=Typeface.createFromAsset(getAssets(),"fonts/Aller_Lt.ttf");
        t4.setTypeface(customFont4);
    }
}
