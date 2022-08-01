package nr.com.up.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView textViewTitle = findViewById(R.id.text_title);
         textViewTitle.setText("Olá turma de ADS");
         textViewTitle.setTextColor(Color.RED);

         TextView textView = findViewById(R.id.text_tantativa);
         textView.setText("Olá turma de ADS - Segunda-feira");

         TextView button2 = findViewById(R.id.button2);
         button2.setText("Click em mim");



    }
}








































