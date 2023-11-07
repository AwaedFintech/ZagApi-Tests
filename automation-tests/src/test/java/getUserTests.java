import io.restassured.response.Response;
import org.testng.annotations.Test;
import Apis.getUsersRequest;

public class getUserTests {

    @Test
    public void Validate_responseCode(){
        getUsersRequest getUsersObject = new getUsersRequest();
        Response response = getUsersObject.getUserMarket("US");
        response.body().prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void Validate_GetUser_Money_Stock_ZAG(){
        getUsersRequest getUsersObject = new getUsersRequest();
        Response response = getUsersObject.getUserMoney("1");
        response.body().prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void Validate_GetMarket_Customer(){
        getUsersRequest getUsersObject = new getUsersRequest();
        Response response = getUsersObject.getUserMarketForSpecificCustomer("US","1");
        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
