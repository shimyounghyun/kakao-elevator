package elevator;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Command {
    public int elevator_id;
    public String command;
    public List<Integer> call_ids;

    public Command(){}

    public Command(int elevator_id, String command) {
        this.elevator_id = elevator_id;
        this.command = command;
        this.call_ids = new ArrayList<>();
    }

    public Command(int elevator_id, String command, List<Integer> call_ids) {
        this.elevator_id = elevator_id;
        this.command = command;
        this.call_ids = call_ids;
    }

    public JSONObject toJsonObject() {
        JSONObject result = new JSONObject();
        result.put("elevator_id", this.elevator_id);
        result.put("command", this.command);
        result.put("call_ids", new JSONArray(this.call_ids));
        return result;
    }
}
