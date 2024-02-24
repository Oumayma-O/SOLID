package com.directi.training.ocp.exercise;

public abstract class Resource {
    protected static final int INVALID_RESOURCE_ID = -1;

    public abstract int findFreeSlot();

    public abstract int findFree();

    public abstract void markSlotFree(int resourceId);

    public abstract void markSlotBusy(int resourceId);

    public abstract String getType();
}
