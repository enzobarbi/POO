package ads.poo;

public class Carro {
    private String cor;
    private String modelo;
    private Motor motor;

    public Carro(String cor, String modelo, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    

}
