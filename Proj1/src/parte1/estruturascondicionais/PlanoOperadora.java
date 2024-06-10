package parte1.estruturascondicionais;

// Modo condicional switch/case
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "T"; // M / T
//QUANDO NÃO SE UTILIZA O BREAK ELE IMPRIMIRA TODOS OS CASE,  O SELECIONADO E OS APÓS ELE.
		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}
