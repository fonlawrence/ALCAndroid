package android.com.afadesigns.alcandroid;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void myProfile(View view){
        Intent i=new Intent(MainActivity.this, MyProfile.class);
        startActivity(i);
    }

    public void aboutALC(View view){

        Intent i=new Intent(MainActivity.this, AboutALC.class);
        startActivity(i);
    }
}
