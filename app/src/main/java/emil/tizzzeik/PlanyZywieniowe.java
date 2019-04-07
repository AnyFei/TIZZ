package emil.tizzzeik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlanyZywieniowe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plany_zywieniowe);

        Button plan1Btn = findViewById(R.id.planZwyieniowy1Btn);
        Button plan2Btn = findViewById(R.id.planZwywieniowy2Btn);
        Button plan3Btn = findViewById(R.id.planZywieniowy3Btn);

        final Intent pokazPlan = new Intent(this, SzczegolyPlanu.class);

        plan1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pokazPlan.putExtra("wybranyPlan", "planZywieniowy1");
                startActivity(pokazPlan);
            }
        });
        plan2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pokazPlan.putExtra("wybranyPlan", "planZywieniowy2");
                startActivity(pokazPlan);
            }
        });
        plan3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pokazPlan.putExtra("wybranyPlan", "planZywieniowy3");
                startActivity(pokazPlan);
            }
        });
    }
}
