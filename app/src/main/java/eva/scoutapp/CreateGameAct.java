package eva.scoutapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CreateGameAct extends ActionBarActivity implements View.OnClickListener{
    Button addPostB,editPostB,difficultyLevelB,saveGameB;
    EditText gameNameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_game_act);

        addPostB = (Button)findViewById(R.id.addPost);
        editPostB = (Button)findViewById(R.id.editPost);
        difficultyLevelB = (Button)findViewById(R.id.difficultyLevel);
        saveGameB = (Button)findViewById(R.id.saveGame);
        gameNameET = (EditText)findViewById(R.id.gameName);

        addPostB.setOnClickListener(this);
        editPostB.setOnClickListener(this);
        difficultyLevelB.setOnClickListener(this);
        saveGameB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==addPostB){
            Intent i = new Intent(this,PostAct.class);
            startActivity(i);
        } else if (v==editPostB){
            // show list of posts and open PostAct on the selected one
        } else if (v==difficultyLevelB){
            // show list of difficulties
        } else if (v==saveGameB){
            // save game to a GameLog object and show toast
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_game_act, menu);
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
