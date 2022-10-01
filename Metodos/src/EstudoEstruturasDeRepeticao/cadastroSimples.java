package EstudoEstruturasDeRepeticao;

public class cadastroSimples {
    public String nome;
    public int numero;
    public Long numeroRacional;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Long getNumeroRacional() {
        return numeroRacional;
    }

    public void setNumeroRacional(Long numeroRacional) {
        this.numeroRacional = numeroRacional;
    }

    @Override
    public String toString() {
        return "listaSimples{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", numeroRacional=" + numeroRacional +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof cadastroSimples)) return false;

        cadastroSimples that = (cadastroSimples) o;

        if (getNumero() != that.getNumero()) return false;
        if (getNome() != null ? !getNome().equals(that.getNome()) : that.getNome() != null) return false;
        return getNumeroRacional() != null ? getNumeroRacional().equals(that.getNumeroRacional()) : that.getNumeroRacional() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + getNumero();
        result = 31 * result + (getNumeroRacional() != null ? getNumeroRacional().hashCode() : 0);
        return result;
    }
}
