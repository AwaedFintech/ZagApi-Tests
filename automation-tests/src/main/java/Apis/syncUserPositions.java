package Apis;

import ApiBase.prerequisite;
import Data.URLs;
import Data.requestFixedData;
import io.restassured.response.Response;

public class syncUserPositions extends prerequisite {
    URLs getBaseUrl = new URLs();
    String baseUrl = getBaseUrl.getZagBaseURL();
    requestFixedData data = new requestFixedData();
    public Response getSyncUserPositions(String timeStamp,String userPosition) {

        String endPoint = "API/Backend/SyncUserPositions.php/" + timeStamp + userPosition;
        String url = baseUrl + endPoint;
        System.out.println(url);
        setRequestURL(url);
        setHeaders("Authorization", data.authentication);
        setFormParams("t_stamp", timeStamp);
        setFormParams("show_zero_positions", "1");
        return getResponse("GET");
    }
}
