import Apis.syncUserBalances;
import Apis.syncUserPositions;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class getSyncBalancesTests {

    @Test
    public void Validate_responseCode(){
        syncUserBalances syncPos = new syncUserBalances();
        Response response = syncPos.getSyncUserBalances("2023-11-09 00:00:00");
        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
