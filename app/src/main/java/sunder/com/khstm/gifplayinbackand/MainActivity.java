package sunder.com.khstm.gifplayinbackand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.builder.AnimateGifMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imgView = (ImageView) findViewById(R.id.imageView);
        Ion.with(imgView)
                .error(R.drawable.roatating)
                .animateGif(AnimateGifMode.ANIMATE)
                .load("android.resource://" + getPackageName() + "/" + R.drawable.roatating)
                .withBitmapInfo();
    }
}
