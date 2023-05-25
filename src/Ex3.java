import java.util.Scanner;

public class Ex3 {
//3 - Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//            "Telefonou para a vítima?"
//            "Esteve no local do crime?"
//            "Mora perto da vítima?"
//            "Devia para a vítima?"
//            "Já trabalhou com a vítima?"
//    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
//    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
//    entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int participacao = 0;
        String resposta = "";

        System.out.print("Preciso te fazer algumas perguntas sobre o crime ocorrido com Fulano de Tal.\n");

        System.out.print("Você telefonou para a vítima? (S/N): ");
        for (resposta = input.next(); !resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"); resposta = input.next()){
            System.out.print("Opção inválida, responda apenas com S para sim ou N para não: ");
        }
        if (resposta.equalsIgnoreCase("s")){
            participacao += 1;
        }
        System.out.print("Você esteve no local do crime? (S/N): ");
        for (resposta = input.next(); !resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"); resposta = input.next()){
            System.out.print("Opção inválida, responda apenas com S para sim ou N para não: ");
        }
        if (resposta.equalsIgnoreCase("s")){
            participacao += 1;
        }
        System.out.print("Você mora perto da vítima? (S/N): ");
        for (resposta = input.next(); !resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"); resposta = input.next()){
            System.out.print("Opção inválida, responda apenas com S para sim ou N para não: ");
        }
        if (resposta.equalsIgnoreCase("s")){
            participacao += 1;
        }
        System.out.print("Você devia para a vítima? (S/N): ");
        for (resposta = input.next(); !resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"); resposta = input.next()){
            System.out.print("Opção inválida, responda apenas com S para sim ou N para não: ");
        }
        if (resposta.equalsIgnoreCase("s")){
            participacao += 1;
        }
        System.out.print("Você já trabalhou com a vítima? (S/N): ");
        for (resposta = input.next(); !resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"); resposta = input.next()){
            System.out.print("Opção inválida, responda apenas com S para sim ou N para não: ");
        }
        if (resposta.equalsIgnoreCase("s")){
            participacao += 1;
        }

        System.out.print("\nCom base em suas respostas, ");

        switch (participacao){
            case 0:
            case 1:
                System.out.println("te consideramos inocente.");
                break;
            case 2:
                System.out.println("suspeitamos de você.");
                break;
            case 3:
            case 4:
                System.out.println("acreditamos que seja cúmplice.");
                break;
            case 5:
                System.out.println("você cometeu o crime! Tudo o que disser pode e será usado contra você no tribunal.");
            default:
                System.out.println("não temos ideia do que aconteceu aqui");
        }

    }
}
