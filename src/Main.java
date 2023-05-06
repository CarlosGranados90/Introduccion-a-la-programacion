public class Main {

    public static void main(String[] args) {
        Auto miAuto = new Auto();
        miAuto.AgregarPuerta();
        miAuto.AgregarPuerta();
        miAuto.AgregarPuerta();
        miAuto.AgregarPuerta();
        System.out.println("Las puertas de mi coche son:" + miAuto.puertas);
    }
}

class Auto {
    public int puertas = 0;
    public void AgregarPuerta() {
        this.puertas ++;
    }
}