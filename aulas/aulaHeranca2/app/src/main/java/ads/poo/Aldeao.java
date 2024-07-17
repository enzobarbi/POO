package ads.poo;

public class Aldeao extends Pessoa {
    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String coletaRecurso(String ferramenta, String recurso){
        return "Aldeão está coletando " + recurso + " com a/o " + ferramenta;
    }
    @Override
    public String mover() {
        return "Aldeão " + super.mover();
    }

    @Override
    public String atacar() {
        return "Aldeão" + super.atacar();
    }


}
