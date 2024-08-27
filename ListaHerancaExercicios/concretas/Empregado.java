/*
Considere, como subclasse da classe Pessoa, a classe Empregado.
Considere que cada instância da classe Empregado tem, para
além dos atributos que caracterizam a classe Pessoa, os atributos
codigoSetor (inteiro), salarioBase (vencimento base) e imposto
(porcentagem retida dos impostos). Implemente a classe
Empregado com métodos seletores e modificadores e um mét odo
calcularSalario. Escreva um programa de teste adequado para a
classe Empregado.
 */

package ListaHerancaExercicios.concretas;

import ListaHerancaExercicios.abstratas.Pessoa;

public class Empregado extends Pessoa {

    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase- salarioBase*(imposto/100);
    }

    @Override
        public String toString() {
            return
                    super.toString()+
                    "\nCódigo do Setor = " + codigoSetor +
                    "\nSálario Base = " + salarioBase +
                    "\nImposto = " + imposto+
                    "\nDesconto = " + salarioBase*(imposto/100)+
                    "\nSalário líquido = " + calcularSalario();
    }
}
