package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тесты расширенных настроек
    @Test
    public void shouldCheckRadioStationNumberIfSetOnBound() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStationNumber(24);
        assertEquals(radio.getNumberOfStations(), 25);
        assertEquals(radio.getCurrentRadioStationNumber(), 24);
    }

    @Test
    public void shouldCheckRadioStationNumberIfSetAsInputNumberOfStations() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStationNumber(30);
        assertEquals(radio.getCurrentRadioStationNumber(), 0);
    }

    @Test
    public void shouldCheckRadioStationNumberIfSetAboveInputNumberOfStations() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStationNumber(26);
        assertEquals(radio.getCurrentRadioStationNumber(), 0);
    }

    @Test
    public void shouldCheckRadioStationNumberIfSetCurrentStationUnderInputMax() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStationNumber(15);
        assertEquals(radio.getCurrentRadioStationNumber(), 15);
    }


    // Предыдущее ДЗ, тесты работы настроек по умолчанию

    // Changing Radio Station

        // Checking Setter Bounds

    @Test
    public void shouldCheckRadioStationNumberByDefault() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationNumberInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationNumberInTheLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberInTheUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test // If there button "-" is avaliable
    public void shouldNotSetRadioStationNumberUnderTheLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveTheUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

        // Checking Prev & Next Buttons Functions

    @Test
    public void shouldSwitchToTheNextRadioStationIfNotLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextRadioStationIfLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousRadioStationIfNotLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousRadioStationIfFirst() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }


    // Checking Volume
        // Checking Setter Bounds

    @Test
    public void shouldCheckVolumeByDefault() {
        Radio radio = new Radio();
        int expected = 50;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeInTheLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeInTheUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // If there button "-" is avaliable
    public void shouldNotSetVolumeUnderTheLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveTheUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

        // Checking Increase $ Reduce Volume Buttons Functions
    @Test
    public void shouldIncreaseVolumeIfNotLast() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeIfLast() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeIfNotFirst() {
        Radio radio = new Radio();
        radio.reduceVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
       assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolumeIfFirst() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
