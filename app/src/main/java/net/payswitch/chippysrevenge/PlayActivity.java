package net.payswitch.chippysrevenge;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class PlayActivity extends ActionBarActivity {

    ImageButton imgBtn9, imgBtn4, imgBtn5;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);


        imgBtn9 = (ImageButton) findViewById(R.id.imageButton9);
        imgBtn4 = (ImageButton) findViewById(R.id.imageButton4);
        imgBtn5 = (ImageButton) findViewById(R.id.imageButton5);

        imgBtn9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(PlayActivity.this, MenuActivity.class);
                finish();
            }
        }));

        imgBtn4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ahhhhh!", Toast.LENGTH_SHORT).show();
                finish();

            }
        }));

        imgBtn5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ouch! I'm hit.", Toast.LENGTH_SHORT).show();
                finish();
            }
        }));

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
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
