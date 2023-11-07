package Apis;

import ApiBase.prerequisite;
import Data.URLs;
import Data.requestFixedData;
import io.restassured.response.Response;

public class getMarketSecurityType extends prerequisite{
    URLs getBaseUrl = new URLs();
    String baseUrl = getBaseUrl.getZagBaseURL();
    requestFixedData data = new requestFixedData();
    public Response getMarketSecurityRequest(String market_symbol){
        String endPoint = "API/Backend/MarketSecurityTypes.php/" + market_symbol;
        String url = baseUrl + endPoint;
        System.out.println(url);
        setRequestURL(url);
        setHeaders("Authorization",data.authentication);
        setFormParams("market_symbol", market_symbol);
        return getResponse("GET");
    }
}
