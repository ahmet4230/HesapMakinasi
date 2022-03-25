package com.example.hesapmakinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText BirinciSayiTxt , ikinciSayiTxt;
    private TextView TextSonuc;
    private String ilkSayi,İkinciSayi;
    private int s1, s2,sonuc;
    private Hesapla hesapla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BirinciSayiTxt = (EditText) findViewById(R.id.BirinciSayiTxt);
        ikinciSayiTxt = (EditText) findViewById(R.id.ikinciSayiTxt);
        TextSonuc = (TextView) findViewById(R.id.TextSonuc);
    }
    public void btnHesapla(View v){
        ilkSayi = BirinciSayiTxt.getText().toString();
        İkinciSayi = ikinciSayiTxt.getText().toString();

        if(!TextUtils.isEmpty(ilkSayi)&& !TextUtils.isEmpty(İkinciSayi)){
            s1 = Integer.valueOf(ilkSayi);
            s2 = Integer.valueOf(İkinciSayi);
            hesapla = new Hesapla(s1,s2);

            switch (v.getId()){
                case R.id.BtnTopla:
                    sonuc = hesapla.toplam();
                    break;
                case R.id.BtnBol:
                    sonuc = hesapla.bol();
                    break;
                case R.id.BtnCarp:
                    sonuc = hesapla.carp();
                    break;
                case R.id.BtnCıkar:
                    sonuc = hesapla.cıkar();
                    break;
            }
            TextSonuc.setText("SONUÇ:" + sonuc);
        }else
            TextSonuc.setText("Girilen Değer boş olamaz");

    }

}