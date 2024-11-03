import entidades.Departamento;
import entidades.Display;
import entidades.Empresa;
import entidades.Funcionario;
import java.util.Scanner;

//Essa é a classe principal onde estao atribuidos todos os atributos dos funcionarios e os proprios funcionarios//
public class Main {
    public static void main(String[] args) {
        //instanciação de objetos e variaveis//
        Empresa empresa = new Empresa();
        Display display = new Display();


        Funcionario murilo = new Funcionario();
        Funcionario kaynan = new Funcionario();
        Funcionario giovanna = new Funcionario();
        Funcionario pedro = new Funcionario();
        Funcionario bruno = new Funcionario();
        Funcionario joao = new Funcionario();


        Departamento depMarketing = new Departamento();
        Departamento depRh = new Departamento();
        Departamento depTi = new Departamento();


        //PRÉ-FEITOS

        //Nomes dos funcionários//
        murilo.nomeFuncionario = "Murilo";
        kaynan.nomeFuncionario = "Kaynan";
        giovanna.nomeFuncionario = "Giovanna";
        pedro.nomeFuncionario = "Pedro";
        bruno.nomeFuncionario = "Bruno d'Luka";
        joao.nomeFuncionario = "João";

        //ID dos funcionários//
        murilo.idFuncionario = 1234;
        kaynan.idFuncionario = 5678;
        giovanna.idFuncionario = 7890;
        pedro.idFuncionario = 9876;
        bruno.idFuncionario = 9789;
        joao.idFuncionario = 9990;

        //salário dos funcionários//
        murilo.salarioFuncionario = 5556;
        kaynan.salarioFuncionario = 1;
        giovanna.salarioFuncionario =6400;
        pedro.salarioFuncionario = 3400;
        bruno.salarioFuncionario = 2400;
        joao.salarioFuncionario = 3800;

        //cargos dos funcionários//
        murilo.cargoFuncionario = "Programa com o C#";
        kaynan.cargoFuncionario = "Python Master Chief Developer";
        giovanna.cargoFuncionario = "CEO";
        pedro.cargoFuncionario = "Engenheiro Pleno";
        bruno.cargoFuncionario = "Designer Master";
        joao.cargoFuncionario = "Supervisor";

        //cpf dos funcionarios//
        murilo.setCPF("12398532470");
        kaynan.setCPF("00357845417");
        giovanna.setCPF("34567191128");
        pedro.setCPF("18134567912");
        bruno.setCPF("15240789108");
        joao.setCPF("40024922123");

        //nomes, id dos departamentos
        depMarketing.nomeDoDepartamento = "Marketing";
        depMarketing.idDepartamento = 1234;
        depTi.nomeDoDepartamento = "TI";
        depTi.idDepartamento = 2345;
        depRh.nomeDoDepartamento = "RH";
        depRh.idDepartamento = 3456;

        //Adicionando os funcionários pré-feitos manualmente na empresa
        empresa.listaDeFuncionarios.add(murilo);
        empresa.listaDeFuncionarios.add(kaynan);
        empresa.listaDeFuncionarios.add(giovanna);
        empresa.listaDeFuncionarios.add(pedro);
        empresa.listaDeFuncionarios.add(bruno);
        empresa.listaDeFuncionarios.add(joao);

        //Adicionando os departamentos pré-feitos manualmente na empresa
        empresa.listaDepartamentos.add(depMarketing);
        empresa.listaDepartamentos.add(depRh);
        empresa.listaDepartamentos.add(depTi);

        //Criando o scanner para inputs
        Scanner sc = new Scanner(System.in);

       int resposta = 0;
       while (resposta != 5){
           System.out.println("\n->Gerenciamento da Empresa!");
           System.out.print("Insira o que você deseja fazer: \n1. Adicionar funcionário \n2. Adicionar funcionários a departamentos \n3. Gerenciamento de funcionários \n4. Gerenciamento de departamentos \n5. Sair \nResposta: ");
           resposta = sc.nextInt();
           sc.nextLine();
           switch (resposta) {
               //Adicionando funcionários e mostrar a lista dos funcionários da empresa
               case 1:
                   //print lista funcionários
                   display.printListaFuncionariosGeral(empresa);

                   //criar novo funcionário
                   Funcionario novoFuncionario = new Funcionario();
                   empresa.adicionarFuncionario(novoFuncionario);
                   System.out.println("Funcionario Adicionado com sucesso!\n");

                   //print lista funcionários
                   display.printListaFuncionariosGeral(empresa);

                   break;

               // atribuir funcionário a um departamento
               case 2:
                   //identifica o departamento que deseja adicionar um funcionario
                   System.out.print("Digite o ID do departamento para adicionar: ");
                   int idDepartamento = sc.nextInt();
                   sc.nextLine();

                   //processo de atribuição
                   empresa.atribuirFuncionarioAoDepartamento(idDepartamento);

                   //print da lista de funcionários no departamento
                   display.printListaFuncionariosDepartamento(empresa, idDepartamento);
                   break;

                   //Gerenciar funcionários
               case 3:
                   System.out.println("\nInsira o que deseja fazer: \n1. Atualizar funcionário \n2. Tirar funcionário do departamento \n3. Demitir \n4. Mostrar todos os funcionários da empresa \nResposta: ");
                   resposta = sc.nextInt();
                   sc.nextLine();
                   //Opções de gerenciamento de funcionários
                   switch (resposta) {
                       //atualizar funcionário
                       case 1:
                           empresa.atualizarFuncionarios();
                           break;
                       //remover funcionario do departamento
                       case 2:
                           System.out.print("Digite o ID do Funcionário: ");
                           int idFuncionario = sc.nextInt();
                           sc.nextLine();
                           empresa.removFuncionarioDepartamento(idFuncionario);
                           break;
                        //remover funcionário da empresa
                       case 3:
                           empresa.removFuncionario();
                           break;
                        //Print lista de funcionários
                       case 4:
                           display.printListaFuncionariosGeral(empresa);
                           break;
                       default:
                           resposta = 6;
                           System.out.println("Número incorreto!");
                           break;
                   }

                   break;

                   //Gerenciar Departamentos
               case 4:
                   System.out.println();
                   System.out.println("\nInsira o que deseja fazer: \n1. Adicionar departamento \n2. Alterar departamento \n3. Remover departamento \n4. Mostrar todos os departamentos \nResposta: ");
                   resposta = sc.nextInt();
                   sc.nextLine();
                   switch (resposta) {
                       //Adicionar departamento
                       case 1:
                           display.printListaDepartamentosGeral(empresa);

                           Departamento novoDepartamento = new Departamento();

                           empresa.adicionarDepartamento(novoDepartamento);

                           display.printListaDepartamentosGeral(empresa);
                           break;
                        //Atualizar departamento
                       case 2:
                           empresa.atualizarDepartamento();
                           break;
                        //Remover departamento
                       case 3:
                           System.out.print("Insira o ID do Departamento: ");
                           int idDoDepartamento = sc.nextInt();
                           sc.nextLine();
                           empresa.removerDepartamento(idDoDepartamento);
                           System.out.println("Removido!");
                           break;
                       //Print lista de departamentos
                       case 4:
                           display.printListaDepartamentosGeral(empresa);
                           break;
                       default:
                           resposta = 6;
                           System.out.println("Número incorreto!");
                           break;
                   }
                   break;
               case 5:
                   return;

               default:
                   System.out.println("ERRO!!! NÚMERO INCORRETO!!!");
                   break;
           }
       }
    }
}