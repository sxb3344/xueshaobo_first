package bawei.com.ownview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import bawei.com.zhoukao1dian.R;

public class TitleVIew extends LinearLayout {
    public TitleVIew(Context context) {
        this(context,null);
    }

    public TitleVIew(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TitleVIew(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initVIew(context,attrs,defStyleAttr);
    }
    private NetCallBack netCallBack;

    public void setNetCallBack(NetCallBack netCallBack) {
        this.netCallBack = netCallBack;
    }

    public interface NetCallBack{
        void Sou();
    }
    private void initVIew(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Tille_text);
        int color = typedArray.getColor(R.styleable.Tille_text_text_color, Color.GREEN);
        View.inflate(context, R.layout.titleview, this);
        final EditText edit_ext = findViewById(R.id.edit_ext);
        TextView sou = findViewById(R.id.sou);
        sou.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                netCallBack.Sou();
                edit_ext.setText("");
            }
        });
        edit_ext.setBackgroundColor(color);
        typedArray.recycle();


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, 50);
    }
}
