package br.com.cocodonto.modelo.entidade;

public class Odontograma {

	private int id;

	public Odontograma() {
	}

	public Odontograma(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Odontograma other = (Odontograma) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
