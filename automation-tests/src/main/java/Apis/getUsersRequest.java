package Apis;

import ApiBase.prerequisite;
import Data.URLs;
import Data.requestFixedData;
import io.restassured.response.Response;

public class getUsersRequest extends prerequisite {
    URLs getBaseUrl = new URLs();
    String baseUrl = getBaseUrl.getZagBaseURL();
    requestFixedData data = new requestFixedData();
    public Response getUserMarket(String market_symbol){
        String endPoint = "API/Backend/GetUserMarketRequiredData.php/" + market_symbol;
        String url = baseUrl + endPoint;
        System.out.println(url);
        setRequestURL(url);
        setHeaders("Authorization",data.authentication);
        setFormParams("market_symbol", market_symbol);
        return getResponse("GET");
    }

    public Response getUserMoney(String userId){
        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getZagBaseURL();

        String endPoint = "API/Backend/UserBalancesPortfolioAPI3.php/" + userId;
        String url = baseUrl + endPoint;
        System.out.println(url);
        setRequestURL(url);
        setHeaders("Authorization",data.authentication);
        setFormParams("userId", userId);
        return getResponse("GET");
    }

    public  Response getUserMarketForSpecificCustomer(String marketSymbol, String userId){
        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getZagBaseURL();

        String endPoint = "API/Backend/GetUserMarketRequiredData.php/" + marketSymbol + userId;
        String url = baseUrl + endPoint;
        System.out.println(url);
        setRequestURL(url);
        setHeaders("Authorization", data.authentication);
        setFormParams("market_symbol", marketSymbol);
        setFormParams("userId", userId);
        return getResponse("GET");

    }
}
