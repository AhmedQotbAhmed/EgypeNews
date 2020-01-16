package com.example.news.UI.main;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.news.R;
import com.example.news.pojo.Article;
import com.squareup.picasso.Picasso;

public class Description extends AppCompatActivity {
    ImageView imageView;
    TextView textTitel;
    TextView textPublishedAt;
    TextView textDesc;
    Intent ob;


    private String image_str ;
    private String textPublishedAt_str;
    private String textTitel_str;
    private String textDescd_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

//    toolbar
        Toolbar mainTbr =  findViewById(R.id.des_toolbar);
        mainTbr.setTitle("Description");
        setSupportActionBar(mainTbr);

        imageView=findViewById(R.id.image_dec);
        textDesc=findViewById(R.id.content_dec);
        textTitel=findViewById(R.id.title_dec);
        textPublishedAt =findViewById(R.id.publishedAt_dec);
        ob=getIntent();



        image_str = ob.getStringExtra("image");
        textTitel_str = ob.getStringExtra("title");
        textDescd_str = ob.getStringExtra("des");
        textPublishedAt_str = ob.getStringExtra("pubAt");

        textPublishedAt.setText(textPublishedAt_str);
        textDesc.setText(textDescd_str);
        textTitel.setText(textTitel_str);
        Picasso.get().load(image_str).into(imageView);



    }
}