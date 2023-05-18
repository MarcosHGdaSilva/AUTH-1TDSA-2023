package br.com.AUTH.model;

public class Profile {
    private long id;
    private String nome;

    public Profile() {
    }

    public Profile(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
