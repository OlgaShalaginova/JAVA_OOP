package org.example.OOP.HW1;
import java.util.ArrayList;
import java.util.List;
public class HDNext extends HotDrink {
    private int temp;
    public HDNext(String name, int volume, int temp) {
        super(name, volume);
        this.temp = temp;
    }
    @Override
    public String toString() {
        return "HDNext { " + "name = " + name + ", temp = " + temp + ", volume = " + volume + " }";
    }
    public int getTemp() {
        return temp;
    }
}

