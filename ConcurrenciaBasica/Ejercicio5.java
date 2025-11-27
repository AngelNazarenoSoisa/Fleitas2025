public class HiloContador extends Thread {
	private String nombre;

	public HiloContador(String nombre) {
	this.nombre = nombre;
	}

	@Override
	public void run() {
	for (int i = 0; i < 5; i++) {
	System.out.println("Hilo " + nombre + ": " + i); try {
	Thread.sleep(100); 
	} catch (InterruptedException e) {
	Thread.currentThread().interrupt();
				}
			}
		}
	}