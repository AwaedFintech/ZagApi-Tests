package Apis;

import ApiBase.prerequisite;
import Data.URLs;
import Data.requestFixedData;
import io.restassured.response.Response;

public class getOrderList extends prerequisite {

    URLs getBaseUrl = new URLs();
    String baseUrl = getBaseUrl.getZagBaseURL();
    requestFixedData data = new requestFixedData();
    public Response getOrders(String timeStamp, String limitNumber) {


        String endPoint = "API/Backend/OrdersListAPI3.php/" + timeStamp ;
        String url = baseUrl + endPoint;
        System.out.println(url);
        setRequestURL(url);
        setHeaders("Authorization", data.authentication);
        setFormParams("order_by","0");
        setFormParams("limit",limitNumber);
        setFormParams("tstamp", timeStamp);
        return getResponse("GET");
    }
}
