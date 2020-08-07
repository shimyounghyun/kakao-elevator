package elevator;

import java.util.ArrayList;
import java.util.List;

public class Response {
    String token;
    int timestamp;
    List<Elevator> elevators = new ArrayList<>();
    List<Call> calls = new ArrayList<>();
    boolean is_end;
}
