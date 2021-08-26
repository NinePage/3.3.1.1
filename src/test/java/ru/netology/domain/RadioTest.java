package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rad = new Radio();
    Radio rad2 = new Radio(15);

    @Test
    void increaseNumStation() {
        rad.setCurrentNumStation(1);

        rad.increaseNumStation();

        int expected = 2;
        int actual = rad.getCurrentNumStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseNumStationOverMax() {
        rad.setCurrentNumStation(rad.getMaxNumStation() + 1);

        rad.increaseNumStation();

        int expected = rad.getMinNumStation();
        int actual = rad.getCurrentNumStation() - 1;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseNumStation() {
        rad.setCurrentNumStation(5);

        rad.decreaseNumStation();

        int expected = 4;
        int actual = rad.getCurrentNumStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseNumStationUnderMin() {
        rad.setCurrentNumStation(rad.getMinNumStation() - 1);

        rad.decreaseNumStation();

        int expected = rad.getMaxNumStation();
        int actual = rad.getCurrentNumStation() + 1;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        rad.setCurrentVolume(0);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeOverMax() {
        rad.setCurrentVolume(rad.getMaxVolume() + 1);

        rad.increaseVolume();

        int expected = rad.getMaxVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        rad.setCurrentVolume(7);

        rad.decreaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeUnderMin() {
        rad.setCurrentVolume(rad.getMinVolume() - 1);

        rad.decreaseVolume();

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void maxNumStation() {
        int expected = 14;
        int actual = rad2.getMaxNumStation();

        assertEquals(expected, actual);
    }
}