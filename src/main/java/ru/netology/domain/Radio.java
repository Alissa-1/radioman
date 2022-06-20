package ru.netology.domain;

public class Radio {
    // Поля для задания значений объекта Радио
    private int currentRadioStationNumber;
    private int currentVolume = 5;

    // Метод Getter - показать заданные значения объекта Радио
    public int getRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getVolume() {
        return currentVolume;
    }

    // Метод Setter  - изменить (настроить) значения объекта Радио

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        ;
        if (newRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }

    // Методы

    // Методы для кнопок переключения

    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber--;
        }
    }

    // Методы для кнопок изменения громкости
    public void increaseVolume() {
        if (currentVolume == 10) {
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
