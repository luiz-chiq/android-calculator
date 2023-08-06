package br.edu.scl.ifsp.ads.calculator;

import java.util.ArrayList;
import java.util.List;

public class OperationsQueue {
    private final List<Operations> operations = new ArrayList<>();

    public int getSize() {return operations.size();}
    public void addOperation(Operations op) {
        operations.add(op);
    }
    public void removeOperation(int index){
        operations.remove(index);
    }
    public Operations getOperation(int index){
        return operations.get(index);
    }
    public void removeLastOperation(){
        operations.remove(getSize());
    }
    public void replaceLasOperation(Operations op){
        removeLastOperation();
        operations.add(op);
    }
    public List<Operations> getOperations() {
        return operations;
    }
}
