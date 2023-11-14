import Apis.getOrderList;
import Apis.syncUserBalances;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class getOrderListTests {

    @Test
    public void Validate_responseCode(){
        getOrderList orders = new getOrderList();
        Response response = orders.getOrders("2023-07-04","500");
        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
