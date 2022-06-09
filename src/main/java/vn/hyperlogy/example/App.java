package vn.hyperlogy.example;

public class App {

    private static final String ACCESS_KEY = "jfgI952WI0Gm3z8fqMOC";

    private static final String SECRET_KEY = "ee57d1b88c3307de37fd73f597be06d9";

    private static final String BANK_REF_NO = "1234567890";

    private static final String ACCOUNT_NO = "HYPERLOGY-SVM001";

    private static final String MESSAGE = "Successed";

    private static final long AMOUNT = 100000;

    private static final String STATUS = "0";

    private static final String BANK_ID = "sacombank";

    private static final String EXPECTED_SIGNATURE  = "6c6e4f8c8ea3ade8287e3be599d4b4d7ebe22d5f792589f5973641c2daa32b5e";

    public static void main(String[] args) {
        try {
            String signature = Utils.generateHmac256(getData(), SECRET_KEY.getBytes());
            System.out.println(EXPECTED_SIGNATURE.equals(signature));
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }    

    public static String getData() {
        return new StringBuilder().append("accessKey=").append(ACCESS_KEY)
            .append("&accountNo=").append(ACCOUNT_NO)
            .append("&bankRefNo=").append(BANK_REF_NO)
            .append("&bankId=").append(BANK_ID)
            .append("&amount=").append(AMOUNT)
            .append("&message=").append(MESSAGE)
            .append("&status=").append(STATUS)
            .toString();
    }
    
}
