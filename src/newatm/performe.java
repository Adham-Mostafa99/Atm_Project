/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newatm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author el FaYroOoz
 */
public class performe extends getmoney {

    public boolean ok = true;
      public int Machine_Money() throws FileNotFoundException, IOException {
        File read = new File("Machine.txt");
        Scanner in_Machine = new Scanner(read);
        return in_Machine.nextInt();
    }

    //take money from machine
    public void Machine_New_Money(int old_money) throws FileNotFoundException, IOException {
        PrintWriter write = new PrintWriter("Machine.txt");
        write.println(old_money - Re_value);
        write.close();
    }

    //take money from user
    public void Take_money(int money) throws FileNotFoundException, IOException {
        if (money > Machine_Money()) {
            ok = false;
        } else {
            ok = true;
            Money[Number_User] = Money[Number_User] - money;

        }
    }

    //write file with new money
    public void Write_Money_File() throws FileNotFoundException, IOException {

        PrintWriter write = new PrintWriter("Money.txt");
        for (int i = 0; i < NUM_USERS; i++) {
            write.println(Money[i]);

        }
        write.close();
    }
}
