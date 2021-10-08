package com.example.ejercicio;

import java.util.ArrayList;
import java.util.List;

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
        for (int i = 0; i < 8; i++) {
            constantes.add(new Programacion(PROGRAMACION[i],PROGRAMACION[i+1],TIPO[i] ));
        }
    }
}
