public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaX = new Conta();
		contaX.saldo = 100;
		contaX.deposita(50);
		System.out.println(contaX.saldo);

		boolean saqueSucesso = contaX.saca(20);
		System.out.println(contaX.saldo);
		System.out.println(saqueSucesso);

		Conta contaY = new Conta();
		contaY.deposita(1000);

		if (contaY.transfere(3000, contaX)) {
			System.out.println("transferencia realizada");
		} else {
			System.out.println("saldo insuficiente");
		}
		System.out.println(contaY.saldo);
		System.out.println(contaX.saldo);

		
		Cliente.titular = "titular 1";
		System.out.println(Cliente.titular);
	}
}