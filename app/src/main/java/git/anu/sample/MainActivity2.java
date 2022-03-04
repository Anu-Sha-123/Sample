package git.anu.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void forgetpassword(View view) {
        Intent i2=new Intent(MainActivity2.this, MainActivity4.class);
        MainActivity2.this.startActivity(i2);
    }
    public void login(View view) {
        Intent i3=new Intent(MainActivity2.this, MainActivity5.class);
        MainActivity2.this.startActivity(i3);
    }

    public void signup(View view) {
        Intent i4=new Intent(MainActivity2.this, MainActivity3.class);
        MainActivity2.this.startActivity(i4);

    }
}