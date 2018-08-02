package com.example.akerke.technodomsurvey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Language extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        Button russian = (Button)findViewById(R.id.russian);
        russian.setOnClickListener(this);
        Button kazakh = (Button)findViewById(R.id.kazakh);
        kazakh.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case  R.id.russian: {
                startActivity(new Intent(this, RegistrRus.class));
                break;
            }

            case R.id.kazakh: {
                startActivity(new Intent(this, RegistrKaz.class));
                break;
            }
        }
    }
}
