package rmutsb.mook.chatchon.makingfavorcoffee.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rmutsb.mook.chatchon.makingfavorcoffee.R;

/**
 * Created by Acer on 4/1/2561.
 */

public class ShowOrderFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_order, container, false);
        return view;
    }
}
