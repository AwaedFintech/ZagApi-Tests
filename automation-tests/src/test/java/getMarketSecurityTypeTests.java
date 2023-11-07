import Apis.getUsersRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import Apis.getMarketSecurityType;

public class getMarketSecurityTypeTests {

    @Test
    public void Validate_responseCode(){
        getMarketSecurityType getMarketObject = new getMarketSecurityType();
        Response response = getMarketObject.getMarketSecurityRequest("US");
        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
