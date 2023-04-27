package com.example.drawround;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected void onDraw(Canvas canvas){
        Path path = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);

        path.moveTo(20, 400);
        path.lineTo(300, 800);
        path.cubicTo(450, 120, 600, 1200, 900, 800);

        paint.setColor(Color.BLUE);
        canvas.drawPath(path, paint);
        paint.setStyle(Paint.Style.FILL);

        paint.setTextSize(200);
        canvas.drawTextOnPath("THIS IS A TEST!!", path, 0, 0, paint);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


}