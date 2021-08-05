package com.pd.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bhumi) { // bundle is a class to get a state of an activity

        super.onCreate( bhumi );//  oncreate has a login to maintain activity life cycle

        setContentView( R.layout.activity_main ); // link to XML n JAVA file


    }

    public void zoom(View view) {
        ImageView imageView = (ImageView)findViewById( R.id.imgv );
        Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.zoom );
        imageView.startAnimation( animation );
    }

    public void blink(View view) {
        ImageView imageView = (ImageView)findViewById( R.id.imgv );
        Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.blink );
        imageView.startAnimation( animation );
    }

    public void fade(View view) {
        ImageView imageView = (ImageView)findViewById( R.id.imgv );
        Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.fade );
        imageView.startAnimation( animation );
    }

    public void move(View view) {
        ImageView imageView = (ImageView)findViewById( R.id.imgv );
        Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.move );
        imageView.startAnimation( animation );
    }

    public void clockwise(View view) {
        ImageView imageView = (ImageView)findViewById( R.id.imgv );
        Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.cloclwise );
        imageView.startAnimation( animation );
    }

    public void slide(View view) {
        ImageView imageView = (ImageView)findViewById( R.id.imgv );
        Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.slide );
        imageView.startAnimation( animation );
    }
}