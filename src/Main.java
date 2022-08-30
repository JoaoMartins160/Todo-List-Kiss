import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int option = 0, count, update;
    Scanner input = new Scanner(System.in);
        ArrayList<String> task = new ArrayList<String>();

        while (option != 5){
            System.out.println("1- Adicionar Tarefa | 2- Listar Tarefa | 3- Remover Tarefa | 4- Atualizar Tafera | 5 Sair");
            option = input.nextInt();
            switch (option){
                case 1 ->{
                    System.out.println("Digite uma Tarefa para Adicionar:");
                    input.nextLine();
                    task.add(input.nextLine());
                }
                case 2 ->{
                    for (count = 0; count < task.size();count++){
                        System.out.println("\nTarefa nº" +count+":"+task.get(count));
                    }
                }
                case 3 ->{
                    System.out.println("\nDigite o nome da Tarefa a ser Removida:");
                    input.nextLine();
                    task.remove(input.nextLine());
                }
                case 4 ->{
                    System.out.println("\nDigite o numero da Tarefa que deseja Atualizar");
                    update = input.nextInt();
                    System.out.println("\nAtualização de Tarefa.... Digite uma Tarefa");
                    input.nextLine();
                    task.set(update,input.nextLine());
                }
                case 5 ->{
                    System.out.println("Encerrando");
                }
            }
        }
    }
}