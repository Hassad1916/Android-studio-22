package com.example.networksourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void a(View v){
        ConnectivityManager connectivityManager =
                (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null){

            if (networkInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                Toast.makeText(this, "WIFI", Toast.LENGTH_SHORT).show();
            }

            else if (networkInfo.getType() == ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(this, "基地台", Toast.LENGTH_SHORT).show();
            }
        }
        else
            Toast.makeText(this, "未連接到WIFI  或 行動數據", Toast.LENGTH_SHORT).show();
    }
}