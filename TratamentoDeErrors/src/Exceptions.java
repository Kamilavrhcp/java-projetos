
public class Exceptions {

  public static void main(String[] args) {
    String palavra = null;

    try {
      int comprimentoPalavra = palavra.length();
      System.out.println("O tamanho da palavra é de: " + comprimentoPalavra + " letras");
    } catch (Exception e) {
      System.out.println(
          "Desculpe, mas a sua palavra está '" + palavra + "', por isso não consigo rodar :(");
    }


  }

}
