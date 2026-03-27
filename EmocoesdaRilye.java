    import java.util.Scanner;

    public class EmocoesdaRilye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

       
        System.out.print("Riley fez novas amizades (S/N): ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.print("Quantas amizades ela fez? ");
            int qtdAmizades = sc.nextInt();
            alegria += qtdAmizades * 10;
        } else {
            tristeza += 30;
        }

        System.out.print("Digite a nota da prova A1: ");
        double A1 = sc.nextDouble();

        System.out.print("Digite a nota da prova A2: ");
        double A2 = sc.nextDouble();

        System.out.print("Digite a nota da prova A3: ");
        double A3 = sc.nextDouble();

        double media = (A1 + A2 + A3) / 3;

        if (media >= 7) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        sc.nextLine(); 

        int feitos;

        do {
        System.out.print("Quantos exercícios Riley conseguiu fazer (0 a 10)? ");
        feitos = sc.nextInt();

        if (feitos < 0 || feitos > 10) {
        System.out.println("Valor inválido! Digite um número entre 0 e 10.");
        }

        } while (feitos < 0 || feitos > 10);


        alegria += feitos * 10;
        tristeza += (10 - feitos) * 10;

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        sc.close();
    }
}