import Apis.SyncAllTransactions;
import Apis.syncUserBalances;
import Data.requestFixedData;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class syncAllTransactionsTests {
    requestFixedData data = new requestFixedData();

    @Test
    public void Validate_responseCode(){
        SyncAllTransactions syncPos = new SyncAllTransactions();
        Response response = syncPos.getSyncAllTransactions(data.timeStamp);
        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
