package com.herick;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        EventoManager eventoManager = new EventoManager();

        System.out.println("Cadastro de Usuário:");

        System.out.println("Nome: ");
        String userName = scanner.nextLine();

        System.out.println("Email: ");
        String userEmail = scanner.nextLine();

        System.out.println("Idade: ");
        int userAge = scanner.nextInt();

        System.out.println("Sexo (M/F): ");
        boolean userSex = scanner.next().equalsIgnoreCase("M");
        scanner.nextLine();

        System.out.println("Endereço: ");
        String userAddress = scanner.nextLine();

        Usuario usuario = new Usuario(userName, userEmail, userAge, userSex, userAddress);

        System.out.println("Cadastro de Evento:");

        System.out.println("Nome: ");
        String eventName = scanner.nextLine();

        System.out.println("Endereço: ");
        String eventAddress = scanner.nextLine();

        System.out.println("Categoria: ");
        String category = scanner.nextLine();

        System.out.println("Horário (YYYY-MM-DDTHH:MM): ");
        LocalDateTime time = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));


        System.out.println("Descrição: ");
        String description = scanner.nextLine();

        Evento evento = new Evento(eventName, eventAddress,  category, time, description);
        eventoManager.cadastrarEvento(evento);

        System.out.println("\nEventos Cadastrados:");
        for (Evento e : eventoManager.consultarEventos()) {
            System.out.printf("Nome: "  + e.getEventName());
            System.out.printf("\nEndereço: " + e.getEventAddress());
            System.out.printf("\nCategoria: " + e.getCategory());
            System.out.printf("\nHorário: " + e.getTime());
            System.out.printf("\nDescrição: " + e.getDescription());
        }

        scanner.close();
    }
}
