package application;

public class GreenMartian extends Martian implements Teleporter {

	public GreenMartian(int id) {
		super(id, 1);
	}

	GreenMartian(int id, int volume) {
		super(id, volume);
	}

	public String speak() {
		return "id=" + getId() + ", Grobldy Grock";
	}

	public String teleport(String dest) {
		return "id=" + getId() + " teleporting to " + dest;
	}

	@Override
	public String toString() {
		return String.format("Green Martian - id=%d, vol=%d", getId(), getVolume());
	}

}
