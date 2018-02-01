package rmutsb.mook.chatchon.makingfavorcoffee.ultility;

/**
 * Created by Nut on 30/10/2560.
 */

public class MyConstant {

    private String urlPostUserString = "http://androidthai.in.th/nut/addUserNut.php";
    private String urlGetUserString = "http://androidthai.in.th/nut/getAllDataNut.php";

    private String[] columUserStrings = new String[]{"user_id", "user_Name", "user_Surname", "user_Phone", "user_Email", "user_Password"};

    public String[] getColumUserStrings() {
        return columUserStrings;
    }

    public String getUrlGetUserString() {
        return urlGetUserString;
    }

    public String getUrlPostUserString() {
        return urlPostUserString;
    }
}
