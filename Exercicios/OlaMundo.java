public class OlaMundo {

    public static void main(String[] args) {
        if ( args.length < 1){
        System.out.println("Passe algum argumento!");
        return;
        }

        switch (args[0]) {
            case "en":
                System.out.println("Hello World!");
                break;
            case "br":
                System.out.println("Ola Mundo!");
                break;
            case "jp":
                System.out.println("こんにちは世界");
                break;
            default:
                System.out.println("Linguagem nao encontrada!");
        }


        // if (args[0].equals("en")) {
        //     System.out.println("Hello World!");
        // }else if (args[0].equals("pt")) {
        //     System.out.println("Ola Mundo!");
        // }else{
        //     System.out.println("Digite 'en' ou 'pt'");
        // }

        

    
    }
}





