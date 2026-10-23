public class Main {
  public static void main(String[] args) {
    Conta c1 = new Conta("Riquelme", 1001);

    System.out.println("1. Depositar 500 " + c1.depositar(500) + " | saldo: " + c1.getSaldo());
    System.out.println("2. Sacar 200 " + c1.sacar(200) + " | saldo: " + c1.getSaldo());
    System.out.println("3. Sacar 1000 " + c1.sacar(1000) + " | saldo: " + c1.getSaldo());
    System.out.println("4. Depostiar -50 " + c1.depositar(-50) + " | saldo: " + c1.getSaldo());
    System.out.println("5. Sacar 300 " + c1.sacar(300) +  " | saldo: " + c1.getSaldo());
  }
}    
    