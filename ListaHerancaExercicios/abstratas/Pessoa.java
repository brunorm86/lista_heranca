/*
Cria uma Classe Pessoa, contendo os atributos
encapsulados, com seus respectivos seletores (getters) e
modificadores (setters), e ainda o construtor padrão e
pelo menos mais duas opções de construtores conforme sua
percepção. Atributos: String nome; String endereço; String
telefone;
 */

package ListaHerancaExercicios.abstratas;

public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.telefone = "(00)00000-0000";
        this.endereco = endereco;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.telefone = "(00)00000-0000";
        this.endereco = "Sem endereço cadastrado";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nNome = " + nome +
                "\nEndereco = " + endereco +
                "\nTelefone = " + telefone;

    }
}
