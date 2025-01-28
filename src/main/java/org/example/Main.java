package org.example;

public class Main {
    public static void main(String[] args) {
        MontyHallSimulation simulation = new MontyHallSimulation();
        int winsWithSwitch = 0;
        int winsWithoutSwitch = 0;
        int iterations = 1000;

        for (int i = 0; i < iterations; i++) {
            if (simulation.play(true)) {
                winsWithSwitch++;
            }
            if (simulation.play(false)) {
                winsWithoutSwitch++;
            }
        }

        System.out.println("Wins by switching: " + winsWithSwitch);
        System.out.println("Wins without switching: " + winsWithoutSwitch);
    }
}