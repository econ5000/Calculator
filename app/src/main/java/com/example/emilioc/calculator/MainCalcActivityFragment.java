package com.example.emilioc.calculator;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainCalcActivityFragment extends Fragment implements ICalcActivityView {




    public MainCalcActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_calc, container, false);
    }



    @Override
    public void setDisplay(String value) {

            @SuppressWarnings("ConstantConditions") View view = getView().findViewById(R.id.textViewResults);
            if (view != null) {
                ((TextView) view).setText(value);
            }
    }
}
