package com.example.ejercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Rayo {
    static long TIEMPO[] = {2L, 4L, 5L, 6L, 9L, 12L, 14L, 16L};
    static String CIUDAD[] = {"Gandia", "Oliva", "Ibi", "Gandia", "Ibi", "Oliva", "Ibi", "Ibi"};
    static int INTENSIDAD[] = {1, 2, 2, 1, 2, 3, 1, 2};

    private long tiempo;
    private String ciudad;
    private int intensidad;


    public Rayo(long tiempo, String ciudad, int intensidad) {
        this.tiempo = tiempo;
        this.ciudad = ciudad;
        this.intensidad = intensidad;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public static void main(String[] args) {
        List<Rayo> caidas = new ArrayList<Rayo>();
        for (int i = 0; i < 8; i++) {
            caidas.add(new Rayo(Rayo.TIEMPO[i], Rayo.CIUDAD[i], Rayo.INTENSIDAD[i]));
        }
        Set<String> ciudades = new HashSet<String>();
        for (Rayo caida : caidas) {
            ciudades.add(caida.getCiudad());
        }
        System.out.println(ciudades);

        Map<String,Long> periodos = periodos(caidas);
        System.out.println(periodos);
    }


    public static Map<String, Long> periodos (List<Rayo> caidas){
        Map<String, Long> periodos = new HashMap<>();
        periodos.put("Ibi",(long)0);
        periodos.put("Gandia",(long)0);
        periodos.put("Oliva",(long)0);
        int contadorIbi = 0;
        int contadorGandia = 0;
        int contadorOliva = 0;
        for (Rayo caida : caidas) {
            switch (caida.getCiudad()){
                case "Ibi":
                    periodos.put("Ibi", periodos.get("Ibi") + caida.getTiempo());
                    contadorIbi++;
                    break;
                case "Gandia":
                    periodos.put("Gandia", periodos.get("Gandia") + caida.getTiempo());
                    contadorGandia++;
                    break;
                case "Oliva":
                    periodos.put("Oliva", periodos.get("Oliva") + caida.getTiempo());
                    contadorOliva++;
                    break;
            }
        }
        periodos.put("Ibi",periodos.get("Ibi")/contadorIbi);
        periodos.put("Gandia",periodos.get("Gandia")/contadorGandia);
        periodos.put("Oliva",periodos.get("Oliva")/contadorOliva);
        return periodos;
    }
}
