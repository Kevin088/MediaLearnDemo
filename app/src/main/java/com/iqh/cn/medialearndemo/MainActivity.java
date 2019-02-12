package com.iqh.cn.medialearndemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.iv_image);
        //绘制一张图片的三种方式
        //1.
        Bitmap image= BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
        imageView.setImageBitmap(image);
        //2. surfaceview  中拿到cavas对象进行绘制
        //3. 继承view 重写onDraw()  拿到cavas对象 进行绘制


    }
}
