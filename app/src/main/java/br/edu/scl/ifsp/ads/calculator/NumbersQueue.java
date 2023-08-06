package br.edu.scl.ifsp.ads.calculator;

import java.util.ArrayList;
import java.util.List;

public class NumbersQueue {

    private final List<Integer> numbers = new ArrayList<>();
    private int digits = 0;
    public int getNumber(int index){
        return numbers.get(index);
    }
    public int getSize() {return numbers.size();}
    public void addNumber(String op) {
        numbers.add(digits);
        digits = 0;
    }
    public void addDigit(int digit){
        digits *= 10;
        digits += digit;
    }
    public List<Integer> getNumbers() {
        return numbers;
    }

}
