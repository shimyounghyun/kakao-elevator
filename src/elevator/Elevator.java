package elevator;

import java.util.List;
import java.util.Objects;

public class Elevator {
    public int id;
    public int floor;
    public String status;
    public List<Call> passengers;

    public boolean isFull(){
        return passengers.size() == 8;
    }

    public void takeOff(Call passenger){
        passenger.isTakeOn = false;
        passengers.remove(passenger);
    }

    public void takeOn(Call passenger){
        passenger.isTakeOn = true;
        passengers.add(passenger);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Elevator)) return false;
        Elevator elevator = (Elevator) o;
        return id == elevator.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
