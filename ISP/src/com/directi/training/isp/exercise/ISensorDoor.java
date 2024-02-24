package com.directi.training.isp.exercise;

public interface ISensorDoor extends Door
{
    void lock();

    void unlock();

    void open();

    void close();

    void proximityCallback();
}
