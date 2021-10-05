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
    public void shouldTurnNextStationPositive() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setNextStation();
        int expected = 6;

        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void shouldTurnNextStationNegative() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldReturnStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.setPreviousStation();
        int expected = 6;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void currentVolumeTest () {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int expected = 7;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseCurrentVolume();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumePositive() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseCurrentVolume();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.decreaseCurrentVolume();
        int expected = 6;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldReturnMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(8);
        int expected = 8;

        assertEquals(expected, radio.getMaxStation());
    }

    @Test
    public void shouldReturnMinStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        int expected = 0;

        assertEquals(expected, radio.getMinStation());
    }

    @Test
    public void shouldReturnVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        int expected = 10;

        assertEquals(expected, radio.getMaxVolume());
    }

    @Test
    public void shouldReturnMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        int expected = 0;

        assertEquals(expected, radio.getMinVolume());
    }

}
