package com.hkit.smartcloset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SaveNewcloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_newclo);

        // Spinner
        Spinner Spinner_sort1 = findViewById(R.id.sort1);

        ArrayAdapter Adapter_sort1 = ArrayAdapter.createFromResource(this,
                R.array.data_sort1, android.R.layout.simple_spinner_item);

        Adapter_sort1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner_sort1.setAdapter(Adapter_sort1);


        String str_sort1 = Spinner_sort1.getSelectedItem().toString();

        if (str_sort1.equals("상의")){

        }else if(str_sort1.equals("하의")){
            under();
        }
    }

    public void top() {
        Spinner monthSpinner = findViewById(R.id.sort2);
        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this,
                R.array.date_month, android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthSpinner.setAdapter(monthAdapter);
    }

    public void under() {


    }
}

