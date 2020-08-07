package elevator;

import org.json.JSONArray;
import org.json.JSONObject;

public class Parser {

    public JSONObject toJsonObject(String jsonStr){
        JSONObject result = null;
        result = new JSONObject(jsonStr);
        System.out.println(result.toString());
        return result;
    }

    public JSONArray toJsonArray(String jsonStr){
        JSONArray result = null;

        return result;
    }
}
