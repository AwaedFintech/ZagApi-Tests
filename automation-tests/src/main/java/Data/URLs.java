package Data;

public class URLs {
    public String getapi6URL(){
        return api6BAseURL;
    }
    public String getZagBaseURL(){
        return  zag_UAT_BaseURL;
    }

    public String getInvMSURL(){
        return stockloginMSBaseURL;
    }
    String api6BAseURL = "https://api6gw-test.awaed.co";
    String stockBaseUrl = "https://stock-test.awaed.co/";
    String stockloginMSBaseURL= "https://api-test.awaed.co/api/investor/v1";

    String zag_UAT_BaseURL = "http://uat-zag.awaed.co/";

    public String getInvUrl2(){
        return stockBaseUrl;
    }
}
