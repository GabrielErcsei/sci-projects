package ro.sciit.junit.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utility util = new Utility();
        String printInput = util.numberReplacer();
        System.out.println(printInput);
    }
}
