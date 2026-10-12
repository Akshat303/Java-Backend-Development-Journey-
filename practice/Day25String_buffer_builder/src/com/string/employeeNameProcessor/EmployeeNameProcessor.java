package com.string.employeeNameProcessor;


public class EmployeeNameProcessor {

    private StringBuilder nameBuilder;

    public EmployeeNameProcessor(String initialName) {
        this.nameBuilder = new StringBuilder(initialName);
        printState("Initial name");
    }

    public void append(String str) {
        nameBuilder.append(str);
        printState("After append");
    }

    public void insert(int index, String str) {
        nameBuilder.insert(index, str);
        printState("After insert");
    }

    public void replace(int start, int end, String str) {
        nameBuilder.replace(start, end, str);
        printState("After replace");
    }

    public void delete(int start, int end) {
        nameBuilder.delete(start, end);
        printState("After delete");
    }

    public void reverse() {
        nameBuilder.reverse();
        printState("After reverse");
    }

    public String getName() {
        return nameBuilder.toString();
    }

    private void printState(String operation) {
        System.out.println(operation + ": " + nameBuilder);
        System.out.println("Identity Hash Code: " + System.identityHashCode(nameBuilder));
        System.out.println("--------------------------------------------------");
    }
}
