package latihan.com;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {


    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_register    =  findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almost_there_nav();
            }
        });
    }

    public void almost_there_nav(){
        Intent intent   = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
