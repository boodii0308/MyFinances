package com.example.myfinances;

import static com.example.myfinances.R.id.radioCD;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton radioCD = (RadioButton) findViewById(R.id.radioCD);
        RadioButton radioLoan = (RadioButton) findViewById(R.id.radioLoan);
        RadioButton radioCheckingAccount = (RadioButton) findViewById(R.id.radioCheckingAccount);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        Button buttonCancel = (Button) findViewById(R.id.buttonCancel);
        Button buttonSave = (Button) findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String selectedAccount = "";
                if(radioCD.isChecked()){
                    selectedAccount = "Account number\nInitial balance\nCurrent balance\nInterest rate";
                }
                if(radioLoan.isChecked()){
                    selectedAccount = "Account number\nInitial balance\nCurrent balance\nPayment amount\nInterest rate";
                }
                if(radioCheckingAccount.isChecked()){
                    selectedAccount = "Account number\nCurrent balance";
                }
                textResult.setText(selectedAccount);
            }
        });
    }

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        final RadioGroup radgroup = (RadioGroup) findViewById(R.id.radioGroup);
        int radioId = radgroup.getCheckedRadioButtonId();
        RadioButton single = (RadioButton)  findViewById(radioId);
        String str = "";
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}