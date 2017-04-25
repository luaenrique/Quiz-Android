package www.projetotaurus.com.br.quiztrab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        tv=(TextView)findViewById(R.id.tvResult);
        if(getIntent().getExtras().getString("pont").trim()!=null){
            tv.setText("Sua pontuação: "+getIntent().getExtras().getString("pont")+"/5");
        }
    }
}
