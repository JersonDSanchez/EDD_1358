
public class arranque {

	public static void main(String[] args) {
ArregloADT arregloADT = new ArregloADT(5);
		
		System.out.println("Arreglo con éxitp");
		System.out.println(arregloADT.toString());
		
		System.out.println("Tamaño de:");
		System.out.println(arregloADT.gettamanio());
		
		System.out.println("/////////////////////////////////////////////////////////");
		arregloADT.setElemento(0, "0");
		arregloADT.setElemento(1, "1");
		arregloADT.setElemento(2, "2");
		arregloADT.setElemento(3, "3");
		arregloADT.setElemento(4, "4");
		System.out.println(arregloADT.toString());
		arregloADT.limpiar();
		System.out.println("/////////////////////////////////////////////////////////");
	}

}
