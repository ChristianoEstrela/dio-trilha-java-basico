public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? " + smartTv.energia);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> A Tv está ligada? " + smartTv.energia);

        smartTv.desligar();
        System.out.println("Novo status -> A Tv está ligada? " + smartTv.energia);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("O Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("O Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(47);
        System.out.println("O Canal Atual: " + smartTv.canal);

    }
}
