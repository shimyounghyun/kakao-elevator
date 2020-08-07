package elevator;

import java.util.*;

public class Simulator {
    public String token;
    public Api api;
    public List<Elevator> elevators;
    public List<Call> calls;
    public Response response;

    public Simulator(int problem, String id, int count){
        init(problem, id, count);
    }

    public void init(int problem, String id, int count){
        this.api = Api.getInstance();

        this.response = api.start(id, problem, count);
        this.elevators = response.elevators;
        this.calls = response.calls;
        this.token = response.token;
    }

    public void start(){
        System.out.println("### 시작 정보 : "+ response.toString());
        while (response.is_end == false){
            elevators.get(0);
        }
    }


}
