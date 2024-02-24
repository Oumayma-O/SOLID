package com.directi.training.ocp.exercise;

public class TimeSlot extends Resource {

    @Override
    public int findFreeSlot() {
        return 0;
    }

    @Override
    public int findFree() {
        return 0;
    }

    @Override
    public void markSlotFree(int resourceId) {

    }

    @Override
    public void markSlotBusy(int resourceId) {

    }

    @Override
    public String getType() {
        return null;
    }
}
