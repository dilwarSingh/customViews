package com.example.vibrant.custom.shaper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by vibrant on 2/17/2018.
 */

public class Myrectangle extends View {
    public Myrectangle(Context context) {
        super(context);
        init(null);
    }

    public Myrectangle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }


    public Myrectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public Myrectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs) {

    }

    @Override
    protected void onDraw(Canvas canvas) {

        int hlfHeight = getHeight() / 2;
        int hlfWidth = getWidth() / 2;


        Paint paint
                = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setAntiAlias(true);
        paint.setStrokeWidth(8);
        paint.setColor(Color.RED);

      /*  Paint paint1 = new Paint();
        paint1.setColor(Color.BLUE);*/

        int cr = 100;


        Path path = new Path();


        path.moveTo(0, cr);
        RectF rectF = new RectF(hlfWidth - cr, 0, hlfWidth + cr, cr * 2);


        path.arcTo(rectF, 180, -180);
//        canvas.drawRect(rectF, paint1);
        canvas.drawText(hlfWidth + "", 200, 400, paint);

        path.lineTo(hlfWidth - cr, cr);

        path.lineTo(hlfWidth * 2, cr);

        path.lineTo(hlfWidth * 2, hlfHeight * 2);
        path.lineTo(0, hlfHeight * 2);
        path.lineTo(0, cr);

        canvas.drawPath(path, paint);


    /*    PointF pi = new PointF();
        Path path = new Path();
        int k = w / 360;
        for (int i = 0; i <= 360; i++) {

            double a = Math.asin(i);
            double s = Math.sin(i);
            double hs = Math.sinh(i);


            pi.x = k * i;
            pi.y = (int) (hlfHeight * a);

            path.addPath(new Path().op());
    }


    int half = w / 2;
*/
/*

        RectF rectF = new RectF(0, 0, half, half / 2);
        RectF rectF2 = new RectF(half, 0, w, half / 2);

        path.arcTo(rectF, 180, 180);
        path.arcTo(rectF2, 0, 180);
*/

        //     path.addRect(rectF, Path.Direction.CW);
        //    canvas.drawPath(path,paint);


    }


    private Path drawCurve(Canvas canvas, Paint paint, PointF mPointa, PointF mPointb) {

        Path myPath = new Path();
        myPath.moveTo(63 * canvas.getWidth() / 64, canvas.getHeight() / 10);
        myPath.quadTo(mPointa.x, mPointa.y, mPointb.x, mPointb.y);
        return myPath;
    }
        /*

        Paint paint
                = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.BLUE);


        Path path = new Path();

        path.moveTo(30, 30);


        path.lineTo(50, 100);
        //     path.moveTo( 50, 100);
        path.lineTo(100, 150);
        //    path.moveTo(100, 150);
        path.lineTo(100, 50);

        canvas.drawPath(path, paint);
*/


}
