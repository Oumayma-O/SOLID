package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource)
    {
        int resourceId = resource.findFreeSlot();
        if (resourceId != INVALID_RESOURCE_ID) {
            resource.markSlotBusy(resourceId);
        } else {
            System.out.println("ERROR: No free slots available for resource type " + resource.getType());
        }
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
        resource.markSlotFree(resourceId);
    }
}
