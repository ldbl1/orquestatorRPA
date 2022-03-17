package lorodo.utils;
/**
 * 
 * @author Lorodo
 *
 */
public class GenericAgent {
	
	String serverIp;
	int port;
	private static String MSG_ERROR = "The agent could not be initialized";
	private static String MSG_STOP = "The ageng will close";
	private static String MSG_START = "The agent is starting";
	private static String MSG_RESTART = "The agent will restart in 5 seconds";
	private static String MSG_FATAL_ERROR = "The agent could not be initialized. Mind the start parameters";
	
	private void start(int port, String serverIp) throws InterruptedException {
		System.out.println(MSG_START);
		listening(); //test
	}
	
	private void stop() {
		System.out.println(MSG_STOP);
	}
	
	private void restart() throws InterruptedException {
		System.out.println(MSG_RESTART);
		Thread.sleep(5000);
		stop();
		start(port,serverIp);
	}
	
	@SuppressWarnings("unused")
	private void listening() throws InterruptedException {
		while (true) { //me mantengo a la escucha
			if (false) { // TODO modificar este false por "si recibo un paquete"
				System.out.println("escribo resultado de paquete recibido");
				restart();
			}
		}
	}

	public void main(String[] args) {
		if (args.length > 0 && args.length < 2) {
			this.serverIp =args[0];
			this.port = Integer.valueOf(args[1]);
			try {
				start(port,serverIp);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(MSG_FATAL_ERROR);
			}
			
		} else {
			System.out.println(MSG_ERROR);
		}
	}

}
