package ads.poo;

public class Cavaleiro extends Pessoa {
    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover() {
        return "Cavaleiro" + super.mover();
    }

    @Override
    public String atacar() {
        return "Cavaleiro" + super.atacar();
    }
}
