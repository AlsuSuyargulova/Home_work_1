package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Random;


public class MontyHallGameTest extends AbstractTest {
    @Test
    public void testPlayWithSwitch() {
        int wins = 0;
        int iterations = 10000;

        for (int i = 0; i < iterations; i++) {
            if (simulation.play(true)) {
                wins++;
            }
        }

        Assertions.assertTrue(wins / (double) iterations > 0.5);
    }

    @Test
    public void testPlayWithoutSwitch() {
        int wins = 0;
        int iterations = 10000;

        for (int i = 0; i < iterations; i++) {
            if (simulation.play(false)) {
                wins++;
            }
        }

        Assertions.assertTrue(wins / (double) iterations < 0.5);
    }

    @ParameterizedTest
    @ValueSource(ints = 1)
    @DisplayName("демонстрация работы успешного параметраризованного теста")
    void parameterizedTest(int number) {
        //given
        int door = 1;
        int revealedDoor = simulation.revealDoor(number, door);
        //when
        //then
        Assertions.assertTrue(revealedDoor < 3);
    }

    @ParameterizedTest
    @ValueSource(ints = 1)
    @DisplayName("демонстрация работы неуспешного параметраризованного теста")
    @Disabled
    void parameterizedTestFailed(int number) {
        //given
        int door = 1;
        int revealedDoor = simulation.revealDoor(number, door);
        //when
        //then
        Assertions.assertTrue(revealedDoor > 3);
    }
}