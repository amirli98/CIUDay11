package com.company.chapter7;

public class ShellSortApp {
    public static void main(String[] args) {
        int maxSize = 20;
        ArraySh arraySh;
        arraySh = new ArraySh(maxSize);
        for (int i = 0; i < maxSize; i++) {
            arraySh.insert((long) (Math.random()*999));
        }
        arraySh.display();
        arraySh.shellSort();
        arraySh.display();
    }
}
