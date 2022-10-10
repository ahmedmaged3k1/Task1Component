package com.example.task1component;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.task1component.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setAddButton();

    }
    private void setAddButton()
    {

        binding.addButton.setOnClickListener(v ->{
            String number1String , number2String ;
            number1String= binding.number1.getText().toString();
            number2String= binding.number2.getText().toString();
            validateData(number1String,number2String);

        });



    }
    private void validateData(String number1String,String number2String)
    {
        if (number1String.isEmpty()|number2String.isEmpty())
        {
            Toast.makeText(this, "Please Enter Two Numbers", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(number1String.contains(".")||number2String.contains("."))
        {
            Toast.makeText(this, "Please Enter Two Integer Numbers", Toast.LENGTH_SHORT).show();
            return;
        }
        int result =  Integer.parseInt(binding.number1.getText().toString()) +Integer.parseInt(binding.number2.getText().toString()) ;
        binding.result.setText(String.valueOf(result));
    }

}