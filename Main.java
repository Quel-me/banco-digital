public class Main {
  public static void main(String[] args) {
    Conta c1 = new Conta("Riquelme", 1001);
    c1.depositar(1000);

    System.out.println(c1.transferir(null, 100));
    System.out.println("Saldo depois: " + c1.getSaldo());
    
  }  
}    