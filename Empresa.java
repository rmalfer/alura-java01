class Empresa {
    
    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;

    public Empresa (int quantidadeDeFuncionarios) {
        this.funcionarios = new Funcionario[quantidadeDeFuncionarios];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario getFuncionario(int posicao) {

        if (posicao >= this.funcionarios.length) return null;
        return this.funcionarios[posicao];
    }

    public void adiciona(Funcionario funcionario) {

        label: for (int i = 0; i < this.funcionarios.length; i++) {

            if (this.funcionarios[i] == null) {

                this.funcionarios[i] = funcionario;
                break label;
            }
        }
    }

    public void mostraEmpregados() {

        for (int i = 0; i < this.funcionarios.length; i++) {

            if (this.funcionarios[i] != null) {

                System.out.println("Funcionário na posição " + i + ":");
                System.out.println("R$ " + this.funcionarios[i].getSalario());
            }
        }
    }

    public void mostraTodasAsInformacoes() {

        for (Funcionario f: this.funcionarios) {

            if (f != null) {
                f.mostra();
            }
        }
    }

    public boolean contem(Funcionario funcionario) {

        for (Funcionario f: this.funcionarios) {
            if (f == funcionario) return true; 
        }
        return false;
    }
}

class Funcionario{
    
    private static int numeroDeFuncionarios = 0;
    private int identificador;
    private String nome;
    private String departamento;
    public double salario;
    public Data dataEntrada;
    private String rg;

    public Funcionario() {
        this.identificador = ++Funcionario.numeroDeFuncionarios;
    }
    
    public Funcionario(String nome) {
        this();
        this.nome = nome;
    }

    public static int getNumeroDeFunconarios() {
        return Funcionario.numeroDeFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    public Data getDataEntrada() {
        return this.dataEntrada;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void recebeAumento(double aumento) {
        this.salario += aumento;
    }
    
    public double calculaGanhoAnual() {
        return this.salario * 12;
    }
    
    public void mostra() {

        System.out.println("Funcionário:" + this.identificador);
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.print("Data de entrada no banco: ");
        this.dataEntrada.mostra();
        System.out.println("RG: " + this.rg);
        System.out.println("Ganho anual: " + this.calculaGanhoAnual()+"\n");
    }
}

class Data {

    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {

        if (ano < 1) {
            ano = 1;
        }

        if (mes > 12) {
            mes = 12;
        }

        if (mes < 1) {
            mes = 1;
        }

        if  (dia < 1) {
            dia = 1;
        } 

        if (mes == 2 && dia > 28) {
            dia = 28;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dia = 30;
        } else if (dia > 31) {
            dia = 31;
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String getFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    void mostra() {
        System.out.println(this.getFormatada());
    }

    void preenche(int dia, int mes, int ano) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

}

class TestaEmpresa {

 public static void main(String[] args) {
       
       Empresa empresa = new Empresa(3);
       
       Funcionario f = new Funcionario();
       f.setNome("Primeiro");
       f.setDepartamento("RH");
       f.setSalario(100);
       f.setRg("123");
       f.setDataEntrada(new Data(28, 12, 2000));
       empresa.adiciona(f);
       
       f = new Funcionario();
       f.setNome("Segundo");
       f.setDepartamento("Atendimento");
       f.setSalario(90);
       f.setRg("123");
       f.setDataEntrada(new Data(28, 12, 2000));
       empresa.adiciona(f);

       empresa.mostraTodasAsInformacoes();
    }
}