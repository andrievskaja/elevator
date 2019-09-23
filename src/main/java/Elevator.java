import java.util.HashSet;
import java.util.Set;

public class Elevator {

    private Long location;
    private Direction direction;
    private Set<Long> floorStopEnterToElevator= new HashSet<Long>();

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Set<Long> getFloorStopEnterToElevator() {
        return floorStopEnterToElevator;
    }

    public void setFloorStopEnterToElevator(Set<Long> floorStopEnterToElevator) {
        this.floorStopEnterToElevator = floorStopEnterToElevator;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "location=" + location +
                ", direction=" + direction +
                ", floorStopEnterToElevator=" + floorStopEnterToElevator +
                '}';
    }
}
