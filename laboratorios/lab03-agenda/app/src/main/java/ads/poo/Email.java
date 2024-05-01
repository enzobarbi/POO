package ads.poo;

public class Email {
    private String tipo;
    private String email;

    public Email(String email, String tipo) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (email.matches(eR)) {
            this.email = email;
        }else{
            this.email = "";
        }

        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Email: " + email + " Tipo: " + tipo;
    }
}

