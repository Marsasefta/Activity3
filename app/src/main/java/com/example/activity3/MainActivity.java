package com.example.activity3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.optionmenu.R;

public class MainActivity extends AppCompatActivity {

    Button daftar;
    EditText User;
    EditText Pass;
     @Override
     protected void onCreate(Bundle savedInsstanceState) {
         super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);

         User = findViewById(R.id.user);
         Pass = findViewById(R.id.Pass);
         daftar = findViewById(R.id.btnok);
     }
         public boolean onCreateOptionsMenu(Menu menu) {

         // Inflate the menu; this adds items to the action bar if it is present.
             MenuInflater inflater = getMenuInflater();
             inflater.inflate(R.menu.optionmenu, menu);
             return true;
     } public boolean onOptionsItemSelected(MenuItem item)
     { if (item.getItemId()==R.id.about) { startActivity(new Intent(this, InsertActivity.class));
     } else if (item.getItemId() == R.id.setting) { startActivity(new Intent(this, EditActivity.class)); }
     return true;
     }
 }
