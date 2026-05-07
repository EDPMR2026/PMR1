package com.example.pmr1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = this.getIntent().getExtras();
        String pseudo = b.getString("pseudo");

        Toast myToast = Toast.makeText(this,"Bonjour " + pseudo,Toast.LENGTH_LONG);
        myToast.show();
    }
}