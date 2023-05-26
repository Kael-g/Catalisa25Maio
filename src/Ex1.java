import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1 {
    //1 - Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos
    // são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo)
    // e 10% para o INSS e que o FGTS corresponde a 11% do Salário Bruto,
    // mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde
    // ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor
    // da sua hora e a quantidade de horas trabalhadas no mês.
    //Desconto do IR:
    //Salário Bruto até 900 (inclusive) - isento
    //Salário Bruto até 1500 (inclusive) - desconto de 5%
    //Salário Bruto até 2500 (inclusive) - desconto de 10%
    //Salário Bruto acima de 2500 - desconto de 20%
    //Imprima na tela as informações, dispostas conforme o exemplo abaixo.
    // No exemplo o valor da hora é 5 e a quantidade de hora é 220.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat dinheiro = new DecimalFormat("0.00");
        DecimalFormat inteiros = new DecimalFormat("0.##");

        System.out.print("Digite quanto você recebe por hora trabalhada: ");
        double valor_hora;
        for(valor_hora = input.nextDouble(); valor_hora < 0.0; valor_hora = input.nextDouble()) {
            System.out.print("Valor inválido. Por favor, digite quanto você recebe por hora trabalhada: ");
        }

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double total_horas;
        for(total_horas = input.nextDouble(); total_horas < 0.0; total_horas = input.nextDouble()) {
            System.out.print("Valor inválido. Por favor, digite o número de horas trabalhadas no mês: ");
        }

        double salario_bruto = valor_hora * total_horas;
        double imposto_de_renda = 0;
        String desconto_ir = "0%";

        if (salario_bruto > 2500){
            imposto_de_renda = salario_bruto * 0.2;
            desconto_ir = "20%";
        } else if (salario_bruto > 1500){
            imposto_de_renda = salario_bruto * 0.1;
            desconto_ir = "10%";
        } else if (salario_bruto > 900) {
            imposto_de_renda = salario_bruto * 0.05;
            desconto_ir = "5%";
        }

        double inss = salario_bruto * 0.1;
        double fgts = salario_bruto * 0.11;

//          *******DESALINHADOS*******
//        System.out.printf("\n\nSalário bruto: (%s * %s) : R$ %s\n", inteiros.format(valor_hora), inteiros.format(total_horas), dinheiro.format(salario_bruto));
//        System.out.printf("(-) IR (%s) : R$ %s\n", desconto_ir, dinheiro.format(imposto_de_renda));
//        System.out.printf("(-) INSS (10%%) : R$ %s\n", dinheiro.format(inss));
//        System.out.printf("FGTS (11%%) : R$ %s\n", dinheiro.format(fgts));
//        System.out.printf("Total de descontos : R$ %s\n", dinheiro.format(imposto_de_renda+inss));
//        System.out.printf("Salário Líquido : R$ %s\n", dinheiro.format(salario_bruto - imposto_de_renda - inss));

//          **********ALINHADO, MAS TRABALHOSO*********
//        String print_salario1 = "Salário bruto: (" + inteiros.format(valor_hora) + " * " + inteiros.format(total_horas) + ")";
//        String print_ir1 = "(-) IR (" + desconto_ir + ")";
//        String print_inss1 = "(-) INSS (10%)";
//        String print_fgts1 = "FGTS (11%)";
//        String print_total_desc1 = "Total de descontos";
//        String print_salario_liquido1 = "Salário Líquido";

//        String print_salario2 = ": R$ " + dinheiro.format(salario_bruto);
//        String print_ir2 = ": R$ " + dinheiro.format(imposto_de_renda);
//        String print_inss2 = ": R$ " + dinheiro.format(inss);
//        String print_fgts2 = ": R$ " + dinheiro.format(fgts);
//        String print_total_desc2 = ": R$ " + dinheiro.format(imposto_de_renda+inss);
//        String print_salario_liquido2 = ": R$ " + dinheiro.format(salario_bruto - imposto_de_renda - inss);
//
//        System.out.printf("\n\n%-45s%s\n",print_salario1, print_salario2);
//        System.out.printf("%-45s%s\n",print_ir1,print_ir2);
//        System.out.printf("%-45s%s\n",print_inss1, print_inss2);
//        System.out.printf("%-45s%s\n",print_fgts1,print_fgts2);
//        System.out.printf("%-45s%s\n",print_total_desc1,print_total_desc2);
//        System.out.printf("%-45s%s\n",print_salario_liquido1,print_salario_liquido2);

        System.out.printf("\n\n%-45s%s\n",("Salário bruto: (" + inteiros.format(valor_hora) + " * " + inteiros.format(total_horas) + ")"),(": R$ " + dinheiro.format(salario_bruto)));
        System.out.printf("%-45s%s\n",("(-) IR (" + desconto_ir + ")"),(": R$ " + dinheiro.format(imposto_de_renda)));
        System.out.printf("%-45s%s\n",("(-) INSS (10%)"),(": R$ " + dinheiro.format(inss)));
        System.out.printf("%-45s%s\n",("FGTS (11%)"),(": R$ " + dinheiro.format(fgts)));
        System.out.printf("%-45s%s\n",("Total de descontos"),(": R$ " + dinheiro.format(imposto_de_renda+inss)));
        System.out.printf("%-45s%s\n",("Salário Líquido"),(": R$ " + dinheiro.format(salario_bruto - imposto_de_renda - inss)));

    }
}
