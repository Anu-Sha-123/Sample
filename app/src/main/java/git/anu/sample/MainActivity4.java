package git.anu.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void getotp(View view) {
    }

    public void resendotp(View view) {
    }

    public void submit(View view) {
        Intent i5=new Intent(MainActivity4.this, MainActivity2.class);
        MainActivity4.this.startActivity(i5);
    }
}