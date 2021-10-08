package com.example.ejercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sesiones {
    static long FECHA[]={1289001000000L , 1289002000000L , 1289004000000L ,
            1289006000000L , 1289007000000L, 1289008000000L , 128900900000L , 1289011000000L ,
            1289013000000L , 1289016000000L};
    static String USUARIO[] = {"carchimp", "tudela", "arcano", "totencar",
            "ramporo", "tudela", "arcano", "carchimp", "tudela", "totencar"};

    public static void main(String[] args) {
        List <Login> sesiones = new ArrayList<>();
        Login arcano = new Login(0L,"");
        Login tudela = new Login(0L,"");
//        Login tudela;
        for (int i = 0; i < 10; i++) {
            if (USUARIO[i] =="arcano" )
                arcano = new Login(FECHA[i],USUARIO[i] );
            if (USUARIO[i] == "tudela")
                tudela = new Login(FECHA[i],USUARIO[i] );
            sesiones.add(new Login(FECHA[i], USUARIO[i]));
        }
        System.out.println(arcano.logLater(tudela));
        int contCarchimp=0,contTudela=0,contArcano=0,contTotencar =0,contRamporo = 0;
        long tActual = 1289025000000L;
        Map<String, Long> mapa = new HashMap<>();
        long arc = 0;
        for (Login sesion :sesiones) {
//            switch (sesion.getNombre()){
//                case "arcano":
//                    try{
//                        mapa.put("arcano", mapa.get("arcano").longValue() + sesion.getFechaConexion());
//                    }catch (Exception e){
//                        mapa.put("arcano", sesion.getFechaConexion());
//                    }
//                    contArcano++;
//                    break;
//                case "tudela":
//                    try{
//                        mapa.put("tudela", mapa.get("tudela").longValue()+ sesion.getFechaConexion());
//                    }catch (Exception e){
//                        mapa.put("tudela",  sesion.getFechaConexion());
//                    }
//                    contTudela++;
//                    break;
//                case "carchimp":
//                    try{
//                        mapa.put("carchimp", mapa.get("carchimp").longValue()+ sesion.getFechaConexion());
//                    }catch (Exception e){
//                        mapa.put("carchimp", sesion.getFechaConexion());
//                    }
//                    contCarchimp++;
//                    break;
//                case "totencar":
//                    try{
//                        mapa.put("totencar", mapa.get("totencar").longValue()+ sesion.getFechaConexion());
//                    }catch (Exception e){
//                        mapa.put("totencar",  sesion.getFechaConexion());
//                    }
//                    contTotencar++;
//                    break;
//            }
        }
        mapa.put("totencar", mapa.get("totencar").longValue()/contTotencar);
        mapa.put("arcano", mapa.get("arcano").longValue()/contArcano);
        mapa.put("tudela", mapa.get("tudela").longValue()/contTudela);
        mapa.put("carchimp", mapa.get("carchimp").longValue()/contCarchimp);

        System.out.println(mapa);

    }
}
