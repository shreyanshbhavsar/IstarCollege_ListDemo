package shreyansh.bhavsar.istarlistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView nameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        imageView = (ImageView) findViewById(R.id.imageview);
        nameTv = (TextView) findViewById(R.id.nametv);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("namekey");

        Picasso.with(getApplicationContext())
                .load(R.drawable.mcg).into(imageView);

        nameTv.setText(name);

    }
}
