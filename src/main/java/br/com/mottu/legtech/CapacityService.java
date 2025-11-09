package br.com.mottu.legtech;
public class CapacityService {
    public boolean isZoneCapacityAllowed(int zoneCapacity, int patioCapacity) {
        return zoneCapacity >= 0 && patioCapacity >= 0 && zoneCapacity <= patioCapacity;
    }
}
