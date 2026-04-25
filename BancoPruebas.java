import java.util.concurrent.Semaphore;
import java.util.Random;

class Pista {
    private int id;
    private Semaphore semaforo;

    public Pista(int id) {
        this.id = id;
        this.semaforo = new Semaphore(1); // solo 1 vehículo a la vez
    }

    public void usarPista(int vehiculoId) {
        try {
            semaforo.acquire(); // entra a la pista

            System.out.println("Vehículo " + vehiculoId + " entrando en la pista " + id);

            Random rand = new Random();
            int tiempo = rand.nextInt(3) + 3; // entre 3 y 5 segundos

            Thread.sleep(tiempo * 1000);

            System.out.println("Vehículo " + vehiculoId + 
                " completó la prueba en la pista " + id + 
                " en " + tiempo + " segundos.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaforo.release(); // libera la pista
        }
    }
}

class Vehiculo extends Thread {
    private int id;
    private Pista pista;

    public Vehiculo(int id, Pista pista) {
        this.id = id;
        this.pista = pista;
    }

    @Override
    public void run() {
        pista.usarPista(id);
    }
}

public class BancoPruebas {
    public static void main(String[] args) {

        Pista pista1 = new Pista(1);
        Pista pista2 = new Pista(2);
        Pista pista3 = new Pista(3);

        Vehiculo v1 = new Vehiculo(1, pista1);
        Vehiculo v2 = new Vehiculo(2, pista2);
        Vehiculo v3 = new Vehiculo(3, pista3);

        v1.start();
        v2.start();
        v3.start();
        try {
            v1.join();
            v2.join();
            v3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas las pruebas finalizaron.");
    }
}