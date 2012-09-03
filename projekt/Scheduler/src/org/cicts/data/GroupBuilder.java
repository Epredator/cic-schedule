package org.cicts.data;

import com.google.gwt.user.client.Random;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: adas
 * Date: 23.07.12
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class GroupBuilder {


    protected static final String[] NAME = new String[] {
            "Tope Group" ,
            "Tope Group1" ,
            "Tope Group2" ,
            "Tope Group3" ,
            "Tope Group4" ,
            "Tope Group5" ,
    }    ;

    protected static final String[] InvoiceStatus = new String[] {
            "Payable" ,
            "Paid" ,
            "Issued" ,
            "Don't need" ,

    }    ;

    protected static final String[] GroupStatus = new String[] {
            "Closed" ,
            "Open" ,
            "Pending" ,

    }    ;

    protected static final String[] ReservationWay = new String[] {
            "Fax" ,
            "Phone" ,
            "Email" ,
            "Voice" ,

    }    ;


    /**
     * Generate random Group.
     */

    @SuppressWarnings("deprecation")
    public static ArrayList<GroupSerializable> build  (){
        ArrayList<GroupSerializable> list = new ArrayList<GroupSerializable>() ;

    for (int b = 0; b < 20; b++  ){

      GroupSerializable gs = new GroupSerializable() ;

        int nameID = Random.nextInt(NAME.length);
        gs.setGroupName(NAME [nameID])   ;


        list.add(gs);
    }

        return list;

    }


}
