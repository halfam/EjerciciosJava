package com.example.ejercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Programacion {
    static Long PROGRAMACION[]={6L, 10L, 12L, 15L, 17L, 20L, 22L, 24L };
    static String TIPO[] = {"NOTICIAS", "MAGAZINE", "MUSICA", "NOTICIAS",
            "MAGAZINE", "NOTICIAS", "MAGAZINE", "MUSICA"};
    private long horaInicio;
    private long horaFinal;
    private String tipoPrograma;

    public Programacion(long horaInicio, long horaFinal, String tipoPrograma) {
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.tipoPrograma = tipoPrograma;
    }

    public long getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(long horaInicio) {
        this.horaInicio = horaInicio;
    }

    public long getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(long horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getTipoPrograma() {
        return tipoPrograma;
    }

    public void setTipoPrograma(String tipoPrograma) {
        this.tipoPrograma = tipoPrograma;
    }

    @Override
    public String toString() {
        return "Programacion{" +
                "horaInicio=" + horaInicio +
                ", horaFinal=" + horaFinal +
                ", tipoPrograma='" + tipoPrograma + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Programacion> constantes = new ArrayList<>();
        Set<String> tipos = new HashSet<>();

        int j;
        for (int i = 0; i < 8; i++) {
            j=i+1;
            if (i==7)
                j=0;
            constantes.add(new Programacion(PROGRAMACION[i],PROGRAMACION[j],TIPO[i] ));
            tipos.add(TIPO[i]);
        }
        System.out.println(tipos.toString());
        System.out.println(constantes.size());
        System.out.println(constantes);
        Map<String, Integer> cantidadTipos = new HashMap<>();
        for (Programacion prog: constantes) {
            try {
                cantidadTipos.put(prog.getTipoPrograma(), cantidadTipos.get(prog.getTipoPrograma()).intValue() + 1);
            }catch (Exception e ){
                cantidadTipos.put(prog.getTipoPrograma(),1);
            }
        }
        System.out.println(cantidadTipos);
        Map<String, Long> cantidadHoras = new HashMap<>();
        for (Programacion prog: constantes) {
            try {
                cantidadHoras.put(prog.getTipoPrograma(), cantidadHoras.get(prog.getTipoPrograma()).longValue() + Math.abs(prog.getHoraInicio() - prog.getHoraFinal()));
            }catch (Exception e ){
                cantidadHoras.put(prog.getTipoPrograma(),Math.abs(prog.getHoraInicio() - prog.getHoraFinal()));
            }
        }
        Programacion mayor = constantes.get(0);
        for (int i = 1; i < constantes.size() ; i++) {
            if (cantidadHoras.get(constantes.get(i).getTipoPrograma()) > cantidadHoras.get(mayor.getTipoPrograma())){
                mayor = constantes.get(i);
            }
        }
        System.out.println(mayor);
    }


}
