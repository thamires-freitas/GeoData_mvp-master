package br.usjt.desmob.geodata.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.usjt.desmob.geodata.R;


/**
 * Created by Thamires freitas 06/12/2017
 */
public class DetalhePaisFragment extends Fragment {


    public DetalhePaisFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_detalhe_pais, container, false);
    }

}
