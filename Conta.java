public class Conta {
  String titular;
  int numero;
  double saldo;

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
}