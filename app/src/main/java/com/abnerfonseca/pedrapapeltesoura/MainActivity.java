package com.abnerfonseca.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void selectStone(View view){
        checkWinner("stone");
    }

    public void selectScissors(View view){
        checkWinner("scissors");
    }

    public void selectPaper(View view){
        checkWinner("paper");
    }
    private String generateRandomChoice() {
        String[] options = {"stone", "paper", "scissors"};
        int numberRandom = new Random().nextInt(3);
        ImageView image = findViewById(R.id.image_app);
        String appChoice = options[numberRandom];
        switch (appChoice){
            case "stone":
                image.setImageResource(R.drawable.hand);
                break;
            case "paper":
                image.setImageResource(R.drawable.openhand);
                break;
            case "scissors":
                image.setImageResource(R.drawable.letterv);
                break;
        }
        return appChoice;
    }

    private void  checkWinner(String playerChoice){
        String  randomSelection = generateRandomChoice();
        TextView textResult = findViewById(R.id.text_result);

        if (
                (randomSelection == "stone" && playerChoice == "scissors") ||
                (randomSelection == "scissors" && playerChoice == "paper") ||
                (randomSelection == "paper" && playerChoice == "stone")
        ) {
            textResult.setText("Você perdeu :(");
        } else if (
                (playerChoice == "stone" && randomSelection == "scissors") ||
                (playerChoice == "scissors" && randomSelection == "paper") ||
                (playerChoice == "paper" && randomSelection == "stone")
        ) {
            textResult.setText("Você ganhou :)");
        } else {
            textResult.setText("Empatamos :|");
        }
    }
}