package ru.netology.domain;

public class Radio {
    // Поля для задания значений объекта Радио
    private int currentRadioStationNumber;
    private int currentVolume = 50;
    private int numberOfStations = 10;
    private int maxStation = 9;

    // КОНСТРУКТОРЫ

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        maxStation = numberOfStations - 1;
    }

    // МЕТОДЫ

    // Методы Getter - показать заданные значения объекта Радио
    public int getRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getVolume() {
        return currentVolume;
    }

    public int getNumberOfStations() {

        return numberOfStations;
    }

    // Методы Setter  - изменить (настроить) значения объекта Радио

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        ;
        if (newCurrentRadioStationNumber > maxStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    // Методы для кнопок переключения

//    public void next() {
//        if (currentRadioStationNumber == numberOfStations - 1) {
//            currentRadioStationNumber = 0;
//        } else {
//            currentRadioStationNumber++;
//        }
//    }

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
