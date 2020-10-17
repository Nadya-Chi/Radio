package ru.netology.domain1;

public class Radio {
    private int station=0;
    private int volume=0;

    public int getStation() {
        return this.station;
    }
    public void setStation(int station) {
        if (station >= 10) {
            station = 0;
        }
        if (station <= -1) {
            station = 9;
        }
        this.station = station;
    }

    public void nextStation() {
        if (this.station < 9) {
            this.station++;
        } else if (this.station == 9) {
            this.station = 0;
        }
    }

    public void prevStation() {
        if (this.station > 0) {
            this.station--;
        } else if (this.station == 0) {
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
        if (this.volume >= 10) {
            this.volume = 10;
        }
        if (this.volume < 10) {
            this.volume++;
        }
    }

    public void decreaseVolume() {
        if (this.volume <= 0) {
            volume = 0;
        }
        if (this.volume > 0) {
            this.volume--;
        }
    }
}
