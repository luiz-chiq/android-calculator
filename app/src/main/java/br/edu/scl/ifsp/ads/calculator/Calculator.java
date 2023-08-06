package br.edu.scl.ifsp.ads.calculator;

import java.util.List;

public class Calculator {
    static public Double calculate(NumbersQueue numbers, OperationsQueue operations){
        Double result = Double.valueOf(numbers.getNumber(0));
        for(int i = 0; i<(operations.getSize()); i++){
            switch (operations.getOperation(i)){
                case ADDITION:
                    result += numbers.getNumber(i);
            }
        }
        return result;
    }
}
//        for(int i = 0;{
//            if(op.equals(Operations.MULTIPLICATION) || op.equals(Operations.DIVISION)){
//
//            }
//        }
