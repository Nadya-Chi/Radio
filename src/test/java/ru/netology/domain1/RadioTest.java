package ru.netology.domain1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void quantityStations() {
        Radio radio = new Radio(20);
        radio.setQuantityStations(20);
        assertEquals(20, radio.getQuantityStations());
    }

    @Test
    public void quantityStations10() {
        Radio radio = new Radio(20);
        radio.setQuantityStations(10);
        assertEquals(10, radio.getQuantityStations());
    }

    @Test
    public void station() {
        Radio radio = new Radio(20);
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }

    @Test
    public void stationFalse() {
        Radio radio = new Radio(20);
        radio.setStation(20);
        assertEquals(20, radio.getStation());
    }

    @Test
    public void stationFalse2() {
        Radio radio = new Radio(20);
        radio.setStation(0);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void stationFalse3() {
        Radio radio = new Radio(20);
        radio.setStation(21);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void stationFalse4() {
        Radio radio = new Radio(20);
        radio.setStation(-1);
        assertEquals(20, radio.getStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(20);
        int station = 5;
        radio.setStation(station);
        radio.nextStation();
        assertEquals(6,radio.getStation());
    }

    @Test
    public void nextStation0() {
        Radio radio = new Radio(20);
        int station = 20;
        radio.setStation(station);
        radio.nextStation();
        assertEquals(0,radio.getStation());
    }

    @Test
    public void nextStation1() {
        Radio radio = new Radio(20);
        int station = 0;
        radio.setStation(station);
        radio.nextStation();
        assertEquals(1,radio.getStation());
    }

    @Test
    public void nextStationQuantity() {
        Radio radio = new Radio(20);
        int station = 19;
        radio.setStation(station);
        radio.nextStation();
        assertEquals(20,radio.getStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(20);
        int station = 5;
        radio.setStation(station);
        radio.prevStation();
        assertEquals(4,radio.getStation());
    }

    @Test
    public void prevStationQuantity() {
        Radio radio = new Radio(20);
        int station = 0;
        radio.setStation(station);
        radio.prevStation();
        assertEquals(20,radio.getStation());
    }

    @Test
    public void prevStation1() {
        Radio radio = new Radio(20);
        int station = 20;
        radio.setStation(station);
        radio.prevStation();
        assertEquals(19,radio.getStation());
    }

    @Test
    public void prevStation0() {
        Radio radio = new Radio(20);
        int station = 1;
        radio.setStation(station);
        radio.prevStation();
        assertEquals(0,radio.getStation());
    }

    @Test
    public void choiceStation() {
        Radio radio = new Radio(20);
        int number = 7;
        radio.choiceStation(number);
        assertEquals(7, radio.getStation());
    }

    @Test
    public void choiceStationFalse() {
        Radio radio = new Radio(20);
        int number = 21;
        radio.choiceStation(number);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void choiceStationFalse2() {
        Radio radio = new Radio(20);
        int number = -1;
        radio.choiceStation(number);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio(20);
        int volume = 50;
        radio.setVolume(volume);
        radio.increaseVolume();
        assertEquals(51, radio.getVolume());
    }

    @Test
    public void increaseVolumeFalse() {
        Radio radio = new Radio(20);
        int volume = 101;
        radio.setVolume(volume);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio(20);
        int volume = 60;
        radio.setVolume(volume);
        radio.decreaseVolume();
        assertEquals(59, radio.getVolume());
    }

    @Test
    public void decreaseVolumeFalse() {
        Radio radio = new Radio(20);
        int volume = -1;
        radio.setVolume(volume);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
}
