package com.example.atifasec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppointmentScheduling1Activity extends AppCompatActivity {
    private Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_scheduling1);

        btn=findViewById(R.id.button);
        btn1=findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AppointmentScheduling1Activity.this,AppointmentScheduling2.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AppointmentScheduling1Activity.this,CancelAppointmentActivity.class);
                startActivity(intent);
            }
        });
    }
}