package bawei.com.ownview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class Liu extends ViewGroup {
    public Liu(Context context) {
        this(context,null);
    }

    public Liu(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Liu(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override

    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
