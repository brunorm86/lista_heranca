/*
Implemente a classe Operario como subclasse da classe
Empregado. Um determinado operário tem como atributos, para
além dos atributos da classe Pessoa e da classe Empregado, o
atributo valorProducao (que corresponde ao valor monetário dos
artigos efetivamente produzidos pelo operário) e comissao (que
corresponde à porcentagem do valorProducao que será
adicionado ao vencimento base do operário). Note que deverá
redefinir nesta subclasse o mét odo herdado calcularSalario (o
salário de um operário é equivalente ao salário de um
empregado usual acrescido da referida comissão). Escreva um
programa de teste adequado para esta classe.
 */

package ListaHerancaExercicios.concretas;

public class Operario extends Empregado{
    protected double valorProducao;
    protected double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
                    double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal;
        double valorComissao;
        double desconto;

        desconto =  salarioBase*(imposto/100);

        valorComissao = valorProducao*(comissao/100);

        salarioTotal = salarioBase - desconto + valorComissao;

        return salarioTotal;
    }

    @Override
    public String toString() {
        return
                "\n-----------\nOperário\n-----------"+
                super.toString()+
                "\nValor de Produção = "+valorProducao+
                "\nComissão = " + valorProducao*(comissao/100);

    }
}
