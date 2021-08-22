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
        radio.increaseStationOverLimit();
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
        radio.decreaseStationOverLimit();
        int expected = 9;

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
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseCurrentVolume();
        int expected = 8;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        radio.increaseVolumeOverLimit();
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
    public void shouldDecreaseCurrentVolumeIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-9);
        radio.decreaseVolumeOverLimit();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolume());
    }
}
