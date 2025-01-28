package org.example;

import java.util.Random;

abstract class MontyHallGame {
    abstract boolean play(boolean switchDoor);

    protected int chooseDoor() {
        Random random = new Random();
        return random.nextInt(3); // выбираем от 0 до 2
    }
}

