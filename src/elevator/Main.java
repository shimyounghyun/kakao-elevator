package elevator;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Api api = Api.getInstance();
        JSONObject a = api.start("tester",0,1);
        api.oncalls(a.get("token").toString());

        Command command1 = new Command();
        command1.elevator_id = 0;
        command1.command = "UP";
//        command1.call_ids.add(0);
//        command1.call_ids.add(1);

//        Command command2 = new Command();
//        command2.elevator_id = 1;
//        command2.command = "STOP";

        ArrayList<JSONObject> list = new ArrayList<>();
        list.add(command1.toJsonObject());
//        list.add(command2.toJsonObject());

        JSONObject commands = new JSONObject();
        commands.put("commands",list);
        System.out.println(a.get("token").toString()+" "+commands.toString());
        api.action(a.get("token").toString(), commands.toString());
    }
}
