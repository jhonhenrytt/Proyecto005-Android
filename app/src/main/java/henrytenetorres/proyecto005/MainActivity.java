package henrytenetorres.proyecto005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private EditText et1,et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView)findViewById(R.id.tv1);

        spinner1=(Spinner)findViewById(R.id.spinner);
        //Definimos un vector con la lista de String que mostrará el Spinner:
        String []opciones={"sumar","restar","multiplicar","dividir"};

        //Definimos y creamos un objeto de la clase ArrayAdapter:
        /*Al constructor le pasamos como primer parámetro la referencia de nuestro AppCompatActivity (this), el segundo parámetro indica el tipo de Spinner, pudiendo ser las constantes:
        android.R.layout.simple_spinner_item
        android.R.layout.simple_spinner_dropdown_item
        El tercer parámetro es la referencia del vector que se mostrará.*/
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);

        /*Luego llamamos al método setAdapter de la clase Spinner pasando la referencia del objeto de la clase
         ArrayAdapter que acabamos de crear:*/
        spinner1.setAdapter(adapter);


    }
    //Este método se ejecutará cuando se presione el botón
    public void operar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        String selec=spinner1.getSelectedItem().toString();
        if(selec.equals("sumar")){
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            tv1.setText(resu);
        }else
        if (selec.equals("restar")){
            int resta=nro1-nro2;
            String resu=String.valueOf(resta);
            tv1.setText(resu);
        }else
        if(selec.equals("multiplicar")){
            int multi=nro1*nro2;
            String resu=String.valueOf(multi);
            tv1.setText(resu);
        }else
        if(selec.equals("dividir")){
            int divi=nro1/nro2;
            String resu=String.valueOf(divi);
            tv1.setText(resu);

        }



    }
}
