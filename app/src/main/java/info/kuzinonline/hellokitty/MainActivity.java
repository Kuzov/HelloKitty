package info.kuzinonline.hellokitty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloTextView;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView)findViewById(R.id.textView);
    }

    public void onClick(View view) {
        mHelloTextView.setText("Hello Kitty!");
    }
}
