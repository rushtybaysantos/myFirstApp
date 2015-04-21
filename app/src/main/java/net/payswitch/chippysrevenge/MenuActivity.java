package net.payswitch.chippysrevenge;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MenuActivity extends ActionBarActivity {

    ImageButton imgBtn1, imgBtn2, imgBtn3, imgBtn6, imgBtn8;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imgBtn1 = (ImageButton) findViewById(R.id.imageButton1);
        imgBtn2 = (ImageButton) findViewById(R.id.imageButton2);
        imgBtn3 = (ImageButton) findViewById(R.id.imageButton3);
        imgBtn6 = (ImageButton) findViewById(R.id.imageButton6);
        imgBtn8 = (ImageButton) findViewById(R.id.imageButton8);



        imgBtn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "CLICKED!", Toast.LENGTH_SHORT).show();
                intent = new Intent(MenuActivity.this, PlayActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imgBtn2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MenuActivity.this, ScoresActivity.class);
                startActivity(intent);
                finish();
            }
        }));

        imgBtn3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MenuActivity.this, HelpActivity.class);
                startActivity(intent);
                finish();
            }
        }));

        imgBtn6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MenuActivity.this, CreditsActivity.class);
                startActivity(intent);
                finish();
            }
        }));

        imgBtn8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MenuActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        }));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
