package com.londonappbrewery.destini;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mTopBotton;
    Button mBottomButton;
    int mPath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mTopBotton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        mStoryText.setText(R.string.T1_Story);
        mTopBotton.setText(R.string.T1_Ans1);
        mBottomButton.setText(R.string.T1_Ans2);
        mPath = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        //Top Button Choice
        mTopBotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPath==1){
                    storyPath3();
                } else if(mPath==2){
                    storyPath3();
                } else if(mPath==3){
                    storyPath6();
                }
            }
        });

        // Bottom Button Choice
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mPath==1){
                    storyPath2();
                } else if(mPath==2){
                    storyPath4();
                } else if(mPath==3){
                    storyPath5();
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

    void storyPath2(){
        mStoryText.setText(R.string.T2_Story);
        mTopBotton.setText(R.string.T2_Ans1);
        mBottomButton.setText(R.string.T2_Ans2);
        mPath=2;
    }

    void storyPath3(){
        mStoryText.setText(R.string.T3_Story);
        mTopBotton.setText(R.string.T3_Ans1);
        mBottomButton.setText(R.string.T3_Ans2);
        mPath=3;
    }

    void storyPath4(){
        mStoryText.setText(R.string.T4_End);
        mTopBotton.setText(" ");
        mBottomButton.setText(" ");
        mPath=4;
    }

    void storyPath5() {
        mStoryText.setText(R.string.T5_End);
        mTopBotton.setText("");
        mBottomButton.setText("");
        mPath=5;
    }

    void storyPath6(){
        mStoryText.setText(R.string.T6_End);
        mTopBotton.setText("");
        mBottomButton.setText("");
        mPath=6;
    }
}
