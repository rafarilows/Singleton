package fila;

public class Fila {

	private static Fila instancia = null;

	private Fila() {
	}

	public static Fila getInstance() {
		if (instancia == null) {
			instancia = new Fila();
		}
		return instancia;
	}

	public void imprimeDocumento() {
	}

	public void removeDocumento() {
	}

	public void removeTodosDocumentos() {
	}

}
