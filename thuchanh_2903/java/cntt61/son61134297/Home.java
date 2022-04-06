package cntt61.son61134297;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView tvtitle, tvdes, tvmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvtitle = (TextView) findViewById(R.id.tv_title);
        tvdes = (TextView) findViewById(R.id.tv_des);
        tvmail = (TextView) findViewById(R.id.tv_mail);

        setDataByExtras();

    }

    public void setDataByExtras()
    {
        Intent intent = getIntent();
        String title = intent.getStringExtra(Login.TITLE);
        String des = intent.getStringExtra(Login.DES);
        String mail = intent.getStringExtra(Login.MAIL);

        tvtitle.setText(title);
        tvdes.setText(des);
        tvmail.setText(mail);
    }
}