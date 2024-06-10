package estruturasexcepicionais;

public class EstruturaExcecao {
    static String usuario = "thomaz"; // Deve ser estático para ser acessado no método static main

    public static void main(String[] args) {
        try {Number valor = Double.valueOf("a1.75");
        System.out.println(valor);
            
        } catch (NumberFormatException e) {
            System.out.println("A exceção foi: " +  e.getMessage());
        }
        
    }
}
