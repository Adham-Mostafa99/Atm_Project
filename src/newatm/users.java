package newatm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class users  {

    protected final int NUM_USERS = 10;
    protected String[] Name = new String[NUM_USERS];
    protected int[] Password = new int[NUM_USERS];
    protected int[] Money = new int[NUM_USERS];

    //read names
    public void Read_Names() throws FileNotFoundException, IOException {
        File name = new File("Names.txt");
        Scanner in_name = new Scanner(name);

        for (int i = 0; i < NUM_USERS; i++) {
            Name[i] = in_name.next();
        }
    }

    //read passwords
    public void Read_Passwords() throws FileNotFoundException, IOException {
        File password = new File("Passwords.txt");
        Scanner in_pass = new Scanner(password);

        for (int i = 0; i < NUM_USERS; i++) {
            Password[i] = in_pass.nextInt();
        }
    }

    //read moneys
    public void Read_Moneys() throws FileNotFoundException, IOException {
        File money = new File("Money.txt");
        Scanner in_Money = new Scanner(money);

        for (int i = 0; i < NUM_USERS; i++) {
            Money[i] = in_Money.nextInt();
        }
    }

}
