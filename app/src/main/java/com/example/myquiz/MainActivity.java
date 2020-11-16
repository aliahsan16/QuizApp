package com.example.myquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btn1,btn2,btn3,btn4;
private Question question=new Question();
TextView question_text;
private String answer;
private int questionlength=question.questions.length;
Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
random=new Random();
btn1=(Button)findViewById(R.id.btn1);
btn1.setOnClickListener(this);

        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3=(Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4=(Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        question_text=(TextView)findViewById(R.id.question);
        NextQuestion(random.nextInt(questionlength));





    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                if(btn1.getText()==answer){
                    Toast.makeText(this,"Correct Answers", Toast.LENGTH_SHORT).show();
                NextQuestion(random.nextInt(questionlength));
                } else{
                    Finish();
                }
                break;
            case R.id.btn2:
                if(btn2.getText()==answer){
                    Toast.makeText(this,"Correct Answers", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                } else{
                    Finish();
                }
                break;
            case R.id.btn3:
                if(btn3.getText()==answer){
                    Toast.makeText(this,"Correct Answers", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                } else{
                    Finish();
                }
                break;
            case R.id.btn4:
                if(btn4.getText()==answer){
                    Toast.makeText(this,"Correct Answers", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                } else{
                    Finish();
                }
                break;

        }

    }

    private void Finish() {
        AlertDialog.Builder alertdialog=new AlertDialog.Builder(MainActivity.this);
        alertdialog.setMessage("Finish")
                .setCancelable(false)
                .setPositiveButton("New Quiz", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                }).setNegativeButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        alertdialog.show();
    }

    private void NextQuestion(int nextInt) {
        question_text.setText(question.getQuestion(nextInt));
        btn1.setText(question.getoption1(nextInt));
        btn2.setText(question.getoption2(nextInt));
        btn3.setText(question.getoption3(nextInt));
        btn4.setText(question.getoption4(nextInt));
        answer=question.getCorrectAnswer(nextInt);
    }
}