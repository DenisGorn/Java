package ДЗ3;

import java.util.ArrayList;
import java.util.Collections;

public class prog2 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Плутон");
        planets.add("Земля");
        planets.add("Сатурн");
        for (int i = 0; i < planets.size(); i++) {

        }
        System.out.println("Планета Меркурий повторяется " + Collections.frequency(planets, "Меркурий"));
        System.out.println("Планета Венера повторяется " + Collections.frequency(planets, "Венера"));
        System.out.println("Планета Земля повторяется " + Collections.frequency(planets, "Земля"));
        System.out.println("Планета Марс повторяется " + Collections.frequency(planets, "Марс"));
        System.out.println("Планета Юпитер повторяется " + Collections.frequency(planets, "Юпитер"));
        System.out.println("Планета Уран повторяется " + Collections.frequency(planets, "Уран"));
        System.out.println("Планета Плутон повторяется " + Collections.frequency(planets, "Плутон"));
        System.out.println("Планета Сатурн повторяется " + Collections.frequency(planets, "Сатурн"));


    }
}
