package newatm;

import java.io.FileNotFoundException;
import java.io.IOException;

public class security extends users {

    protected int Pass;
    protected boolean Access = false;
    public int Number_User;

    //get informations
    public void Get_Informations() throws FileNotFoundException, IOException {

        Read_Names();
        Read_Passwords();
        Read_Moneys();
    }

    //check password
    public void Check_Pass(int pass) {
        
        for (int i = 0; i < NUM_USERS; i++) {
            if (Pass == Password[i]) {
                Access = true;
                Number_User = i;
                break;
            }
        }
    }
}
