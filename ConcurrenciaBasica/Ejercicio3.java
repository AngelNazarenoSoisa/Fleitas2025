public class Main {
/*	public static void main(String[] args) {
		MiThread hilo = new MiThread();
		hilo.start();
		MiTarea task = new MiTarea();
		task.run();
		new HiloContador("Uno").start();
		new HiloContador("Dos").start();
		new HiloContador("Tres").start();
		}
*/
public static void main(String[] args) throws InterruptedException {
Contador contador = new Contador();
Incrementador[] hilos = new Incrementador[5];

for (int i = 0; i < hilos.length; i++) {
hilos[i] = new Incrementador(contador);
hilos[i].start();
}

for (int i = 0; i < hilos.length; i++) {
hilos[i].join(); // Espera a que cada hilo termine }

System.out.println("Valor final del contador: " +
contador.getValor());}
}
}