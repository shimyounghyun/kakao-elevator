package elevator;

import java.util.ArrayList;
import java.util.List;

public class Response {
    String token;
    int timestamp;
    List<Elevator> elevators = new ArrayList<>();
    List<Call> calls = new ArrayList<>();
    boolean is_end;

    @Override
    public String toString() {
        return "Response{" +
                "token='" + token + '\'' +
                ", timestamp=" + timestamp +
                ", elevators=" + elevators +
                ", calls=" + calls +
                ", is_end=" + is_end +
                '}';
    }
}
