
import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner le = new Scanner(System.in);

        FilaInt filaAtend = new FilaInt();
        FilaInt filaInter = new FilaInt();
        filaAtend.init();
        filaInter.init();
        int posicao,opcao,pergunta1,pergunta2,pergunta3,vagas;
        long cpf;
        posicao = 0;
        vagas = 5;
        Paciente[]leitos = new Paciente[vagas];
        String nome;

        do {
            System.out.println("Digite 1 - Cadastrar paciente na fila ");
            System.out.println("Digite 2 - Atender paciente ");
            System.out.println("Digite 3 - Liberar vaga ");
            opcao = le.nextInt();
            switch(opcao) {
                case 1: System.out.println("Insira o nome do Paciente...");
                    nome = le.next();
                    System.out.println("Insira o CPF do Paciente...");
                    cpf = le.nextLong();
                    Paciente pacienteCadastrado = new Paciente(cpf,nome);
                    filaAtend.enqueue(pacienteCadastrado);
                    System.out.println("Paciente " + pacienteCadastrado + " cadastrado");
                    break;
                case 2:
                    System.out.println(filaAtend.dequeue());
//                case 2: if (!filaAtend.isEmpty()){
//                    Paciente pacienteAtendido =  new Paciente(filaAtend.dequeue());
//                    System.out.println("Paciente a ser atendido " + pacienteAtendido);
//                    System.out.println("Esta sentindo falta de ar?  \n 1 - Sim 2 - Não");
//                    pergunta1 = le.nextInt();
//                    System.out.println("Esta tendo tosse seca? \n 1 - Sim 2 - Não");
//                    pergunta2 = le.nextInt();
//                    System.out.println("Esta tendo febre? \n 1 - Sim 2 - Não");
//                    pergunta3 = le.nextInt();
//                    if(pergunta1 == 1 && pergunta3 == 1 ) {
//                        if(posicao >= vagas){
//                            System.out.println("Não ha vagas ");
//                            filaInter.enqueue(pacienteAtendido);
//                        }
//                        else {
//                            leitos[posicao] = pacienteAtendido;
//                            posicao++;
//                            System.out.println("Paciente " + pacienteAtendido + " internado");
//                        }
//                    }else   {
//                        System.out.println("O paciente " +  pacienteAtendido + " foi liberado");
//                    }
//                }
//                    break;
                case 3:
                    System.out.println("Insira o CPF do paciente a ser buscado....");
                    cpf = le.nextInt();
                    for (int i=0 ; i < posicao; i++){
                        if(leitos[i].cpf == cpf){
                            if(!filaInter.isEmpty()){
                                leitos[i] = filaInter.dequeue();
                            }
                            else {
                                leitos[i] = null;
                            }
                        }
                    }
                    break;
                default:System.out.println("Opção inválida");
            }
        } while (opcao <= 3);
        le.close();
    }

}