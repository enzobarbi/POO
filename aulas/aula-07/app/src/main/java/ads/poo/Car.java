package ads.poo;

public class Car {

    //Attributes (private ALWAYS)

    private  double speed;
    private String type;

    //Methods

    public void speedUp(double u){

        speed+=u;
    }

    public void speedDown(double d){
        speed-=d;
    }

    public double getSpeed(){
        return speed;
    }


}
