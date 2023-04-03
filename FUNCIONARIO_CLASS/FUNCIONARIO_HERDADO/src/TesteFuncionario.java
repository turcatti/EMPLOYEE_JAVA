public class TesteFuncionario {
    public static void main(String[] args) {
        
        Funcionario walter = new Funcionario();

        walter.setNome("Walter Turcatti");
        walter.setCpf("000.000.000-00");
        walter.setSalario(2300.00);

        System.out.println(walter.getNome() + " seu salário é de " + walter.getSalario() + " e sua bonificação é de " + walter.getBonificao());
    }
}
