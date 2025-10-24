public class CalculoMedia {
  public static void main(String[] args) {
    double nota1 = 8.0;
    double nota2 = 7.0;
    double nota3 = 9.0;

    double media = (nota1 + nota2 + nota3) / 3.0;

    System.out.println("A média final do aluno é: " + media);

    if (media >= 7.0) {
      System.out.println("Aprovado!");
    } else {
      System.out.println("Reprovado!");
    }
  }
}