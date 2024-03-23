package ads.poo;

public class Ponto {
    
    //Atributos da classe
    private double x;
    private double y;

    

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distancia(Ponto p){
        double dx = (this.x - p.x);
        double dy = (this.y - p.y);

        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));

    }
    
}
