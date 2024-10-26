/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Exercicio4 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário os valores inicial e final do intervalo
        System.out.print("Informe o valor inicial: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Informe o valor final: ");
        int fim = scanner.nextInt();
        
        int soma = 0;
        
        // Verifica se o valor inicial é maior que o valor final e inverte, se necessário
        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }
        // Calcula a soma dos números ímpares no intervalo
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar
                soma += i;
            }
        }
        // Exibe o resultado
        System.out.println("A soma dos números ímpares no intervalo é: " + soma);
        
        scanner.close();
    }
}

