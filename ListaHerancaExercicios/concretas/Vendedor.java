/*
Implemente a classe Vendedor como subclasse da classe
Empregado. Um determinado vendedor tem como atributos, para
além dos atributos da classe Pessoa e da classe Empregado, o
atributo valorVendas (correspondente ao valor monetário dos
artigos vendidos) e o atributo comissao (porcentagem do
valorVendas que será adicionado ao vencimento base do
Vendedor). Note que deverá redefinir nesta subclasse o mét odo
herdado calcularSalario (o salário de um vendedor é equivalente
ao salário de um empregado usual acrescido da referida
comissão). Escreva um programa de teste adequado para esta
classe.
 */

package ListaHerancaExercicios.concretas;

public class Vendedor extends Empregado{

    protected double valorVendas;
    protected double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
                    double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
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

        valorComissao = valorVendas*(comissao/100);

        salarioTotal = salarioBase - desconto + valorComissao;

        return salarioTotal;
    }

    @Override
    public String toString() {
        return
                "\n-----------\nVendedor\n-----------"+
                super.toString()+
                "\nValor de Venda = "+valorVendas+
                "\nComissão = " + valorVendas*(comissao/100);

    }
}
