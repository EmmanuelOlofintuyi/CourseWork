package prob1;

public abstract class Martian implements Comparable<Martian> {
	private int id;
	private int volume;

	public Martian(int id, int volume) {
		this.id = id;
		this.volume = volume;
	}

	public int compareTo(Martian m) {
		return this.id - m.id;
	}

	public boolean equals(Object o) {
		if (o instanceof Martian) {
			Martian m = (Martian) o;
			if (this.id == m.id) {
				return true;
			} 
			else {
				return false;
			}
		} 
		else {
			return false;
		}
	}

	public int getId() {
		return id;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public abstract String speak();

	public String toString() {
		return String.format("id=%d, volume=%d", id, volume);
	}

}
