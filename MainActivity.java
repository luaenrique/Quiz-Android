package www.projetotaurus.com.br.quiztrab;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    RadioButton resp1;
    RadioButton resp2;
    RadioButton resp3;
    RadioButton resp4;
    RadioButton resp5;

    RadioButton c1resp1;
    RadioButton c1resp2;
    RadioButton c1resp3;
    RadioButton c1resp4;

    RadioButton c2resp1;
    RadioButton c2resp2;
    RadioButton c2resp3;
    RadioButton c2resp4;

    RadioButton c3resp1;
    RadioButton c3resp2;
    RadioButton c3resp3;
    RadioButton c3resp4;

    RadioButton c4resp1;
    RadioButton c4resp2;
    RadioButton c4resp3;
    RadioButton c4resp4;

    RadioButton c5resp1;
    RadioButton c5resp2;
    RadioButton c5resp3;
    RadioButton c5resp4;

    Integer     pont;

    Integer verifica1;
    Integer verifica2;
    Integer verifica3;
    Integer verifica4;
    Integer verifica5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pont = 0;

        verifica1 = 0;
        verifica2 = 0;
        verifica3 = 0;
        verifica4 = 0;
        verifica5 = 0;

        btn = (Button)findViewById(R.id.enviar);

        resp1 = (RadioButton)findViewById(R.id.resp1cor);
        resp2 = (RadioButton)findViewById(R.id.resp2cor);
        resp3 = (RadioButton)findViewById(R.id.resp3cor);
        resp4 = (RadioButton)findViewById(R.id.resp4cor);
        resp5 = (RadioButton)findViewById(R.id.resp5cor);

        c1resp1 = (RadioButton)findViewById(R.id.resper1);
        c1resp2 = (RadioButton)findViewById(R.id.resper2);
        c1resp3 = (RadioButton)findViewById(R.id.resper3);
        c1resp4 = (RadioButton)findViewById(R.id.resper4);

        c2resp1 = (RadioButton)findViewById(R.id.resper5);
        c2resp2 = (RadioButton)findViewById(R.id.resper6);
        c2resp3 = (RadioButton)findViewById(R.id.resper7);
        c2resp4 = (RadioButton)findViewById(R.id.resper8);

        c3resp1 = (RadioButton)findViewById(R.id.resper9);
        c3resp2 = (RadioButton)findViewById(R.id.resper10);
        c3resp3 = (RadioButton)findViewById(R.id.resper11);
        c3resp4 = (RadioButton)findViewById(R.id.resper12);

        c4resp1 = (RadioButton)findViewById(R.id.resper13);
        c4resp2 = (RadioButton)findViewById(R.id.resper14);
        c4resp3 = (RadioButton)findViewById(R.id.resper15);
        c4resp4 = (RadioButton)findViewById(R.id.resper16);

        c5resp1 = (RadioButton)findViewById(R.id.resper17);
        c5resp2 = (RadioButton)findViewById(R.id.resper18);
        c5resp3 = (RadioButton)findViewById(R.id.resper19);
        c5resp4 = (RadioButton)findViewById(R.id.resper20);


        btn.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.enviar:
                if (!c1resp1.isChecked() && !c1resp2.isChecked() && !c1resp3.isChecked() && !c1resp4.isChecked() && !resp1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Responda todas as questões", Toast.LENGTH_SHORT);

                } else {
                    verifica1 = 1;
                }
                if (!c2resp1.isChecked() && !c2resp2.isChecked() && !c2resp3.isChecked() && !c2resp4.isChecked() && !resp2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Responda todas as questões", Toast.LENGTH_SHORT);

                } else {
                    verifica2 = 1;
                }
                if (!c3resp1.isChecked() && !c3resp2.isChecked() && !c3resp3.isChecked() && !c3resp4.isChecked() && !resp3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Responda todas as questões", Toast.LENGTH_SHORT);

                } else {
                    verifica3 = 1;
                }
                if (!c4resp1.isChecked() && !c4resp2.isChecked() && !c4resp3.isChecked() && !c4resp4.isChecked() && !resp4.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Responda todas as questões", Toast.LENGTH_SHORT);

                } else {
                    verifica4 = 1;
                }
                if (!c5resp1.isChecked() && !c5resp2.isChecked() && !c5resp3.isChecked() && !c5resp4.isChecked() && !resp5.isChecked()){
                    Toast.makeText(getApplicationContext(), "Responda todas as questões", Toast.LENGTH_SHORT);
                }else{
                    verifica5 = 1;
                }


                if(verifica1 == 1 && verifica2 == 1 && verifica3 == 1 && verifica4 == 1 && verifica5 == 1) {

                    if (resp1.isChecked()) {
                        pont++;
                    }
                    if (resp2.isChecked()) {
                        pont++;
                    }
                    if (resp3.isChecked()) {
                        pont++;
                    }
                    if (resp4.isChecked()) {
                        pont++;
                    }
                    if (resp5.isChecked()) {
                        pont++;
                    }
                }

            if (verifica1 == 1 && verifica2 == 1 && verifica3 == 1 && verifica4 == 1 && verifica5 == 1) {
                Bundle extras = new Bundle();//instaciando bundle para enviar a pontuação até a outra activity
                extras.putString("pont", pont.toString());
                Intent finala = new Intent(this, Final.class); // Instanciando nova intent, referente à minha activity
                finala.putExtras(extras);//envia os arquivos para a intent
                startActivity(finala);//Inicia a nova activity
            }
            break;
        }
    }
}
