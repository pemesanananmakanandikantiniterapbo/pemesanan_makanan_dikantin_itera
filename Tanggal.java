/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantinku;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Kris Cyber
 */
public class Tanggal {
    public static int dtk,mnt,jam,dd,mm,yyyy;
    public static String getTgl(){
        Date tgl = new Date();
        SimpleDateFormat f = new SimpleDateFormat ("yyyy-mm-dd hh:mm:ss");
        return(f.format(tgl));
    }
    
}
