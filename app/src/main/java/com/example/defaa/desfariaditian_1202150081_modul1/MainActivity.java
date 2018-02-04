package com.example.defaa.desfariaditian_1202150081_modul1;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etMakanan, etPorsi;
    Intent intent;
    String Restoran, Menu;
    int Porsi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMakanan = (EditText) findViewById(R.id.editText_makanan);
                etPorsi = (EditText) findViewById(R.id.editText_porsi);
        intent = new Intent (this,SecondActivity.class);
            }
            public void onEatBus(View view){
        Menu = etMakanan.getText().toString();
        Restoran = "EatBus";
        Porsi = Integer.parseInt(etPorsi.getText().toString());
        int total = 50000 * Integer.parseInt(etPorsi.getText().toString());
                Log.d("Total Harga", "Rp. " + total);
        intent.putExtra( "Restoran",Restoran);
        intent.putExtra("Menu",Menu);
        intent.putExtra("Porsi",Porsi);
        intent.putExtra("Harga",total);
        startActivity(intent);


            }
            public void onAbnormal(View view){
                Menu = etMakanan.getText().toString();
                Restoran = "Abnormal";
                Porsi = Integer.parseInt(etPorsi.getText().toString());
                int total = 30000 * Integer.parseInt(etPorsi.getText().toString());
                Log.d("Total Harga", "Rp. " + total);
                intent.putExtra( "Restoran",Restoran);
                intent.putExtra("Menu",Menu);
                intent.putExtra("Porsi",Porsi);
                intent.putExtra("Harga",total);
                startActivity(intent);
            }
}
