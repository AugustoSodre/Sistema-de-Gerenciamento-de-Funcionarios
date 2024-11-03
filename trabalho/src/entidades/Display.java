package entidades;

//Display: esta classe contem os metodos para organizar a main e colocar a maior parte dos prints
public class Display {

    //metodo para mostrar lista de funcionarios no departamento
    public void printListaFuncionariosDepartamento(Empresa empresa, int idDepartamento){
        System.out.println("Lista de funcionarios no departamento: ");
        for (int i = 0; i < empresa.listaDepartamentos.toArray().length; i++) {
            Departamento departamentoAtual = empresa.listaDepartamentos.get(i);
            if (departamentoAtual.idDepartamento == idDepartamento) {
                for (int j = 0; j < departamentoAtual.listaDeFuncionarios.toArray().length; j++) {
                    Funcionario funcionarioAtual = departamentoAtual.listaDeFuncionarios.get(j);
                    System.out.println("-" + funcionarioAtual.nomeFuncionario);
                }
            }
        }
    }

    //metodo para mostrar lista de funcionarios na empresa
    public void printListaFuncionariosGeral(Empresa empresa){
        System.out.println("\nLista dos funcionários atuais:");
        if (!empresa.listaDeFuncionarios.isEmpty()){
            for (int i = 0; i < empresa.listaDeFuncionarios.toArray().length; i++) {
                Funcionario funcionarioAtual = empresa.listaDeFuncionarios.get(i);
                System.out.printf("-Nome: %25s \t-ID: %10d \t-Cargo: %35s \t-CPF: %s \t-Salário: %.2f\n", funcionarioAtual.nomeFuncionario, funcionarioAtual.idFuncionario,funcionarioAtual.cargoFuncionario, funcionarioAtual.getCPF(), funcionarioAtual.salarioFuncionario);
            }
        }
    }

    //metodo para mostra lista de departamentos da empresa
    public void printListaDepartamentosGeral(Empresa empresa){
        System.out.println("\nLista dos departamentos atuais: ");
        if (!empresa.listaDepartamentos.isEmpty()){
            for (int i = 0; i < empresa.listaDepartamentos.toArray().length; i++) {
                Departamento departamentoAtual = empresa.listaDepartamentos.get(i);
                System.out.printf("-> Nome: %12s \t-ID: %10d \n", departamentoAtual.nomeDoDepartamento, departamentoAtual.idDepartamento);
                printListaFuncionariosDepartamento(empresa, departamentoAtual.idDepartamento);
                System.out.println("\n");
            }
        }
    }
}