package com.vector.circleimageview;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2015/12/25
 * Description:<p>{TODO: 用一句话描述}
 */
public class CircleImageView extends ImageView {
    public CircleImageView(Context context) {
        super(context);
    }

    public CircleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(new CircleBitmapDrawable(getResources(),((BitmapDrawable)drawable).getBitmap()));
    }
}
