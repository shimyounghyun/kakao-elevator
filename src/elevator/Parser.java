package elevator;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public Response parse(String jsonStr){
        Response result = null;
        JSONObject toJson =  toJsonObject(jsonStr);
        if (toJson != null)
            result = toResponse(toJson);
        return result;
    }

    public JSONObject toJsonObject(String jsonStr){
        JSONObject result = null;
        try {
            result = new JSONObject(jsonStr);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return result;
    }

    public Response toResponse(JSONObject jsonObject){
        Response response = new Response();
        response.token = jsonObject.getString("token");
        response.timestamp = jsonObject.getInt("timestamp");
        response.is_end = jsonObject.getBoolean("is_end");
        if (jsonObject.has("calls"))
            response.calls = toCalls(jsonObject.getJSONArray("calls"));
        if (jsonObject.has("elevators"))
            response.elevators = toElevators(jsonObject.getJSONArray("elevators"));
        return response;
    }

    public List<Elevator> toElevators(JSONArray array){
        List<Elevator> list = new ArrayList<>();
        for (int i=0; i<array.length(); i++){
            Elevator elevator = new Elevator();
            JSONObject obj = array.getJSONObject(i);
            elevator.id = obj.getInt("id");
            elevator.floor = obj.getInt("floor");
            elevator.passengers = toCalls(obj.getJSONArray("passengers"));
            elevator.status = obj.getString("status");
            list.add(elevator);
        }
        return list;
    }

    public List<Call> toCalls(JSONArray array){
        List<Call> list = new ArrayList<>();
        for (int i=0; i<array.length(); i++){
            JSONObject obj = array.getJSONObject(i);
            Call call = new Call();
            call.id = obj.getInt("id");
            call.timestamp = obj.getInt("timestamp");
            call.start = obj.getInt("start");
            call.end = obj.getInt("end");
            list.add(call);
        }
        return list;
    }
}
