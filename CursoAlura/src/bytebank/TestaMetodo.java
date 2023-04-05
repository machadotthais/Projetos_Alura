package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println("Saldo da conta do Paulo é: "+ contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("Depois do saque a conta do Paulo ficou com: " + contaDoPaulo.saldo);
		System.out.println("Conseguiu retirar? " + conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println("Saldo da conta da Marcela: " + contaDaMarcela.saldo);
		System.out.println("Saldo da conta do Paul depois da transferencia que a Marcela fez para ele: " + contaDoPaulo.saldo);

	}

}
