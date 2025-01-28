package org.example;

import java.util.Random;

class MontyHallSimulation extends MontyHallGame {
    @Override
    public boolean play(boolean switchDoor) {
        int carDoor = chooseDoor();
        int playerChoice = chooseDoor();
        int revealedDoor = revealDoor(carDoor, playerChoice);
        int finalChoice = switchDoor ? switchDoor(playerChoice, revealedDoor) : playerChoice;

        return finalChoice == carDoor;
    }

    public int revealDoor(int carDoor, int playerChoice) {
        Random random = new Random();
        int doorToReveal;
        do {
            doorToReveal = random.nextInt(3);
        } while (doorToReveal == carDoor || doorToReveal == playerChoice);
        return doorToReveal;
    }

    public int switchDoor(int playerChoice, int revealedDoor) {
        return 3 - playerChoice - revealedDoor; // по свойству суммирования
    }
}
