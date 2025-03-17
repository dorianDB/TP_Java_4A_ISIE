package com.polytechtours.model;

import java.time.LocalTime;
public class Heure {
    private byte heures;
    private byte minutes;

    public Heure(int heures, int minutes) throws Exception {
        setHeuresMinutes(heures, minutes);
    }

    public Heure() {
        LocalTime now = LocalTime.now();
        this.heures = (byte) now.getHour();
        this.minutes = (byte) now.getMinute();
    }

    public int getHeures() {
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHeures(int hh) throws Exception {
        if (hh < 0 || hh > 23) {
            throw new Exception("Les heures doivent être comprises entre 0 et 23.");
        }
        this.heures = (byte) hh;
    }

    public void setMinutes(int mm) throws Exception {
        if (mm < 0 || mm > 59) {
            throw new Exception("Les minutes doivent être comprises entre 0 et 59.");
        }
        this.minutes = (byte) mm;
    }

    public void setHeuresMinutes(int hh, int mm) throws Exception {
        setHeures(hh);
        setMinutes(mm);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", heures, minutes);
    }

    public void avancerMinutes(int min) {
        int totalMinutes = heures * 60 + minutes + min;
        if (totalMinutes < 0) {
            totalMinutes = (24 * 60 + totalMinutes) % (24 * 60);
        } else {
            totalMinutes %= 24 * 60;
        }
        this.heures = (byte) (totalMinutes / 60);
        this.minutes = (byte) (totalMinutes % 60);
    }
}