import java.util.ArrayList;

public class ArregloADT {
	int tamanio;
	ArrayList listaObj= new ArrayList(this.tamanio);
	
	public ArregloADT(int tamanio) {
		this.tamanio= tamanio;
			System.out.println("Arreglo con éxito, tamaño de" + tamanio);
			
			for(int i=0; i < tamanio; i++) {
				listaObj.add(null);
			}
			System.out.println(listaObj);
		
	}
	public int gettamanio() {
		return listaObj.size();
	}
	
	public void setElemento(int ind, Object item) {
		listaObj.set(ind, item);
	}
	
	
	public void getelemento(int ind) {
		listaObj.get(ind);
	}
	
	public void limpiar() {
		for(int i=0; i< tamanio; i++) {
			listaObj.set(i, null);
		}
	}
	public String toString() {
		return listaObj.toString();
	}
}
