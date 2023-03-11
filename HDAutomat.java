package org.example.OOP.HW1;

import java.util.ArrayList;
import java.util.List;
public class HDAutomat implements TreadAutomat {
    private List<HDNext> hdAutomat = new ArrayList<>();
    public void InitProd(List<HDNext> prod) {

        this.hdAutomat = prod;
    }

    public HDNext getProduct(String name, int vol, int temp) {
        for (HDNext el : hdAutomat) {
            if (el.name.equals(name) && el.volume == vol && el.getTemp() == temp) {
                return el;
            }
        }
        return new HDNext("Нет такого напитка", 0, 0);
    }

    public HDNext getProduct(String name, int vol) {
        for (HDNext el : hdAutomat) {
            if (el.name.equals(name) && el.volume == vol) {
                return el;
            }
        }
        return new HDNext("Нет такого напитка", 0, 0);
    }

    public HDNext getProduct(String name) {
        for (HDNext el : hdAutomat) {
            if (el.name.equals(name)) {
                return el;
            }
        }
        return new HDNext("Нет такого напитка", 0, 0);
    }

    public HDNext getProduct() {
        return null;
    }
}
