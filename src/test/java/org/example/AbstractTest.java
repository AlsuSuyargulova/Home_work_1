package org.example;
import org.junit.jupiter.api.BeforeAll;

public class AbstractTest {
    static MontyHallSimulation simulation;

    @BeforeAll
    static void init() {
        simulation = new MontyHallSimulation();
    }
}
