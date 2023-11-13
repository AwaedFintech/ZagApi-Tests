import Apis.getUsersRequest;
import Apis.syncUserPositions;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class getSyncPositionsTests {

    @Test
    public void Validate_responseCode(){
        syncUserPositions syncPos = new syncUserPositions();
        Response response = syncPos.getSyncUserPositions("2023-11-09 00:00:00","1");
        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
