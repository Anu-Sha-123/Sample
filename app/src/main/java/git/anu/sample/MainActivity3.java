package git.anu.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void submit(View view) {
        Intent i6=new Intent(MainActivity3.this, MainActivity5.class);
        MainActivity3.this.startActivity(i6);
    }
}