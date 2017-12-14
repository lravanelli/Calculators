package com.example.logonrm.calculators.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.logonrm.calculators.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IMCfragment extends Fragment {


    public IMCfragment() {
        // Required empty public constructor
    }


    private EditText etAltura;
    private TextView tvIMC;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_imcfragment, container, false);
        etAltura = (EditText)v.findViewById(R.id.etAltura);
        tvIMC = (TextView)v.findViewById(R.id.tvIMC);

        Button bt = (Button)v.findViewById(R.id.btCalcular);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tvIMC.setText("Seu IMC é: Fudido");
            }
        });

        return v;
    }



}
