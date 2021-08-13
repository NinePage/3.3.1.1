package ru.netology.domain;

public class Radio {
    private int maxNumStation = 9;
    private int minNumStation = 0;
    private int currentNumStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public int getMaxNumStation() {
        return maxNumStation;
    }

    public int getMinNumStation() {
        return minNumStation;
    }

    public int getCurrentNumStation() {
        return currentNumStation;
    }

    public int increaseNumStation() {
        setCurrentNumStation(currentNumStation + 1);
        return currentNumStation;
    }

    public int decreaseNumStation() {
        setCurrentNumStation(currentNumStation - 1);
        return currentNumStation;
    }

    public void setCurrentNumStation(int currentNumStation) {
        if (currentNumStation < minNumStation) {
            currentNumStation = maxNumStation;
        }
        if (currentNumStation > maxNumStation) {
            currentNumStation = minNumStation;
        }
        this.currentNumStation = currentNumStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        setCurrentVolume(currentVolume + 1);
        return currentVolume;
    }

    public int decreaseVolume() {
        setCurrentVolume(currentVolume - 1);
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }
}