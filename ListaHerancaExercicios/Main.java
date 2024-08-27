package ListaHerancaExercicios;

import ListaHerancaExercicios.abstratas.Pessoa;
import ListaHerancaExercicios.concretas.*;

public class Main {
    public static void main(String[] args) {
        Pessoa fornecedor = new Fornecedor("Zé", "Rua das flores 999", "(48)99923-4866",
                20345.23, 10234.50);
        System.out.println(fornecedor);

        Pessoa empregado = new Empregado("Rui", "Av Sete de Setembro 2234", "(48)91234-5544",
                234, 2347.88, 12);
        System.out.println(empregado);

        Pessoa administrador = new Administrador("Roberson", "Av Sete de Setembro s/n", "(49)91234-5544",
                238, 4347.88, 27.5, 3500);
        System.out.println(administrador);

        Pessoa vendedor = new Vendedor("Joana", "Travessa Bertoli 445", "(47)91834-5654",
                231, 2000, 20.5, 350000, 6);
        System.out.println(vendedor);

        Pessoa operario = new Operario("Túlio", "Rua Sem Nome, 332", "(51)98284-8844",
                238, 2000, 20.5, 250000,10);
        System.out.println(operario);
    }
}

