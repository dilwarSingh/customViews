package com.example.vibrant.custom.groups;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

/**
 * Created by vibrant on 3/10/2018.
 */

public class myConst extends ConstraintLayout {
    public myConst(Context context) {
        this(context, null);
    }

    public myConst(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public myConst(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);

    }

    public void init(AttributeSet attributeSet) {
        setWillNotDraw(false);


    }


    @Override
    protected void onDraw(Canvas canvas) {
        myDrawing(canvas);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        createOutLine();
        super.onSizeChanged(w, h, oldw, oldh);

    }

    private void myDrawing(Canvas canvas) {

        int hlfHeight = getHeight() / 2;
        int hlfWidth = getWidth() / 2;

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setAntiAlias(true);
        paint.setStrokeWidth(8);
        paint.setColor(Color.RED);


        int cr = 100;


        final Path path = new Path();


        int padd = 20;

        path.moveTo(0 + padd, 0 + padd);
        final RectF rectF = new RectF(hlfWidth - cr, cr * -1 + padd, hlfWidth + cr, cr + padd);


        path.arcTo(rectF, 180, -180);
        //  path.addRect(rectF, Path.Direction.CW);
        path.lineTo(hlfWidth - cr + padd, 0 + padd);

        path.lineTo(hlfWidth * 2 - padd, 0 + padd);

        path.lineTo(hlfWidth * 2 - padd, hlfHeight * 2 - padd);
        path.lineTo(0 + padd, hlfHeight * 2 - padd);
        path.lineTo(0 + padd, 0 + padd);

        canvas.drawPath(path, paint);


        createOutLine();

    }

    private void createOutLine() {

        setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {

                int padd = 20;
                outline.setRoundRect(0 + padd, 0 + padd, view.getWidth() - padd, view.getHeight() - padd, 8);
                outline.canClip();

                view.setClipToOutline(true);



            }
        });


    }


    private Path outlinePath() {
        int cr = 100;
        int hlfHeight = getHeight() / 2;
        int hlfWidth = getWidth() / 2;
        Path path = new Path();
        int padd = 0;

        path.moveTo(0 + padd, 0 + padd);
        RectF rectF = new RectF(hlfWidth - cr, cr * -1 + padd, hlfWidth + cr, cr + padd);


        path.arcTo(rectF, 180, -180);
        //  path.addRect(rectF, Path.Direction.CW);
        path.lineTo(hlfWidth - cr + padd, 0 + padd);

        path.lineTo(hlfWidth * 2 - padd, 0 + padd);

        path.lineTo(hlfWidth * 2 - padd, hlfHeight * 2 - padd);
        path.lineTo(0 + padd, hlfHeight * 2 - padd);
        path.lineTo(0 + padd, 0 + padd);

        return path;
    }


}
