package set.Pesquisa;

import java.util.Objects;

public class Contacto{
	private String nome;
	private int numero;
	
	public Contacto(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "\nTarefa [nome=" + nome + ", numero=" + numero + "]";
	}
}
