package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.nio.channels.Pipe;

public class MainActivity2 extends AppCompatActivity {

pizzas pizza2;
TextView total;
double total_price;

    Button enviar;

    private EditText c1;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pizza2 = new pizzas();
        total = findViewById(R.id.total);
        c1 = findViewById(R.id.caja);
        t1 = findViewById(R.id.mostrar);

        enviar  = (Button) findViewById(R.id.btnenviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);

            }

        });

    }





    public void radioClicked(View view) {
        boolean checked = ((RadioButton) view). isChecked();
        String cad1= c1.getText().toString();
        t1.setText(cad1+"");

        switch (view.getId()){
            case  R.id.pb1:
                if (checked)
                    pizza2.setPizzas_size_price(10);
                break;
            case R.id.pb2:
                if (checked)
                    pizza2.setPizzas_size_price(14);
                break;
            case R.id.pb3:
                if(checked)
                    pizza2.setPizzas_size_price(18);
                break;



        }
        total.setText(" "+ pizza2.getPizzas_size_price());
    }

    public void incredienteClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        String cad1= c1.getText().toString();
        t1.setText(cad1+"");

        switch (view.getId()){
            case R.id.cl1:
                if (checked)
                    pizza2.setMeat_prince(1);
                else
                    pizza2.setMeat_prince(0);
                break;

            case R.id.cl2:
                if (checked)
                    pizza2.setCheese_price(2);
                else
                    pizza2.setMeat_prince(0);
                break;

            case R.id.cl3:
                if (checked)
                    pizza2.setVeggie_price(1);
                else
                    pizza2.setVeggie_price(0);
                break;

            case R.id.cl4:
                if (checked)
                    pizza2.setN4(2);
                else
                    pizza2.setN4(0);
                break;

            case R.id.cl5:
                if (checked)
                    pizza2.setN5(1);
                else
                    pizza2.setN5(0);
                break;

            case R.id.cl6:
                if (checked)
                    pizza2.setN6(3);
                else
                    pizza2.setN6(0);
                break;

            case R.id.cl7:
                if (checked)
                    pizza2.setN7(5);
                else
                    pizza2.setN7(0);
                break;







        }
        total.setText(" " +calcular_total());
    }

    private double calcular_total() {

        total_price = pizza2.getPizzas_size_price()+ pizza2.getCheese_price()+pizza2.getMeat_prince()+pizza2.getVeggie_price()+pizza2.getN4()+pizza2.getN5()+pizza2.getN6()+pizza2.getN7();

        return total_price;
    }
}
