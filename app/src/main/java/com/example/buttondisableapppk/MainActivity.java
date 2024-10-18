package com.example.buttondisableapppk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button buttonDisable;
    private Button buttonEnable;
    private TextView counter;
    int count = 0;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        //inicjalizacja przycisku przez id z pliku xml
        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable =findViewById(R.id.buttonEnable);
        counter =findViewById(R.id.counter);
        String text = "counter: ";

        //ustawienie nasluchiwania na klikniecie przycisku
        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Po kliknieciu przycisk zostaje dezaktywowany
                buttonDisable.setEnabled(false);
                count++;
                counter.setText(text+count);
                // wyswietlenie powiadomienia
                Toast.makeText(MainActivity.this, "Przycisk zostal wylaczony", Toast.LENGTH_SHORT).show();
            }
        });
        buttonEnable.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonDisable.setEnabled(true);
            }
        });
    }
}