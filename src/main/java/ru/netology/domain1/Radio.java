package ru.netology.domain1;

public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }
    public void setStation(int station) {
        if (station > 9) {
            return;
        }
        if (station < 0) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {
        if (station < 9) {
            this.station++;
        }
        if (station == 9) {
            this.station = 0;
        }
    }

    public void prevStation() {
        if (station > 0) {
            this.station--;
        }
        if (station == 0) {
            this.station = 9;
        }
    }

    public void choiceStation(int number) {
        if (number > 9) {
            return;
        }
        if (number < 0) {
            return;
        }
        this.station = number;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume >= 10) {
            this.volume = 10;
        }
        if (volume < 10) {
            this.volume++;
        }
    }

    public void decreaseVolume() {
        if (volume <= 0) {
            volume = 0;
        }
        if (volume > 0) {
            this.volume--;
        }
    }
}
