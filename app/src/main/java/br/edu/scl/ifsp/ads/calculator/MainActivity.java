package br.edu.scl.ifsp.ads.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private Button bt0;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button btEquals;
    private Button btSum;
    private Button btClear;

    private TextView resultTv;

    private List<String> operations = new ArrayList<>();



    private String result = "";

    public static List<Integer> extractNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            numbers.add(number);
        }

        return numbers;
    }

    public static List<String> extractOperations(String input) {
        List<String> operations = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d0\\d1\\d2\\d3\\d4\\d5\\d6\\d7\\d8\\d9");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String operarion = matcher.group();
            operations.add(operarion);
        }
        System.out.println(operations.get(0) + operations.get(1));
        return operations;

    }

    public static int calculate(String input) {
        //extractOperations(input);
        List<Integer> numbers = extractNumbers(input);
        int sum = 0;
        for (Integer integer : numbers) {
            int intValue = integer.intValue();
            sum += intValue;
        }
        return sum;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTv = findViewById(R.id.resultTv);
        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        btEquals = findViewById(R.id.btEquals);
        btSum = findViewById(R.id.btSum);
        btClear = findViewById(R.id.btClear);
        bt0.setOnClickListener(v->{
            result = result + "0";
            resultTv.setText(result);
        });
        bt1.setOnClickListener(v->{
            result = result + "1";
            resultTv.setText(result);
        });
        bt2.setOnClickListener(v->{
            result = result + "2";
            resultTv.setText(result);
        });
        bt3.setOnClickListener(v->{
            result = result + "3";
            resultTv.setText(result);
        });
        bt4.setOnClickListener(v->{
            result = result + "4";
            resultTv.setText(result);
        });
        bt5.setOnClickListener(v->{
            result = result + "5";
            resultTv.setText(result);
        });
        bt6.setOnClickListener(v->{
            result = result + "6";
            resultTv.setText(result);
        });
        bt7.setOnClickListener(v->{
            result = result + "7";
            resultTv.setText(result);
        });
        bt8.setOnClickListener(v->{
            result = result + "8";
            resultTv.setText(result);
        });
        bt9.setOnClickListener(v->{
            result = result + "9";
            resultTv.setText(result);
        });
        btClear.setOnClickListener(v->{
            result = "";
            resultTv.setText(result);
        });
        btSum.setOnClickListener(v->{
            result = result + "+";
            resultTv.setText(result);
        });
        btEquals.setOnClickListener(v->{
            result = String.valueOf(calculate(result));
            resultTv.setText(result);
        });

    }
}