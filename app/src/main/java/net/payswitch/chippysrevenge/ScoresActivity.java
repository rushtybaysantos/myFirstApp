package net.payswitch.chippysrevenge;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;


public class ScoresActivity extends Activity {

    ImageButton btn_mainmenu;
    ListView list;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        btn_mainmenu = (ImageButton) findViewById(R.id.btn_mainmenu);
        lv = (ListView) findViewById(R.id.list);


        btn_mainmenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(ScoresActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });

        String[] scores = new String[] {"Rushty  123555 nuts", "Meynard  122555 nuts", "Ian  121555 nuts", "Glaze 120555 nuts", "Ayiesha  5 nuts"};

        ArrayList<String> list = new ArrayList<String>();
        for (int n =0; n < scores.length; n++) {
            list.add(scores[n]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scores, menu);
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
