package adapter;

import com.jayway.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public interface core {

    public Response getRequest();
    public void postRequest();
    public Map<Integer,Object> retrieveRecords();
}
