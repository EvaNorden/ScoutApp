package eva.scoutapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class LeaderMenuAct extends ActionBarActivity implements View.OnClickListener {
    private Button newGameB,seeGamesB,startGameB,endGameB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leader_menu_act);

        newGameB = (Button)findViewById(R.id.newGame);
        seeGamesB = (Button)findViewById(R.id.seeGames);
        startGameB = (Button)findViewById(R.id.startGame);
        endGameB = (Button)findViewById(R.id.endGame);

        newGameB.setOnClickListener(this);
        seeGamesB.setOnClickListener(this);
        startGameB.setOnClickListener(this);
        endGameB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==newGameB){
            Intent i = new Intent(this,CreateGameAct.class);
            startActivity(i);
        } else if (v==seeGamesB){
            // show list of all games
        } else if (v==startGameB){
            // make game accessible
        } else if (v==endGameB){
            // make game inaccessible
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.leader_menu_act, menu);
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
