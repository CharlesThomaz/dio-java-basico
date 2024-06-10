package estruturasexcepicionais;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1234567");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException ex) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }

        
    }


    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() !=8)
            throw new CepInvalidoException();
            //simulando um cep formatado
            return "23.766-255";

    }


}
