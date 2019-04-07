package emil.tizzzeik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlanyTreningowe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plany_treningowe);

        Button plan1Btn = findViewById(R.id.planTreningowy1Btn);
        Button plan2Btn = findViewById(R.id.planTreningowy2Btn);
        Button plan3Btn = findViewById(R.id.planTreningowy3Btn);

        final Intent pokazPlan = new Intent(this, SzczegolyPlanu.class);

        plan1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pokazPlan.putExtra("wybranyPlan", "planTreningowy1");
                startActivity(pokazPlan);
            }
        });
        plan2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pokazPlan.putExtra("wybranyPlan", "planTreningowy2");
                startActivity(pokazPlan);
            }
        });
        plan3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pokazPlan.putExtra("wybranyPlan", "planTreningowy3");
                startActivity(pokazPlan);
            }
        });
    }
}
