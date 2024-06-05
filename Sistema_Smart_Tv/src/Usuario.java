public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Volume atual " + smartTv.volume);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("TV ligada ? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println(" Novo status da TV  ? " + smartTv.ligada);
        smartTv.desligar(); 
        System.out.println(" Novo status da TV  ? " + smartTv.ligada);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual " + smartTv.volume);

        
        System.out.println("Canal atual " + smartTv.canal);
        smartTv.mudarDeCanal(22);
        System.out.println("Canal atual " + smartTv.canal);







    }
}
