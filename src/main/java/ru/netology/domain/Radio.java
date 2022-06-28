package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {

    private int currentRadioStationNumber;
    private int currentVolume = 50;
    private int numberOfStations = 10;
    private int maxStation = 9;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        maxStation = numberOfStations - 1;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        ;
        if (currentRadioStationNumber > maxStation) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentRadioStationNumber < maxStation) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = maxStation;
        } else {
            currentRadioStationNumber--;
        }
    }

    // Методы для кнопок изменения громкости
    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        } else {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume--;
        }
    }
}


