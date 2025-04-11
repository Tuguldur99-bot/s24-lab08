package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {

    // Field for task 1.
    private final Road road;
    private final Records records;
    private final FroggerID id;

    // Field for task 2. Anything to add/change?
    public Frogger(Road road, int startPosition, Records records, FroggerID id) {
        this.road = road;
        this.records = records;
        this.id = id;
        road.placeFrogger(this, startPosition);
    }

    /**
     * Moves Frogger.
     *
     * @param forward true is move forward, else false.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        return road.moveFrogger(this, forward);
    }

    // TODO: Do you notice any issues here?
    public int getCurrentPosition() {
        return road.getPosition(this);
    }
    public boolean recordMyself() {
        return records.addRecord(id); 
    }
    
}
