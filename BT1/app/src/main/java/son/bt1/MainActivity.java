package son.bt1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText chieudai, chieurong;
    Button tinhChuvi, tinhDientich;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        chieudai = (EditText)findViewById(R.id.chieudai);
        chieurong = (EditText)findViewById(R.id.chieurong);
        tinhChuvi = (Button)findViewById(R.id.tinhChuVi);
        tinhDientich = (Button)findViewById(R.id.tinhDienTich);
        ketqua = (TextView)findViewById(R.id.ketqua);

        tinhChuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cdai = Integer.parseInt(chieudai.getText().toString());
                int crong = Integer.parseInt(chieurong.getText().toString());
                int kqua = (cdai + crong) * 2;
                ketqua.setText("Chu vi hinh chu nhat la: " + kqua);
            }
        });


        tinhDientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cdai = Integer.parseInt(chieudai.getText().toString());
                int crong = Integer.parseInt(chieurong.getText().toString());
                int kqua = cdai * crong;
                ketqua.setText("Dien tich hinh chu nhat la: " + kqua);

            }
        });



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}