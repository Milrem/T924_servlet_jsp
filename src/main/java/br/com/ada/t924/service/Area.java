package br.com.ada.t924.service;

import br.com.ada.t924.model.Comodo;

public class Area {
    public static float areaPiso(Comodo comodo) {
        float areaTotal = comodo.getLargura() * comodo.getComprimento();
        return areaTotal;
    }

    public static int calcularPisos(Comodo comodo, float areaCaixaPiso) {
        float areaTotal = areaPiso(comodo);
        float caixas = areaTotal / areaCaixaPiso;
        float adicional = areaTotal % areaCaixaPiso;
        int total = Float.valueOf(caixas).intValue() + (adicional > 0 ? 1 : 0);
        return total;
    }

    public static float areaParede(Comodo comodo) {
        float lado1 = comodo.getAltura() * comodo.getComprimento();
        float lado2 = comodo.getAltura() * comodo.getLargura();
        return (lado1 + lado2) * 2;
    }

    public static int calcularTinta(Comodo comodo, float rendimentoLata) {
        float areaTotal = areaParede(comodo);
        float latas = areaTotal / rendimentoLata;
        float adicional = areaTotal % rendimentoLata;
        int total = Float.valueOf(latas).intValue() + (adicional > 0 ? 1 : 0);
        return total;
    }
}
