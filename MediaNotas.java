public class MediaNotas {

    public static double calculaMedia(double nota1, double nota2, double nota3) {
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
            throw new IllegalArgumentException("Notas devem estar entre 0 e 10.");
        }
        return (nota1 + nota2 + nota3) / 3;
    }
}