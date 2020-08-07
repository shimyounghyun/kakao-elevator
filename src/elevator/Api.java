package elevator;

import org.json.JSONObject;

public class Api {
    private static Api instance = new Api();
    private Api() {
        this.httpConnection = new HttpConnection();
        this.parser = new Parser();
    }

    private HttpConnection httpConnection;
    private Parser parser;

    public static Api getInstance(){
        return instance;
    }

    private String token = "";
    private final String HOST = "http://localhost:8000/";

    public JSONObject start(String user, int problem, int count){
        String uri = HOST+"start/"+user+"/"+problem+"/"+count;
        return parser.toJsonObject(httpConnection.con(uri, "POST"));
    }

    public JSONObject oncalls(String token){
        String uri = HOST+"oncalls";
        return parser.toJsonObject(httpConnection.con(uri, "GET", token));
    }

//    public JSONObject action(String token, String command){
//        String uri = HOST+"action";
//        return parser.toJsonObject(httpConnection.con(uri, "POST", token, command));
//    }

    public void action(String token, String command){
        String uri = HOST+"action";
        System.out.println(
                httpConnection.con(uri, "POST", token, command)
        );
    }
}
