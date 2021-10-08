package com.example.ejercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lectura {
    static long FECHA[] = {1288122023000L, 1288122023000L, 1288122223000L, 1288122223000L,
            1288122223000L, 1288122623000L, 1288122623000L, 1288122623000L};
    static String HABITACION[] = {"cocina", "baño", "cocina", "baño",
            "comedor", "cocina", "baño", "comedor"};
    static int TEMPERATURA[] = {18, 19, 17, 19,
            17, 19, 22, 22};

    private String habitacion;
    private int temperatura;
    private long tiempo;

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public Lectura(String habitacion, int temperatura, long tiempo) {
        this.habitacion = habitacion;
        this.temperatura = temperatura;
        this.tiempo = tiempo;
    }

    public static Map<String,Double> temperaturaMedia(List<Lectura> lecturas) {
        Map<String,Double> medi= new HashMap<>();
        medi.put("Baño", (double) 0);
        medi.put("Cocina", (double) 0);
        medi.put("Comedor", (double) 0);
        int contadorBaño =0;
        int contadorComedor =0;
        int contadorCocina =0;
        for (Lectura lectura : lecturas) {
            switch (lectura.getHabitacion()) {
                case "baño":
                    medi.put("Baño", medi.get("Baño").doubleValue() + (double)lectura.getTemperatura());
                    contadorBaño++;
                    break;
                case "comedor":
                    medi.put("Comedor", medi.get("Comedor").doubleValue() + (double)lectura.getTemperatura());
                    contadorComedor++;
                    break;
                case "cocina":
                    medi.put("Cocina", medi.get("Cocina").doubleValue() + (double)lectura.getTemperatura());
                    contadorCocina++;
                    break;
            }
        }
        medi.put("Cocina", medi.get("Cocina").doubleValue() / contadorCocina);
        medi.put("Baño", medi.get("Baño").doubleValue() / contadorBaño);
        medi.put("Comedor", medi.get("Comedor").doubleValue() / contadorComedor);
        return medi;
    }
//    public static List<Double> temperaturaMedia(List<Lectura> lecturas) {
//        double mediaBaño = 0;
//        double mediaCocina = 0;
//        double mediaComedor = 0;
//        int contadorBaño = 0;
//        int contadorCocina = 0;
//        int contadorComedor = 0;
//
//        Map<String,Double> medi= new HashMap<>();
//        medi.put("Baño", (double) 0);
//        medi.put("Cocina", (double) 0);
//        medi.put("Comedor", (double) 0);
//
//        List<Double> media = new ArrayList<>();
//        for (Lectura lectura : lecturas) {
//            switch (lectura.getHabitacion()) {
//                case "baño":
//                    mediaBaño += lectura.getTemperatura();
//                    contadorBaño++;
//                    medi.()
//                    break;
//                case "comedor":
//                    mediaComedor += lectura.getTemperatura();
//                    contadorComedor++;
//                    break;
//                case "cocina":
//                    mediaCocina += lectura.getTemperatura();
//                    contadorCocina++;
//                    break;
//            }
//        }
//        media.add(mediaBaño / contadorBaño);
//        media.add(mediaCocina / contadorCocina);
//        media.add(mediaComedor / contadorComedor);
//        return media;
//    }
//

    public static void main(String[] args) {
        List<Lectura> lecturas = new ArrayList<Lectura>();
        double total, contador;
        for (int i = 0; i < 8; i++) {
            lecturas.add(new Lectura(Lectura.HABITACION[i], Lectura.TEMPERATURA[i], Lectura.FECHA[i]));
        }
        Set<String> habitaciones = new HashSet<String>();
        for (Lectura lectura :
                lecturas) {
            habitaciones.add(lectura.getHabitacion());
        }

        for (String habitacion : habitaciones) {
            total = 0;
            contador = 0;
            for (Lectura lectura : lecturas) {
                if (lectura.getHabitacion().equals(habitacion)){
                    total += lectura.getTemperatura();
                    contador++;
                }
            }
            System.out.println("Media 1 " + habitacion + " = " + total/contador);
        }

        System.out.println(habitaciones);
        Map<String, Double> medias = temperaturaMedia(lecturas);
        System.out.println("media 1 baño = " + medias.get("Baño").doubleValue());
        System.out.println("media 1 cocina = " + medias.get("Cocina").doubleValue());
        System.out.println("media 1 comedor = " + medias.get("Comedor").doubleValue());
    }
}
