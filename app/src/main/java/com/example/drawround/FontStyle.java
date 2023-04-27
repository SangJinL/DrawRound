package com.example.drawround;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class FontStyle {

    protected void onDraw(Canvas canvas){
        Path path = new Path();
        Paint paint = new Paint();

        paint.setStyle(Paint.Style.STROKE);

        path.moveTo(20, 400);
        path.lineTo(300, 800);
        path.cubicTo(50, 120, 600, 1200, 900, 800);

        paint.setColor(Color.BLUE);
        canvas.drawPath(path, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(200);
        canvas.drawTextOnPath("This is a test", path, 0, 0 , paint);
    }
}
