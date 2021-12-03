package hu.szofte.rectangle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private double side1;
    private double side2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etSide1 = findViewById(R.id.side1);
        EditText etSide2 = findViewById(R.id.side2);
        Button btnArea = findViewById(R.id.btnArea);
        Button btnPerimeter = findViewById(R.id.btnPerimeter);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        Button btnNewGame = findViewById(R.id.btnNewGame);
        TextView tvResult = findViewById(R.id.result);

        btnArea.setEnabled(false);
        btnPerimeter.setEnabled(false);
        tvResult.setText("You will see the result here!");

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnArea.setEnabled(true);
                btnPerimeter.setEnabled(true);
            }
        });

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1String = etSide1.getText().toString();
                side1 = Double.parseDouble(num1String);
                String num2String = etSide2.getText().toString();
                side2 = Double.parseDouble(num2String);
                String areaResult = String.valueOf(calcArea(side1, side2));

                tvResult.setText("Area of the rectangle: " + areaResult);
            }
        });

        btnPerimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1String = etSide1.getText().toString();
                side1 = Double.parseDouble(num1String);
                String num2String = etSide2.getText().toString();
                side2 = Double.parseDouble(num2String);
                String areaResult = String.valueOf(calcPerimeter(side1, side2));

                tvResult.setText("Perimeter of the rectangle: " + areaResult);
            }
        });

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                side1 = 0;
                side2 = 0;
                btnArea.setEnabled(false);
                btnPerimeter.setEnabled(false);
                Toast.makeText(MainActivity.this,
                        "The value of both sides is set to 0.", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public double calcArea(double num1, double num2) {
        double resultArea = num1 * num2;
        return resultArea;
    }

    public double calcPerimeter(double num1, double num2) {
        double resultPerimeter = 2 * (num1 + num2);
        return resultPerimeter;
    }
}