package com.example.pmr1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String CAT = "tracesPMR";
    private Button btnOK;
    private EditText inputPseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(CAT,"oncreate");
        btnOK = findViewById(R.id.btnOK);
        inputPseudo = findViewById(R.id.inputPseudo);
        btnOK.setOnClickListener(this);
        inputPseudo.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(CAT,"onstart");
    }

    public void clickBtnOK(View view) {
        Log.i(CAT,"click OK");
        Toast myToast = Toast.makeText(this,"Click OK (Attribut dans le layout)",Toast.LENGTH_LONG);
        myToast.show();

    }

    @Override
    public void onClick(View view) {
        String msg ;
        if (view.getId() == R.id.inputPseudo) {
            msg ="Il faut entrer votre pseudo";
        } else {
            msg = "click sur OK !";
        }
        Toast myToast = Toast.makeText(this,msg,Toast.LENGTH_LONG);
        myToast.show();
    }
}