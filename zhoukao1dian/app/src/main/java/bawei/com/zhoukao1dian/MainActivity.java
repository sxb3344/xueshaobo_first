package bawei.com.zhoukao1dian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import bawei.com.ownview.TitleVIew;

public class MainActivity extends AppCompatActivity {

    private TitleVIew title_VIew_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title_VIew_1 = findViewById(R.id.title_VIew_1);
        title_VIew_1.setNetCallBack(new TitleVIew.NetCallBack() {
            @Override
            public void Sou() {
                Toast.makeText(MainActivity.this,"已搜索",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
