package elevator;

import org.json.JSONObject;

import java.util.*;

public class Simulator {
    public String token;
    public Api api;
    public Map<Integer, Elevator> elevators;
    public List<Call> calls;

    public Simulator(int problem, String id){
        init(problem, id);
    }

    public void init(int problem, String id){
        this.api = Api.getInstance();
        this.elevators = new HashMap<>();
        this.calls = new LinkedList<>();

//        JSONObject obj = api.start(id, problem, 4);
//        this.token = obj.get("token").toString();


    }

    public void start(){

    }


}
