package org.example;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo) {
        if (hora < 0 || minuto < 0 || segundo < 0) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public Horario() {
        this(0, 0, 0);
    }

    public boolean setHora(int hora) {
        if (hora < 0) {
            return false;
        }
        this.hora = hora;
        return true;
    }

    public boolean setMinuto(int minuto) {
        if (minuto < 0) {
            return false;
        }
        this.minuto = minuto;
        return true;
    }

    public boolean setSegundo(int segundo) {
        if (segundo < 0) {
            return false;
        }
        this.segundo = segundo;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String imprimirPorExtenso() {
        String horasPorExtenso = converterNumeroParaExtenso(hora) + " horas";
        String minutosPorExtenso = converterNumeroParaExtenso(minuto) + " minutos";
        String segundosPorExtenso = converterNumeroParaExtenso(segundo) + " segundos";

        return horasPorExtenso + ", " + minutosPorExtenso + " e " + segundosPorExtenso;
    }

    private String converterNumeroParaExtenso(int numero) {
        switch (numero) {
            case 0:
                return "zero";
            case 1:
                return "um";
            case 2:
                return "dois";
            case 3:
                return "três";
            case 4:
                return "quatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "sete";
            case 8:
                return "oito";
            case 9:
                return "nove";
            default:
                return "";
        }
    }
}
