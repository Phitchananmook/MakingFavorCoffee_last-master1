package rmutsb.mook.chatchon.makingfavorcoffee.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import rmutsb.mook.chatchon.makingfavorcoffee.R;
import rmutsb.mook.chatchon.makingfavorcoffee.ultility.GetOrderWhereIdLoginAnDateTime;
import rmutsb.mook.chatchon.makingfavorcoffee.ultility.MyConstant;

/**
 * Created by Acer on 4/1/2561.
 */

public class ShowOrderFragment extends Fragment{

    private String[] loginString;
    private String DateTimestring;

    public static ShowOrderFragment showOrderInstance(String[] loginStrings,
                                                      String DateTimestring) {

        ShowOrderFragment showOrderFragment = new ShowOrderFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("Login", loginStrings);
        bundle.putString("DateTime", DateTimestring);
        showOrderFragment.setArguments(bundle);

        return showOrderFragment;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Get Value From Argument
        getValueFromArgument();

//        Show DateTime
        showDateTime();

//        create listview
        createListview();

    }//main method

    private void createListview() {
        ListView listView = getView().findViewById(R.id.listViewOrder);
        MyConstant myConstant = new MyConstant();

        String tag = "15FebV2";

        try {

            GetOrderWhereIdLoginAnDateTime getOrderWhereIdLoginAnDateTime = new GetOrderWhereIdLoginAnDateTime(getActivity());
            getOrderWhereIdLoginAnDateTime.execute(loginString[0], DateTimestring,
                    myConstant.getUrlGetOrderrWhereIdLoginAnDataTime());

            String resultJSON = getOrderWhereIdLoginAnDateTime.get();
            Log.d(tag, "JSON ==> " + resultJSON);




        }catch (Exception e){
            e.printStackTrace();
        }


    }//create listview

    private void showDateTime() {
        TextView textView = getView().findViewById(R.id.txtDateTime);
        textView.setText(DateTimestring);

    }

    private void getValueFromArgument() {
        loginString = getArguments().getStringArray("Login");
        DateTimestring = getArguments().getString("DateTime");

        Log.d("15FebV1", "LoginString.leng" + loginString.length);
        Log.d("15FebV1", "DateTime ==> " + DateTimestring);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_order, container, false);
        return view;
    }//onCreateView



} //main class
