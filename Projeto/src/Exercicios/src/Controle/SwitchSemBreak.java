package Controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "marrom";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("sei o bassai-dai...");
            case "marrom":
                System.out.println("sei o tekki hodan");
            case "roxa":
                System.out.println("sei o heian rodan");
            case "verde":
                System.out.println("sei o heian yodan");
            case "laranja":
                System.out.println("sei o heian sandan");
            case "vermelha":
                System.out.println("sei o heian nidan");
            case "amarela":
                System.out.println("sei o heian shodan");
                break;
            default:
            System.out.println("não sei de nada");
        }
        System.out.println("Fim");


        int idade = 3;
        switch (idade) {
            case 3:
                System.out.println("Sabe Falar");
            case 2:
                System.out.println("sabe andar");
            case 1:
                System.out.println("sabe respirar");
        }
    }
}
