package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo inicial da primeira conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Somando 100 reais a primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
			
		} else {
			System.out.println("contas diferentes!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		

	}

}
