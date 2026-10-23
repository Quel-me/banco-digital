public class Conta {
  private String titular;
  private int numero;
  private double saldo;

  public Conta(String titular, int numero) {
    this.titular = titular;
    this.numero = numero;
    this.saldo = 0;
  }

  public boolean depositar(double valor) {
    if (valor <= 0) {
      return false;
    }
    saldo += valor;
    return true;
  }

  public boolean sacar(double valor) {
    if (valor <= 0 || valor > saldo) {
      return false;
    }
    saldo -= valor;
    return true;
  }

  public String getTitular() {
    return titular;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

}