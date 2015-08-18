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
public class MainCalcActivityFragment extends Fragment {

    public MainCalcActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_calc, container, false);
    }

    public void updateDisplay(String input) {

       //View view = getView().findViewById(R.id.textViewResults);
       //((TextView)view).setText(input);
    }
}
