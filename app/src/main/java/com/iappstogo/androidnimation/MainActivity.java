package com.iappstogo.androidnimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void onClickImage(View imgView) {
        Log.i("Info","Image View has been tapped");
        ImageView bartImageView = (ImageView) findViewById(R.id.imageBartView);
        ImageView homerImageView = (ImageView) findViewById(R.id.imageHomerView);

        if (bartImageView.getAlpha() == 0 ) {
            homerImageView.animate().alpha(0).setDuration(2000);
            bartImageView.animate().alpha(1).setDuration(2000);

        }
        else {
            bartImageView.animate().alpha(0).setDuration(2000);

            homerImageView.animate().alpha(1).setDuration(2000);
        }
     }

     public void doTranslation(View imgView) {

         ImageView homerImageView = (ImageView) findViewById(R.id.imageHomerView);
         ImageView bartImageView = (ImageView) findViewById(R.id.imageBartView);

         //bartImageView.animate().translationXBy(-1000).setDuration(2000);

         //bartImageView.animate().rotation(100).alpha(0).setDuration(2000);

         //bartImageView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0).setDuration(2000);
         bartImageView.animate().translationXBy(1000).rotation(3600).alpha(1).setDuration(2000);
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //ImageView bartImageView = (ImageView) findViewById(R.id.imageBartView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bartImageView.setX(-1000);
    }
}
