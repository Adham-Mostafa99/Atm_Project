package newatm;


public class getmoney extends showing {

    protected boolean Check = false;
    protected char Re_Request;
    protected int Re_value;

    public void Check_money() {
        while (!Check) {
            if (Re_value > Money[Number_User]) {
                Check = false;
                break;

            } else {
                Check = true;
            }
        }
    }

}
