public class SmartTv {
    boolean energia = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        energia = true;
    }

    public void desligar() {
        energia = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
