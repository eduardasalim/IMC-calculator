package com.example.apptec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ImcActivity extends AppCompatActivity {

    private EditText edtPeso, edtAltura;
    private Button btnCalcular;
    private TextView txtResult, txtResultLaudo, resultadoImc;
    private ImageView imgResultado;
    private RadioButton rFeminino, rMasculino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAltura = findViewById(R.id.edtAltura);
        edtPeso = findViewById(R.id.edtPeso);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResult = findViewById(R.id.txtResult);
        txtResultLaudo = findViewById(R.id.txtResultLaudo);
        imgResultado = findViewById(R.id.imgResultado);
        resultadoImc = findViewById(R.id.resultadoImc);
        rFeminino = findViewById(R.id.rFeminino);
        rMasculino = findViewById(R.id.rMasculino);
    }

    public void calculaImc(View v) {
        float peso = Float.parseFloat(edtPeso.getText().toString());
        float altura = Float.parseFloat(edtAltura.getText().toString());

        float totalImc = peso / (altura * altura);

        txtResult.setVisibility(View.VISIBLE);
        txtResultLaudo.setVisibility(View.VISIBLE);
        imgResultado.setVisibility(View.VISIBLE);
        resultadoImc.setVisibility(View.VISIBLE);

        if (rMasculino.isChecked()) {
            if (totalImc < 18.5) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.pesoAbaixo);
                txtResultLaudo.setText(R.string.pesoAbaixoLaudo);
                imgResultado.setImageResource(R.drawable.mabaixopeso);
            } else if (totalImc >= 18.5 && totalImc <= 24.9) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.pesoNormal);
                txtResultLaudo.setText(R.string.pesoNormalLaudo);
                imgResultado.setImageResource(R.drawable.mnormalpeso);
            } else if (totalImc >= 25 && totalImc <= 29.9) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.pesoAcima);
                txtResultLaudo.setText(R.string.pesoAcimaLaudo);
                imgResultado.setImageResource(R.drawable.macimapeso);
            } else if (totalImc >= 30 && totalImc <= 34.9) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.obesGrauI);
                txtResultLaudo.setText(R.string.obesGrauILaudo);
                imgResultado.setImageResource(R.drawable.mobsi);
            } else if (totalImc >= 35 && totalImc <= 40) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.obesGrauII);
                txtResultLaudo.setText(R.string.obesGrauIILaudo);
                imgResultado.setImageResource(R.drawable.mobsii);
            } else {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.obesGrauIII);
                txtResultLaudo.setText(R.string.obesGrauIIILaudo);
                imgResultado.setImageResource(R.drawable.mobsiii);
            }
            clear();
        }else if(rFeminino.isChecked()){

            if (totalImc < 18.5) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.pesoAbaixo);
                txtResultLaudo.setText(R.string.pesoAbaixoLaudo);
                imgResultado.setImageResource(R.drawable.fpesoabaixo);
            } else if (totalImc >= 18.5 && totalImc <= 24.9) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.pesoNormal);
                txtResultLaudo.setText(R.string.pesoNormalLaudo);
                imgResultado.setImageResource(R.drawable.fpesonormal);
            } else if (totalImc >= 25 && totalImc <= 29.9) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.pesoAcima);
                txtResultLaudo.setText(R.string.pesoAcimaLaudo);
                imgResultado.setImageResource(R.drawable.fpesoacima);
            } else if (totalImc >= 30 && totalImc <= 34.9) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.obesGrauI);
                txtResultLaudo.setText(R.string.obesGrauILaudo);
                imgResultado.setImageResource(R.drawable.fobsi);
            } else if (totalImc >= 35 && totalImc <= 40) {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.obesGrauII);
                txtResultLaudo.setText(R.string.obesGrauIILaudo);
                imgResultado.setImageResource(R.drawable.fobsii);
            } else {
                resultadoImc.setText("Seu IMC é de "+totalImc+ "kg/m²");
                txtResult.setText(R.string.obesGrauIII);
                txtResultLaudo.setText(R.string.obesGrauIIILaudo);
                imgResultado.setImageResource(R.drawable.fobsiii);
            }
        }
        clear();
    }

    public void clear(){
        edtPeso.setText("");
        edtAltura.setText("");
        rMasculino.setChecked(false);
        rFeminino.setChecked(false);
    }
}