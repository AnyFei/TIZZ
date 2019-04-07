package emil.tizzzeik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ObliczBMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oblicz_bmi);
        final EditText wzrost = findViewById(R.id.wzrostET);
        final EditText masa = findViewById(R.id.masaET);
        Button oblicz = findViewById(R.id.obliczBtn);
        final TextView wynikTV = findViewById(R.id.wynikTV);
        final TextView opisBMITV = findViewById(R.id.opisBMITV);
        final Double[] wynikD = new Double[1];


        oblicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Double wzrostD = Double.valueOf(wzrost.getText().toString());
                final Double masaD = Double.valueOf(masa.getText().toString());
                wynikD[0] = (masaD/(wzrostD*wzrostD))*10000;
                wynikTV.setText(new DecimalFormat("##.##").format(wynikD[0]));
                if(wynikD[0]<18.5) opisBMITV.setText("Niedowaga. Żryj więcej!");
                else if(wynikD[0]<25) opisBMITV.setText("Wartość prawidłowa! Kontynuuj żarcie!");
                else opisBMITV.setText("Nadwaga. Żryj mniej!");
            }
        });




    }
}
