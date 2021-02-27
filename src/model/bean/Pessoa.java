package model.bean;

 public class Pessoa {
    private String nome, sobrenome, salaEtapaUm, salaEtapaDois,espacoUm, espacoDois;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }   

    public int getIdSala() {
        return id;
    }

    public void setIdPessoa(int id) {
        this.id = id;
    }

    public String getSalaEtapaUm() {
        return salaEtapaUm;
    }

    public void setSalaEtapaUm(String salaEtapaUm) {
        this.salaEtapaUm = salaEtapaUm;
    }

    public String getSalaEtapaDois() {
        return salaEtapaDois;
    }

    public void setSalaEtapaDois(String salaEtapaDois) {
        this.salaEtapaDois = salaEtapaDois;
    }

    public String getEspacoUm() {
        return espacoUm;
    }

    public void setEspacoUm(String espacoUm) {
        this.espacoUm = espacoUm;
    }

    public String getEspacoDois() {
        return espacoDois;
    }

    public void setEspacoDois(String espacoDois) {
        this.espacoDois = espacoDois;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
