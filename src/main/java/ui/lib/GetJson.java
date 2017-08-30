package UI.lib;


import adapter.core;
import com.jayway.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;



public class GetJson implements core {

    public Response getRequest()
    {
        Response resp = get("https://jsonplaceholder.typicode.com/posts");

        return resp;

    }

    public void postRequest()
    {

    }

    public Map<Integer,Object> retrieveRecords()
    {
         Response resp = getRequest();
         ArrayList<Map<String,Object>> json=  resp.path("");
         Map<Integer,Object>  records = new HashMap<Integer,Object>();

        int n = 89, t1 = 1, t2 = 1;

        while (t2 <= n)
        {
            System.out.print(t2 + " + ");
            records.put(t2,json.get(t2));
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        }

        return records;
    }


}
