package latihan.com;
/*
 * NIM       :  10116088
 * Nama      :  Imam Satriyadi
 * KElas     :  IF-2
 *
 * tabu 17 april jam 07:00 \
 * membuat aplikasi
 *
 * kamis 18 april jam 14:00
 * aplikasi telah selesai
 * */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register    = findViewById(R.id.txt_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register_nav();
            }
        });

    }

    public void register_nav(){
        Intent intent  = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
