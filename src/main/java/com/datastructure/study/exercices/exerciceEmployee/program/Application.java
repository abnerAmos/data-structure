package com.datastructure.study.exercices.exerciceEmployee.program;

import com.datastructure.study.exercices.exerciceEmployee.entity.Employee;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.print("Quantos funcionários irá cadastrar: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        /* Abre uma lista com o Objeto de entity.
        PS. List não precisa determinar o tamanho da lista.
        O tamanho é dinamico, aumenta sempre que inserido um novo dado */
        List<Employee> listEmployee = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nDados do " + (i+1) + "a Funcionario:");
            System.out.print("Id: ");
            Integer id = input.nextInt();
            System.out.print("Nome: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salario: ");
            Double salary = input.nextDouble();

            // Instância do Obj ao qual recebe os dados.
            Employee employee = new Employee(id, name, salary);

            // Adicionando o Obj construído em uma lista.
            listEmployee.add(employee);
        }

        System.out.println("\nInforme o ID do funcionário que irá receber o aumento:");
        Integer id = input.nextInt();
        System.out.println("Informe a porcentagem de aumento:");
        int percentage = input.nextInt();

        // Armazena a pesquisa Lambda em uma variável
        Employee employee = listEmployee.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (employee == null) {
            System.out.println("ID não Encontrado!");
            System.out.println("\nLista de Funcionários:");
            listEmployee.forEach(System.out::println);
        } else {
            employee.increaseSalary(percentage);
            System.out.println("\nLista de Funcionários:");
            listEmployee.forEach(System.out::println);
        }
    }
}