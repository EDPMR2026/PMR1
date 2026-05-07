package com.example.pmr1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String CAT = "tracesPMR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(CAT,"oncreate");
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
}