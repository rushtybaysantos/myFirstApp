package net.payswitch.chippysrevenge;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MenuActivity extends Activity implements View.OnClickListener {

    Button btnPlay, btnScores, btnHelp;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnPlay = (Button) this.findViewById(R.id.btn_play);

        btnPlay.setOnClickListener(this);

        btnScores = (Button) this.findViewById(R.id.btn_scores);

        btnScores.setOnClickListener(this);

        btnHelp = (Button) this.findViewById(R.id.btn_help);

        btnHelp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == this.btnPlay) {
            intent = new Intent(MenuActivity.this, PlayActivity.class);
        }
        else if(v == this.btnScores) {
            intent = new Intent(MenuActivity.this, ScoresActivity.class);
        }
        else if (v == this.btnHelp){
            intent = new Intent(MenuActivity.this, HelpActivity.class);
        }

        startActivity(intent);

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
