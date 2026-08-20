package sets;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private Integer cpf;
    private String name;

    public Pessoa(Integer cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf=" + cpf +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf) && Objects.equals(name, pessoa.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, name);
    }

    @Override
    public int compareTo(Pessoa o) {
            return this.cpf - o.cpf;
    }
}
