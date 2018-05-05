package com.example.lockydy.test3;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        //内部类的处理方式
        button1.setOnClickListener(new BttonClick());

        //外部类的处理方式
        button2.setOnClickListener(new MyClick());


        //匿名内部类的处理方式
        button3.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "匿名内部类被激活", Toast.LENGTH_LONG).show();
            }
        });

        button4.setOnClickListener(this);

    }
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "点击了Activity自身监听按钮", Toast.LENGTH_SHORT).show();
        }

    public class MyClick implements OnClickListener {
            @Override
            public void onClick(View v) {
                //点击后设置文本框显示的文字
                Toast.makeText(getApplicationContext(), "这个按钮使用外部类实现的哦", Toast.LENGTH_SHORT).show();
            }
        }


        class BttonClick implements View.OnClickListener
        {
            @Override
            public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "这个按钮使用内部类实现的哦", Toast.LENGTH_SHORT).show();
            }
        }
    public void clickHandler(View source)
        {
             TextView textView=(TextView)findViewById(R.id.wenben);
             textView.setText("已经成功绑定到标签啦");
        }
}
