package emil.tizzzeik;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Cwiczenie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cwiczenie);
        final Button zrobione = findViewById(R.id.zroboneBtn);
        Button anuluj = findViewById(R.id.anulujBtn);
        SharedPreferences sharedPref = this.getSharedPreferences(
                "poziom", Context.MODE_PRIVATE);
        final String ustawionyPoziom = sharedPref.getString("poziomUzytkownika", "brak");
        String rodzajCwiczenia = getIntent().getStringExtra("rodzajCwiczenia");
        final TextView cwiczenieTV = findViewById(R.id.cwiczenieTV);
        final int[] powtorzenia;
        double mnoznik;
        switch (ustawionyPoziom){
            case "nowicjusz": mnoznik = 1; break;
            case "sredni": mnoznik = 1.5; break;
            case "trudny": mnoznik = 2; break;
            default: mnoznik = 1; break;
        }

        switch (rodzajCwiczenia){
            case "brzuszki":
                powtorzenia = new int[]{(int)Math.round(40*mnoznik), (int)Math.round(30*mnoznik),
                        (int)Math.round(20*mnoznik), (int)Math.round(10*mnoznik)};
                break;
            case "pompki":
                powtorzenia = new int[]{(int)Math.round(30*mnoznik), (int)Math.round(20*mnoznik),
                        (int)Math.round(10*mnoznik), (int)Math.round(6*mnoznik)};
                break;
            case "przysiady":
                powtorzenia = new int[]{(int)Math.round(60*mnoznik), (int)Math.round(40*mnoznik),
                        (int)Math.round(20*mnoznik), (int)Math.round(15*mnoznik)};
                break;
                default:
                    powtorzenia = new int[]{1,1,1,1};
                    break;
        }

        cwiczenieTV.setText(String.valueOf(powtorzenia[0]));
        final int liczbaSerii = powtorzenia.length;
        final int[] obecnaSeria = {0};
        anuluj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wrocDoMenuGlownego = new Intent(getApplicationContext(), StartMenu.class);
                startActivity(wrocDoMenuGlownego);
            }
        });

        zrobione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 {
                     obecnaSeria[0]++;
                     zrobione.setEnabled(false);
                     if(obecnaSeria[0] <liczbaSerii) {
                         new CountDownTimer(11000, 1000) {

                             public void onTick(long millisUntilFinished) {
                                 cwiczenieTV.setText(""+millisUntilFinished / 1000);
                             }

                             public void onFinish() {
                                 zrobione.setEnabled(true);
                                 cwiczenieTV.setText(String.valueOf(powtorzenia[obecnaSeria[0]]));
                             }
                         }.start();
                     }
                     else{
                         cwiczenieTV.setText("KONIEC!");
                         cwiczenieTV.setTextSize(12);
                     }
                }
            }
        });

    }
}
