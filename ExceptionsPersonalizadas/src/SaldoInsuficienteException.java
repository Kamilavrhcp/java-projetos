
public class SaldoInsuficienteException extends Exception {
  private static final long serialVersionUID = 1L;

  public SaldoInsuficienteException() {
    super("Não é possível realizar sque: saldo insuficiente");
  }
}
