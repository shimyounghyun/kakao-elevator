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

    public Response start(String user, int problem, int count){
        String uri = HOST+"start/"+user+"/"+problem+"/"+count;
        return parser.parse(httpConnection.con(uri, "POST"));
    }

    public Response oncalls(String token){
        String uri = HOST+"oncalls";
        return parser.parse(httpConnection.con(uri, "GET", token));
    }

    // start한 count와 command 엘레베이터 개수가 일치해야한다.
    public Response action(String token, String command){
        String uri = HOST+"action";
        return parser.parse(httpConnection.con(uri, "POST", token, command));
    }
}
