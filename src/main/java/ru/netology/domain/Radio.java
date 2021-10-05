package ru.netology.domain;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation > maxStation) {
            this.currentStation = minStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = maxStation;
        }
    }

    public int getMinStation() {
        return minStation;
    }
    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void setPreviousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

   public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume () {
        if (currentVolume == maxVolume) {
            currentVolume = minVolume;
            return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == minVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume--;
    }
}

