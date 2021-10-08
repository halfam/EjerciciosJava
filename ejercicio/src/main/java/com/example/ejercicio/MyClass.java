package com.example.ejercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.example.ejercicio.Punto;

public class MyClass {
    public static void main(String[] args) {
//        Unidades uni = new Unidades();
//        Set<Integer> unidades = new HashSet<>();
//        for (int numero : uni.getNUMEROS()) {
//            unidades.add(numero%10);
//        }
//        System.out.println(unidades.toString());
//        System.out.print("[");
//        for (int unidad: unidades) {
//            System.out.print(unidad + ", ");
//        }
//        System.out.println("]");

        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(new Punto(1,4));
        puntos.add(new Punto(4,3));
        puntos.add(new Punto(2,0));
        puntos.add(new Punto(0,1));
        puntos.add(new Punto(1,2));
        double perimetro = calculoPerimetro(puntos);
        double ladoMedio = longitudMedia(puntos);
        System.out.println(perimetro);
        System.out.println(ladoMedio);
    }

    public static double calculoPerimetro(List<Punto> puntos){
        double suma=0;
        for (int i = 0; i <= puntos.size()-1; i++) {
            if (i < puntos.size() -1)
                suma += puntos.get(i).distancia(puntos.get(i+1));
            else
                suma += puntos.get(i).distancia(puntos.get(0));
        }

        return suma;
    }

    public static double longitudMedia(List<Punto> puntos){
        double media = 0;
        media = calculoPerimetro(puntos) / puntos.size();

        return media;
    }

}