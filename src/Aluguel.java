import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluguel {
    List<Estudante> lista = new ArrayList<Estudante>(9);
    Scanner sca = new Scanner(System.in);

    public void Alugando(){
        System.out.println("Quantos quartos serão alugados?");
        int quantidadeQuartos =sca.nextInt();
         while(quantidadeQuartos>10){
             System.out.println("Insira um numero de 0 à 9");
            quantidadeQuartos =sca.nextInt();
        }
        for (int i = 0; i < quantidadeQuartos ; i++) {
            System.out.println("Quarto #"+i);
            System.out.println("Qual o nome");
            String nome = sca.next();
            System.out.println("Qual o email");
            String email= sca.next();
            System.out.println("Qual o quarto?");
            int room = sca.nextInt();
            lista.add(new Estudante(nome, email , room));


            }




        }
        public void exibir(){

            for (Estudante estudante: lista
            ) {

                        System.out.println("Nome: "+estudante.getNome()+"\nEmail: "+estudante.getEmail()+"\nQuarto: "+estudante.getRoom()+"\n");

                }

        }


    }

