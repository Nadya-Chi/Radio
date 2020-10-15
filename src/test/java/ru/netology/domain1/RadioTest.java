package ru.netology.domain1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void station() {
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }

    @Test
    public void stationFalse() {
        Radio radio = new Radio();
        radio.setStation(11);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void stationFalse2() {
        Radio radio = new Radio();
        radio.setStation(-5);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        int station = 5;
        radio.setStation(station);
        radio.nextStation();
        assertEquals(6,radio.getStation());
    }

    @Test
    public void nextStation0() {
        Radio radio = new Radio();
        int station = 9;
        radio.setStation(station);
        radio.nextStation();
        assertEquals(0,radio.getStation());
    }

    @Test
    public void nextStation1() {
        Radio radio = new Radio();
        int station = 0;
        radio.setStation(station);
        radio.nextStation();
        assertEquals(1,radio.getStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        int station = 5;
        radio.setStation(station);
        radio.prevStation();
        assertEquals(4,radio.getStation());
    }

    @Test
    public void prevStation9() {
        Radio radio = new Radio();
        int station = 0;
        radio.setStation(station);
        radio.prevStation();
        assertEquals(9,radio.getStation());
    }

    @Test
    public void prevStation8() {
        Radio radio = new Radio();
        int station = 9;
        radio.setStation(station);
        radio.prevStation();
        assertEquals(8,radio.getStation());
    }

    @Test
    public void choiceStation() {
        Radio radio = new Radio();
        int number = 7;
        radio.choiceStation(number);
        assertEquals(7, radio.getStation());
    }

    @Test
    public void choiceStationFalse() {
        Radio radio = new Radio();
        int number = 10;
        radio.choiceStation(number);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void choiceStationFalse2() {
        Radio radio = new Radio();
        int number = -1;
        radio.choiceStation(number);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        int volume = 5;
        radio.setVolume(volume);
        radio.increaseVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    public void increaseVolumeFalse() {
        Radio radio = new Radio();
        int volume = 11;
        radio.setVolume(volume);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        int volume = 6;
        radio.setVolume(volume);
        radio.decreaseVolume();
        assertEquals(5, radio.getVolume());
    }

    @Test
    public void decreaseVolumeFalse() {
        Radio radio = new Radio();
        int volume = -5;
        radio.setVolume(volume);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
}
