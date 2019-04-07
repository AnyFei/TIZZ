package emil.tizzzeik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cwicz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cwicz);


        Button brzuszkiBtn = findViewById(R.id.brzuszkiBtn);
        Button pompkiBtn = findViewById(R.id.pompkiBtn);
        Button przysiadyBtn = findViewById(R.id.przysiadyBtn);

        final Intent zacznijCwiczenie = new Intent(this, Cwiczenie.class);

        brzuszkiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zacznijCwiczenie.putExtra("rodzajCwiczenia", "brzuszki");
                startActivity(zacznijCwiczenie);
            }
        });
        pompkiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zacznijCwiczenie.putExtra("rodzajCwiczenia", "pompki");
                startActivity(zacznijCwiczenie);
            }
        });
        przysiadyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zacznijCwiczenie.putExtra("rodzajCwiczenia", "przysiady");
                startActivity(zacznijCwiczenie);
            }
        });
    }



}
