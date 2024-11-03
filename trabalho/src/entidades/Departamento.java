package entidades;

import java.util.ArrayList;
import java.util.List;

//Departamento: Esta classe representa um departamento na empresa. Ela contém atributos como nome do departamento, ID do departamento, lista de funcionários, etc.//
public class Departamento extends Empresa {

    //Estes são os atributos da classe Departamento
    public String nomeDoDepartamento;
    public int idDepartamento;
    public List<Funcionario> listaDeFuncionarios = new ArrayList<>();

    //Estas são os metodos da classe Departamento
    public void adicionarFuncionarioAoDepartamento(Funcionario funcionarioAtual) {
        listaDeFuncionarios.add(funcionarioAtual);
    }

    //serve para remover um funcionario do departamento//
    public void removerFuncionarioDoDepartamento(int ID) {
        for (int i = 0; i < listaDeFuncionarios.toArray().length; i++) {
            Funcionario funcionarioAtual = listaDeFuncionarios.get(i);
            if (funcionarioAtual.idFuncionario == ID) {
                this.listaDeFuncionarios.remove(funcionarioAtual);
                System.out.println("Tirou da lista do departamento!");
            }
        }
    }
}