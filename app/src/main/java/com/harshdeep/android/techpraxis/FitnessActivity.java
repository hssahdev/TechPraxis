package com.harshdeep.android.techpraxis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.google.android.gms.auth.api.signin.GoogleSignIn;

public class FitnessActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_fitness,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        EditText text = (EditText)findViewById(R.id.dateOB);
        String Name = GoogleSignIn.getLastSignedInAccount(this).getDisplayName();
        String DateOfBirth = text.getText().toString().trim();
        text = (EditText)findViewById(R.id.height);
        int Height = Integer.parseInt(text.getText().toString().trim());
        text = (EditText)findViewById(R.id.weight);
        int Weight = Integer.parseInt(text.getText().toString().trim());

        Log.v("yo",Name+" "+DateOfBirth+" "+Height);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
    }
}
