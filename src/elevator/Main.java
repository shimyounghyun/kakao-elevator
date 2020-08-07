package elevator;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator(0, "tester", 1);
        simulator.start();
    }
}
