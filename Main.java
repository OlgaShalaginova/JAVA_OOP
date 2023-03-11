package org.example.OOP.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<HDNext> products = new ArrayList<>(Arrays.asList(
            new HDNext("tea", 200, 45),
            new HDNext("hottea", 200, 65),
            new HDNext("hottea1", 200, 65),
            new HDNext("cofe", 300, 50)
    ));
    HDAutomat hdAutomat = new HDAutomat();
    hdAutomat.InitProd(products);
//        System.out.println(hdAutomat.getProduct("cofe", 300, 50).toString());
    System.out.println(hdAutomat.getProduct("cofe"));
}
}
