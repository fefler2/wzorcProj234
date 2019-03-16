package Reflect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void throwExc() {
        Main main = new Main();
        assertThrows(Exception.class,
                ()-> main.throwExc());
    }
}