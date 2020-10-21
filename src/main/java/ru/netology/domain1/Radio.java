package ru.netology.domain1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int quantityStations = 10;
    private int station = 0;
    private int volume = 0;

//    public int getQuantityStations() {
//        return this.quantityStations;
//    }
//    public void setQuantityStations(int quantityStations) {
//        this.quantityStations = quantityStations;
//    }

    public Radio(int quantityStations) {
        this.quantityStations = quantityStations;
    }

//    public int getStation() {
//        return this.station;
//    }
    public void setStation(int station) {
        if (station >= this.quantityStations+1) {
            station = 0;
        }
        if (station <= -1) {
            station = this.quantityStations;
        }
        this.station = station;
    }

    public void nextStation() {
        if (this.station < this.quantityStations) {
            this.station++;
        } else if (this.station == this.quantityStations) {
            this.station = 0;
        }
    }

    public void prevStation() {
        if (this.station > 0) {
            this.station--;
        } else if (this.station == 0) {
            this.station = this.quantityStations;
        }
    }

    public void choiceStation(int number) {
        if (number > this.quantityStations) {
            return;
        }
        if (number < 0) {
            return;
        }
        this.station = number;
    }

//    public int getVolume() {
//        return volume;
//    }
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

    public void increaseVolume() {
        if (this.volume >= 100) {
            this.volume = 100;
        }
        if (this.volume < 100) {
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
