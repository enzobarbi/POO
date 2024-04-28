package ads.poo;

import java.util.Random;

public class BuzzLightyear {

    //Atributos

    String[] frases = {
            "Isto não é voar. Isto é cair, com estilo!",
            "Ao infinito e além!",
            "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!",
            "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.",
            "Vamos salvar a galáxia.",
            "Comando estelar, pronto pra voar!"};

    boolean capaceteAberto = false;

    boolean asa = false;




    //Métodos

    public boolean capaceteAbertoFechado(){
        capaceteAberto = !capaceteAberto;
        return capaceteAberto;
    }

    public boolean isCapaceteAberto(){
        return capaceteAberto;
    }

    public String dispararLaser(){
        return "Disparando Lazer";
    }

    public String golpear(){
        return "Golpeando";
    }

    public boolean asaAbertaFechada(){
        if (asa == true){
            asa = false;
        }else{
            asa = true;
        }
        return asa;
    }

    public String falarFrases(){
        Random r = new Random();
        return frases[r.nextInt(6)];
    }

}
