package ads.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo) {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;

        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);

    }

    public Horario() {
        this(0, 0, 0);
    }

    public boolean setHora(int hora) {
        if ((hora < 0) || (hora > 23)) {
            return false;
        }
        this.hora = hora;
        return true;
    }

    public boolean setMinuto(int minuto) {
        if ((minuto < 0) || (minuto > 59)) {
            return false;
        }
        this.minuto = minuto;
        return true;
    }

    public boolean setSegundo(int segundo) {
        if ((segundo < 0) || (segundo > 59)) {
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
        String [] he = {"zero", "um","dois","tres","quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze",
                "quinze", "dezeseis", "dezesete", "dezoito", "dezenove" };

        String [] mse = {"vinte", "trinta", "quarenta", "cinquenta"};

        if (numero < 20){
            return he[numero];
        } else {
            //47
            int d = numero / 10; //4
            int u = numero % 10; //7


            return mse[d-2] + " e " + he[u];
        }
    }

    public int retornarHorarioEmSegundos(){
        return segundo + minuto * 60 + hora * 60 * 60;
    }



}
