package entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Esta é a super classe, ela representa a empresa e as funções que ela exerce sob os departamentos e funcionários.A classe tem métodos como gerenciar departamentos e adicionar funcionários//
public class Empresa {
    private String nome = "Confidencial shhhhh";
    public List<Departamento> listaDepartamentos = new ArrayList<>();
    public List<Funcionario> listaDeFuncionarios = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    // método para alterar informaçoes do funcionario
    public void atualizarFuncionarios() {
        System.out.print("Digite o ID do funcionário: ");
        int id = sc.nextInt();
        System.out.println("Digite o que deseja alterar: \n1. Nome \n2. ID \n3. Cargo \n4. Salário \n5. CPF \nResposta: ");
        int escolhaAtt = sc.nextInt();
        sc.nextLine();
        switch (escolhaAtt) {
            case 1:
                for (int i = 0; i < listaDeFuncionarios.toArray().length; i++) {
                    Funcionario funcionarioAtual = listaDeFuncionarios.get(i);
                    if (funcionarioAtual.idFuncionario == id) {
                        System.out.print("Digite o novo nome: ");
                        funcionarioAtual.nomeFuncionario = sc.nextLine();

                    }
                }
                break;

            case 2:
                for (int i = 0; i < listaDeFuncionarios.toArray().length; i++) {
                    Funcionario funcionarioAtual = listaDeFuncionarios.get(i);
                    if (funcionarioAtual.idFuncionario == id) {
                        System.out.print("Digite o novo ID: ");
                        funcionarioAtual.idFuncionario = sc.nextInt();
                        sc.nextLine();
                    }
                }
                break;

            case 3:
                for (int i = 0; i < listaDeFuncionarios.toArray().length; i++) {
                    Funcionario funcionarioAtual = listaDeFuncionarios.get(i);
                    if (funcionarioAtual.idFuncionario == id) {
                        System.out.print("Digite o novo cargo: ");
                        funcionarioAtual.cargoFuncionario = sc.nextLine();
                    }
                }
                break;

            case 4:
                for (int i = 0; i < listaDeFuncionarios.toArray().length; i++) {
                    Funcionario funcionarioAtual = listaDeFuncionarios.get(i);
                    if (funcionarioAtual.idFuncionario == id) {
                        System.out.print("Digite o novo Salário: ");
                        funcionarioAtual.salarioFuncionario = sc.nextDouble();
                    }
                }
                break;

            default:
                System.out.println("Número incorreto!");
             break;
        }
    }

    // método para adicionar departamentos a empresa
    public void adicionarDepartamento(Departamento departamento) {
        System.out.print("Digite o nome do departamento: ");
        departamento.nomeDoDepartamento = sc.nextLine();

        //Verificador de ID único
        boolean isUnique = true;
        do {
            System.out.print("Digite o ID do departamento: ");
            departamento.idDepartamento = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < listaDepartamentos.toArray().length; i++){
                Departamento departamentoAtual = listaDepartamentos.get(i);
                if (departamentoAtual.idDepartamento == departamento.idDepartamento) {
                    System.out.println("O ID já está sendo utilizado!");
                    isUnique = false;
                    break;
                } else{
                    isUnique = true;
                }
            }
        } while (!isUnique);

        listaDepartamentos.add(departamento);
    }

    // nesse metodo e utilizado um for de que le todos os departamentos  na lista e caso o id do deparamento seja igual ao listado o departamento e excluido.
    public void removerDepartamento(int idDepartamento) {
        for (int i = 0; i < listaDepartamentos.toArray().length; i++) {
            Departamento departamentoAtual = listaDepartamentos.get(i);
            if (departamentoAtual.idDepartamento == idDepartamento) {
                listaDepartamentos.remove(departamentoAtual);
            }
        }
    }

    //serve para atualizar o ID ou o nome do departamento//
    public void atualizarDepartamento() {
        System.out.print("Digite o ID do departamento: ");
        int idDepartamento = sc.nextInt();
        System.out.println("Escolha o que deseja alterar no departamento: \n1.Nome do Departamento \n2.ID do Departamento");
        int escolhaAtt = sc.nextInt();
        sc.nextLine();
        switch (escolhaAtt) {
            case 1:
                System.out.print("Digite o novo nome do Departamento: ");
                String nomeDepartamento = sc.nextLine();
                for (int i = 0; i < listaDepartamentos.toArray().length; i++) {
                    Departamento departamentoAtual = listaDepartamentos.get(i);
                    if (departamentoAtual.idDepartamento == idDepartamento) {
                        departamentoAtual.nomeDoDepartamento = nomeDepartamento;
                    }
                }
                break;

            case 2:

                //Verificador de ID único
                boolean isUnique = true;
                int novoIdDepartamento;
                do {
                    System.out.println("Digite o novo id do departamento: ");
                    novoIdDepartamento = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < listaDepartamentos.toArray().length; i++){
                        Departamento departamentoAtual = listaDepartamentos.get(i);
                        if (departamentoAtual.idDepartamento == novoIdDepartamento) {
                            System.out.println("O ID já está sendo utilizado!");
                            isUnique = false;
                            break;
                        } else {
                            isUnique = true;
                        }
                    }
                } while (!isUnique);

                for (int i = 0; i < listaDepartamentos.toArray().length; i++) {
                    Departamento departamentoAtual = listaDepartamentos.get(i);
                    if (departamentoAtual.idDepartamento == idDepartamento) {
                        departamentoAtual.idDepartamento = novoIdDepartamento;
                    }
                }
                break;

            default:
                System.out.println("Número incorreto!");
        }

    }

    public void removFuncionarioDepartamento(int idFuncionario){
        System.out.print("Digite o ID do Departamento: ");
        int idDepartamento = sc.nextInt();
        for (int i = 0; i < listaDepartamentos.toArray().length; i++){
            Departamento departamentoAtual = listaDepartamentos.get(i);
            if (departamentoAtual.idDepartamento == idDepartamento){
                departamentoAtual.removerFuncionarioDoDepartamento(idFuncionario);
            }
        }

    }


    //serve para adicionar funcionários a empresa, sem departamento
    public void adicionarFuncionario(Funcionario novoFuncionario) {
        System.out.print("\nDigite o nome do novo funcionário: ");
        novoFuncionario.nomeFuncionario = sc.nextLine();

        //Verificador de ID único
        boolean isUnique = false;
        do {
            System.out.print("Digite o ID do novo funcionário: ");
            novoFuncionario.idFuncionario = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < listaDeFuncionarios.toArray().length; i++){
                Funcionario funcionarioAtual = listaDeFuncionarios.get(i);
                if (funcionarioAtual.idFuncionario == novoFuncionario.idFuncionario) {
                    System.out.println("O ID já está sendo utilizado!");
                    isUnique = false;
                    break;
                } else {
                    isUnique = true;
                }
            }
        } while (!isUnique);

        System.out.print("Digite o cargo do novo funcionário: ");
        novoFuncionario.cargoFuncionario = sc.nextLine();
        System.out.print("Digite o salário do novo funcionário: ");
        novoFuncionario.salarioFuncionario = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o CPF do funcionario: ");
        novoFuncionario.setCPF(sc.nextLine());
        listaDeFuncionarios.add(novoFuncionario);
    }

    public void atribuirFuncionarioAoDepartamento(int idDepartamento){
        //identifica o funcionário
        System.out.print("Digite o ID do funcionário: ");
        int idFuncionario = sc.nextInt();
        sc.nextLine();

        boolean temFuncionario = false;
        for (int i = 0; i < listaDepartamentos.toArray().length; i++) {
            Departamento departamentoAtual = listaDepartamentos.get(i);
            if (departamentoAtual.idDepartamento == idDepartamento) {
                for (int j = 0; j < listaDeFuncionarios.toArray().length; j++) {
                    Funcionario funcionarioAtual = listaDeFuncionarios.get(j);
                    if (funcionarioAtual.idFuncionario == idFuncionario) {
                        temFuncionario = true;
                        if (!funcionarioAtual.estaEmDepartamento) {
                            departamentoAtual.adicionarFuncionarioAoDepartamento(funcionarioAtual);
                            funcionarioAtual.estaEmDepartamento = true;
                            System.out.println("Funcionário está adicionado com sucesso!\n");
                        } else {
                            System.out.println("Já está em um departamento!!");
                        }
                    }
                }
            }
        }
        if (!temFuncionario) {
            System.out.println("O funcionário ou departamento não existe!");
        }

    }

    //serve para remover/demitir funcionarios//
    public void removFuncionario() {
        System.out.print("Insira o ID do funcionário: ");
        int idFuncionario = sc.nextInt();
        sc.nextLine();

        //Removendo do departamento
        removFuncionarioDepartamento(idFuncionario);

        //Removendo da lista geral da empresa
        for (int i = 0; i < listaDeFuncionarios.toArray().length; i++) {
            Funcionario funcionarioAtual = listaDeFuncionarios.get(i);
            if (funcionarioAtual.idFuncionario == idFuncionario) {
                listaDeFuncionarios.remove(funcionarioAtual);
            }
        }
    }
}