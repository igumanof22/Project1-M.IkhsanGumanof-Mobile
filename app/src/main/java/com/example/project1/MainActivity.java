package com.example.project1;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText nama,prodi;
    Button submit;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prodi = (EditText) findViewById(R.id.editProdi);
        nama = (EditText) findViewById(R.id.editNama);
        submit = (Button) findViewById(R.id.btnSubmit);
        output = (TextView) findViewById(R.id.txtData);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        output.setText("Nama Mahasiswa : "+nama.getText().toString()+
                "\nProgram Studi  : "+prodi.getText().toString());
    }
}
