package Apis;

import ApiBase.prerequisite;
import Data.URLs;
import Data.requestFixedData;
import io.restassured.response.Response;

public class syncUserBalances extends prerequisite {


    URLs getBaseUrl = new URLs();
    String baseUrl = getBaseUrl.getZagBaseURL();
    requestFixedData data = new requestFixedData();
    public Response getSyncUserBalances(String timeStamp) {

        String endPoint = "API/Backend/SyncUserBalances.php/" + timeStamp ;
        String url = baseUrl + endPoint;
        System.out.println(url);
        setRequestURL(url);
        setHeaders("Authorization", data.authentication);
        setFormParams("t_stamp", timeStamp);
        return getResponse("GET");
    }
}
