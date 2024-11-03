package entidades;

//Funcionário: Esta classe representa um funcionário. Ela contém atributos como nome, ID do funcionário, cargo, salário, etc.//

public class Funcionario extends Departamento{

    //Atributos básicos com informações sobre o funcionário//
    public String nomeFuncionario;
    public int idFuncionario;
    public String cargoFuncionario;
    public double salarioFuncionario;
    private String cpfFuncionario;
    public boolean estaEmDepartamento = false;

    //Função para ter acesso ao cpf
    public String getCPF(){
        return cpfFuncionario;
    }

    //Função para definir o cpf
    public void setCPF(String cpfFuncionario){
        this.cpfFuncionario = cpfFuncionario;
    }
}