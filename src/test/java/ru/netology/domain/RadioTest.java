package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void currentStationTest () {
     Radio radio = new Radio();
     radio.setCurrentStation(5);
     int expected = 5;

     assertEquals(expected, radio.getCurrentStation());
    }

   @Test
    public void shouldIncreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.increaseCurrentStation();
        int expected = 6;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldReturnStationLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        radio.increaseCurrentStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.decreaseCurrentStation();
        int expected = 6;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-9);
        radio.decreaseCurrentStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }
}
