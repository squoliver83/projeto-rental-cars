package entities.agencia;

import java.util.Objects;

public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String logradouro, String numero, String complemento, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(logradouro, endereco.logradouro)
                && Objects.equals(numero, endereco.numero)
                && Objects.equals(complemento, endereco.complemento)
                && Objects.equals(cidade, endereco.cidade)
                && Objects.equals(estado, endereco.estado)
                && Objects.equals(cep, endereco.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logradouro, numero, cidade, estado, cep);
    }

    public String mostrarEndereco() {
        StringBuilder sb = new StringBuilder();
        sb.append("Logradouro: ").append(logradouro);
        sb.append("\nNumero: ").append(numero);
        sb.append("\nComplemento: ").append(complemento);
        sb.append("\nCidade: ").append(cidade);
        sb.append("\nEstado: ").append(estado);
        sb.append("\nCEP: ").append(cep);
        return sb.toString();
    }

    @Override
    public String toString() {
        return logradouro + "," +
               numero + "," +
               complemento + "," +
               cidade + "," +
               estado + "," +
               cep;
    }
}
