package com.example.defaa.desfariaditian_1202150081_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tvRestoran, tvMenu, tvPorsi, tvHarga;
    String restoran, menu;
    int porsi,harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvRestoran =(TextView)findViewById(R.id.textView_restoran);
        tvMenu =(TextView)findViewById(R.id.textView_menu);
        tvPorsi =(TextView)findViewById(R.id.textView_porsi);
        tvHarga =(TextView)findViewById(R.id.textView_harga);

        Intent intent = getIntent();
        restoran = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        porsi = intent.getIntExtra("porsi", 0);
        harga = intent.getIntExtra("harga", 0);

        tvRestoran.setText(restoran); //setText untuk mengisi komponen dengan data
        tvMenu.setText(menu);
        tvPorsi.setText(""+porsi);
        tvHarga.setText("Rp."+harga);

        Toast toast = null;
        if (harga < 65000){
            toast = Toast.makeText(getApplicationContext(), "Murah Enak", Toast.LENGTH_SHORT);
        }else{
            toast = Toast.makeText(getApplicationContext(), "Nanti aja tunggu awal bulan", Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
