package com.jonmid.segundoparcial.Views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.segundoparcial.Array.Images;
import com.jonmid.segundoparcial.R;
import com.jonmid.segundoparcial.TeamActivity;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tv1 = (TextView)findViewById(R.id.id_tv_namedetail);
        TextView tv2 = (TextView)findViewById(R.id.id_tv_codedetail);
        ImageView img=(ImageView)findViewById(R.id.id_img_team) ;
        tv1.setText(getIntent().getExtras().getString("name"));
        tv2.setText(getIntent().getExtras().getString("code"));

       Picasso.with(this).load(Images.imageRandom()).into(img);



    }


    public void onClick(View view) {
        Context contextitem1 = view.getContext();

        Intent inten1= new Intent(contextitem1,TeamActivity.class);

        contextitem1.startActivity(inten1);

        //Toast.makeText(context,"click en el item",Toast.LENGTH_SHORT).show();
    }
}
