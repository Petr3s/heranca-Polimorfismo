package Calculatordio;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Menu de Operações ===");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Potenciação");
            System.out.println("5. multiplicação");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção (1-5): ");

            String entrada = scanner.nextLine().toLowerCase();

            if (entrada.equals("stop")) {
                System.out.println("Programa encerrado.");
                break;
            } else if (!entrada.matches("[1-6]")) {
                System.out.println("Entrada inválida. Por favor, digite um número de 1 a 6 ou 'stop' para encerrar.");
                continue;
            }

            int opcao = Integer.parseInt(entrada);

            switch (opcao) {
                case 1: // Soma
                    System.out.print("Digite o primeiro número: ");
                    double num1 = lerNumero(scanner);

                    System.out.print("Digite o segundo número: ");
                    double num2 = lerNumero(scanner);

                    double resultado = num1 + num2;
                    System.out.println("Resultado parcial: " + resultado);

                    boolean submenu = true;
                    while (submenu) {
                        System.out.println("\n1. Adicionar mais números");
                        System.out.println("2. Voltar ao menu principal");
                        System.out.print("Escolha: ");
                        String escolhaSubmenu = scanner.nextLine();

                        if (escolhaSubmenu.equals("1")) {
                            System.out.print("Digite outro número: ");
                            double novoNumero = lerNumero(scanner);
                            resultado += novoNumero;
                            System.out.println("Novo resultado: " + resultado);
                        } else if (escolhaSubmenu.equals("2")) {
                            submenu = false;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 2: // Subtração
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerNumero(scanner);

                    System.out.print("Digite o segundo número: ");
                    num2 = lerNumero(scanner);

                    resultado = num1 - num2;
                    System.out.println("Resultado parcial: " + resultado);

                    submenu = true;
                    while (submenu) {
                        System.out.println("\n1. Subtrair mais números");
                        System.out.println("2. Voltar ao menu principal");
                        System.out.print("Escolha: ");
                        String escolhaSubmenu = scanner.nextLine();

                        if (escolhaSubmenu.equals("1")) {
                            System.out.print("Digite outro número: ");
                            double novoNumero = lerNumero(scanner);
                            resultado -= novoNumero;
                            System.out.println("Novo resultado: " + resultado);
                        } else if (escolhaSubmenu.equals("2")) {
                            submenu = false;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 3: // Divisão
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerNumero(scanner);

                    System.out.print("Digite o segundo número: ");
                    num2 = lerNumero(scanner);

                    if (num2 == 0) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        break;
                    }

                    resultado = num1 / num2;
                    System.out.println("Resultado parcial: " + resultado);

                    submenu = true;
                    while (submenu) {
                        System.out.println("\n1. Dividir por mais números");
                        System.out.println("2. Voltar ao menu principal");
                        System.out.print("Escolha: ");
                        String escolhaSubmenu = scanner.nextLine();

                        if (escolhaSubmenu.equals("1")) {
                            System.out.print("Digite outro número: ");
                            double novoNumero = lerNumero(scanner);
                            if (novoNumero == 0) {
                                System.out.println("Erro: Divisão por zero não é permitida.");
                                continue;
                            }
                            resultado /= novoNumero;
                            System.out.println("Novo resultado: " + resultado);
                        } else if (escolhaSubmenu.equals("2")) {
                            submenu = false;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 4: // Potenciação
                    System.out.print("Digite a base: ");
                    double base = lerNumero(scanner);

                    System.out.print("Digite o expoente: ");
                    double expoente = lerNumero(scanner);

                    resultado = Math.pow(base, expoente);
                    System.out.println("Resultado parcial: " + resultado);

                    submenu = true;
                    while (submenu) {
                        System.out.println("\n1. Elevar o resultado a um novo expoente");
                        System.out.println("2. Voltar ao menu principal");
                        System.out.print("Escolha: ");
                        String escolhaSubmenu = scanner.nextLine();

                        if (escolhaSubmenu.equals("1")) {
                            System.out.print("Digite o novo expoente: ");
                            double novoExpoente = lerNumero(scanner);
                            resultado = Math.pow(resultado, novoExpoente);
                            System.out.println("Novo resultado: " + resultado);
                        } else if (escolhaSubmenu.equals("2")) {
                            submenu = false;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 5 : // multiplicação
                    System.out.print("Digite o primeiro número: ");
                    double num11 = lerNumero(scanner);

                    System.out.print("Digite o segundo número: ");
                    double num21 = lerNumero(scanner);

                    double resultado1 = num11 * num21;
                    System.out.println("Resultado parcial: " + resultado1);

                    boolean submenu1 = true;
                    while (submenu1) {
                        System.out.println("\n1. Adicionar mais números");
                        System.out.println("2. Voltar ao menu principal");
                        System.out.print("Escolha: ");
                        String escolhaSubmenu = scanner.nextLine();

                        if (escolhaSubmenu.equals("1")) {
                            System.out.print("Digite outro número: ");
                            double novoNumero = lerNumero(scanner);
                            resultado1 *= novoNumero;
                            System.out.println("Novo resultado: " + resultado1);
                        } else if (escolhaSubmenu.equals("2")) {
                            submenu1 = false;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }

        scanner.close();
    }

    // Método auxiliar para ler número com tratamento de erro
    private static double lerNumero(Scanner scanner) {
        while (true) {
            String entrada = scanner.nextLine();
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.print("Número inválido. Digite novamente: ");
            }
        }
    }
}
