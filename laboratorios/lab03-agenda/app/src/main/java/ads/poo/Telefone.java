package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private String numero;
    private String tipo;

    public Telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    private String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
//        "tipo: pessoal, numero: 48"

        return "Tipo: " + tipo + " Numero: " + this.formata("(##) #####−####", this.numero);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }
}
