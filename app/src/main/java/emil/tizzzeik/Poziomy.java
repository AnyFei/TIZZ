package emil.tizzzeik;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Poziomy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poziomy);
        Button nowicjuszBtn = findViewById(R.id.nowicjuszBtn);
        Button sredniBtn = findViewById(R.id.sredniBtn);
        Button trudnyBtn = findViewById(R.id.trudnyBtn);

        Context context = getApplicationContext();
        SharedPreferences sharedPref = context.getSharedPreferences(
                "poziom", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor= sharedPref.edit();

        final Intent rozpocznijCwiczenie = new Intent(this, Cwicz.class);

        nowicjuszBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("poziomUzytkownika", "nowicjusz");
                editor.apply();
                startActivity(rozpocznijCwiczenie);
            }
        });
        sredniBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("poziomUzytkownika", "sredni");
                editor.apply();
                startActivity(rozpocznijCwiczenie);
            }
        });
        trudnyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("poziomUzytkownika", "trudny");
                editor.apply();
                startActivity(rozpocznijCwiczenie);
            }
        });
    }
}
