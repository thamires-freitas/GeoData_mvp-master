package br.usjt.desmob.geodata;

import android.content.Context;

/**
 * Created by Thamires freitas 06/12/2017
 */

public class Contexto {
    private static Context contexto;

    public static Context getValue(){
        return contexto;
    }

    public static void setValue(Context c){
        contexto = c;
    }
}
