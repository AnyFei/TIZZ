package emil.tizzzeik;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.HashSet;

public class StartMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
        Context context = getApplicationContext();
        SharedPreferences sharedPref = context.getSharedPreferences(
                "poziom", Context.MODE_PRIVATE);
        final String poziomUzytkownika = sharedPref.getString("poziomUzytkownika", "brak");
        final Button planyTreningoweBtn = findViewById(R.id.planyTreningoweBtn);
        Button planyZywienioweBtn = findViewById(R.id.planyZywienioweBtn);
        Button cwiczBtn = findViewById(R.id.cwiczBtn);

        planyTreningoweBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pokazPlanyTreningowe = new Intent(getApplicationContext(), PlanyTreningowe.class);
                startActivity(pokazPlanyTreningowe);

            }
        });
        planyZywienioweBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pokazPlanyZywieniowe = new Intent(getApplicationContext(), PlanyZywieniowe.class);
                startActivity(pokazPlanyZywieniowe);
            }
        });
        cwiczBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pokazCwiczenia;
                if(poziomUzytkownika.equals("brak"))
                    pokazCwiczenia = new Intent(getApplicationContext(), Poziomy.class);
                else
                    pokazCwiczenia = new Intent(getApplicationContext(), Cwicz.class);

                startActivity(pokazCwiczenia);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.bmi:
                Intent obliczanieBMI = new Intent(getApplicationContext(), ObliczBMI.class);
                startActivity(obliczanieBMI);
                return true;
            case R.id.faq:
                Intent pokazFAQ = new Intent(getApplicationContext(), PokazFAQ.class);
                startActivity(pokazFAQ);
                return true;
            case R.id.poziom:
                Intent zmienPoziom = new Intent(getApplicationContext(), Poziomy.class);
                startActivity(zmienPoziom);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
