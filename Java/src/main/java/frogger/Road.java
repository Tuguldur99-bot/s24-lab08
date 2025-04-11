package frogger;

import java.util.HashMap;
import java.util.Map;

public class Road {
    private final boolean[] occupied;
    private final Map<Frogger, Integer> positions = new HashMap<>();

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public void placeFrogger(Frogger frogger, int startPosition) {
        if (isValid(startPosition) && !isOccupied(startPosition)) {
            positions.put(frogger, startPosition);
        }
    }

    public boolean moveFrogger(Frogger frogger, boolean forward) {
        Integer current = positions.get(frogger);
        if (current == null) return false;

        int next = current + (forward ? 1 : -1);
        if (!isValid(next) || isOccupied(next)) return false;

        positions.put(frogger, next);
        return true;
    }

    public boolean isOccupied(int position) {
        return occupied[position];
    }

    public boolean isValid(int position) {
        return position >= 0 && position < occupied.length;
    }

    public int getPosition(Frogger frogger) {
        return positions.getOrDefault(frogger, -1);
    }
}
