package T1IntroJava.Exercicios;

public class ExFixacao {
    static void main(String[] args) {
        String product1 = "Pencil";
        String product2 = "Table";

        int age = 20;
        int code = 1234;
        char gender = 'F';

        double price1 = 5.5;
        double price2 = 549.9;
        double measure = 71.789389;

        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f\n", product1, price1);
        System.out.printf("%s, which price is $%.2f\n", product2, price2);
        System.out.println(" ");
        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n");
        System.out.printf("Measure with seven decimal places: %.7f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
    }
}
