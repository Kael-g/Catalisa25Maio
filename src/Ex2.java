import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
//    Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//    Álcool:
//    até 20 litros, desconto de 3% por litro
//    acima de 20 litros, desconto de 5% por litro
//    Gasolina:
//    até 20 litros, desconto de 4% por litro
//    acima de 20 litros, desconto de 6% por litro
//    Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
//    (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
//    sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");

        System.out.print("Quantos litros foram vendidos? ");
        double litros;
        for (litros = input.nextDouble(); litros < 0; litros = input.nextDouble()){
            System.out.print("A quantidade não pode ser negativa, insira um valor válido: ");
        }

        System.out.print("Qual o tipo de combustível? Digite A para álcool e G para gasolina: ");
        String tipo;
        for (tipo = input.next(); !tipo.equalsIgnoreCase("A") && !tipo.equalsIgnoreCase("G"); tipo = input.next()){
            System.out.print("Opção inválida, digite A para álcool ou G para gasolina :");
        }

        double valor_com_desconto = 0;
        String desconto = "";
        String tipo_escolhido = "";

        switch (tipo){
            case "A":
            case "a":
                tipo_escolhido = "álcool";
                if (litros > 20){
                    valor_com_desconto = (litros * 1.9) * 0.95;
                    desconto = "5%";
                } else {
                    valor_com_desconto = (litros * 1.9) * 0.97;
                    desconto = "3%";
                }
                break;
            case "G":
            case "g":
                tipo_escolhido = "gasolina";
                if (litros > 20){
                    valor_com_desconto = (litros * 2.5) * 0.94;
                    desconto = "6%";
                } else {
                    valor_com_desconto = (litros * 2.5) * 0.96;
                    desconto = "4%";
                }
                break;
            default:
                System.out.print("Opção inválida, mas não vai cair aqui nunca porque foi feita a verificação lá em cima :)");
        }

        System.out.printf("\n\nR$ %,.2f por %s litros de %s (desconto de %s aplicado).",valor_com_desconto,df.format(litros),tipo_escolhido,desconto);
    }
}
