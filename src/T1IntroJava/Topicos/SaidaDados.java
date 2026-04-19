package T1IntroJava.Topicos;

public class SaidaDados {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US); // Caso pontuação nao esteja no padrão norte americano
        System.out.println("Imprimindo Strings com e sem quebra de linha:");
        System.out.print("Hello World (sem quebra de linha)");
        System.out.println("Hello World"); // Com quebra de linha
        System.out.println("Hello World"); // Com quebra de linha

        System.out.println("=================================================");
        double pi = 3.14159265;
        System.out.println("Imprimindo números decimais formatados:");
        System.out.printf("%.2f%n", pi); // %.xf => define qtd. de x números decimais
        // %n ou \n => quebra de linha

        System.out.println("=================================================");
        int soma = 5+3;
        System.out.println("Concatenando...");
        System.out.println("Resultado: " + soma + " dólares");
        System.out.printf("Resultado: %.2f centímetros\n", pi);
        String nome = "Bruno";
        int idade = 21;
        double peso = 65.761;
        System.out.printf("%s tem %d e pesa %.2fkg\n", nome, idade, peso);
        /* Marcadores
         * %d => Inteiros
         * %f => ponto flutuante
         * %s => Strings
        */
    }
}
