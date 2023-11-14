package Apis;

import ApiBase.prerequisite;
import Data.URLs;
import Data.requestFixedData;
import io.restassured.response.Response;

public class SyncAllTransactions extends prerequisite {

    URLs getBaseUrl = new URLs();
    String baseUrl = getBaseUrl.getZagBaseURL();
    requestFixedData data = new requestFixedData();
    public Response getSyncAllTransactions(String timeStamp) {

        String endPoint = "API/Backend/GetAllTransactions.php/" + timeStamp ;
        String url = baseUrl + endPoint;
        System.out.println(url);
        setRequestURL(url);
        setHeaders("Authorization", data.authentication);
        setFormParams("t_stamp", timeStamp);
        return getResponse("GET");
    }
}
