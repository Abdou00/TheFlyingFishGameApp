package com.example.theflyingfishgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity
{
    /**
     * Variables
     */
    private Button StartGameAgain;
    private TextView DisplayScore;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        /**
         * Récupère le score
         */
        score = getIntent().getExtras().get("Score").toString();

        /**
         * Récupère le bouton et le score via leurs id
         */
        StartGameAgain = (Button) findViewById(R.id.play_again_btn);
        DisplayScore = (TextView) findViewById(R.id.displayScore);

        /**
         * Ajoute un évènement onclick sur le bouton
         */
        StartGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Relance le jeu(restart)
                 */
                Intent mainIntent = new Intent(GameOverActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        /**
         * Affiche le sscore
         */
        DisplayScore.setText("Score: " + score );
    }
}
