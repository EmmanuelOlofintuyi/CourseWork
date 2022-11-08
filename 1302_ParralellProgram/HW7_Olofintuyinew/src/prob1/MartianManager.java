package prob1;

import java.util.ArrayList;
import java.util.Collections;

public class MartianManager {
	protected ArrayList<Martian> martians = new ArrayList<Martian>();
	protected ArrayList<Teleporter> teleporters = new ArrayList<Teleporter>();
	public MartianManager() {

	}

	public boolean addMartian(Martian m) {
		if (!martians.contains(m)) {
			martians.add(m);
			if(m instanceof Teleporter) {
				GreenMartian g = (GreenMartian) m;
				teleporters.add(g);
			}
			return true;
		} else {
			return false;
		}
		
	}

	public ArrayList<Martian> battle(ArrayList<Martian> invaders) {
		ArrayList<Martian> killed = new ArrayList<Martian>();
		for (int i = 0; i < invaders.size(); i++) {
			if (getPower(invaders.get(i)) > getPower(martians.get(0))) {
				killed.add(martians.get(0));
				martians.remove(0);
			}
			
		}
		return killed;
	}

	public boolean contains(int id) {
		Martian dumby = new GreenMartian(id);
		return martians.contains(dumby);

	}

	public Martian getMartianAt(int i) {
		return martians.get(i);
	}

	public Martian getMartianClosestTo(int id) {
		int difference = Math.abs(martians.get(0).getId() - id);
		Martian m = martians.get(0);
		for (int i = 1; i < martians.size(); i++) {
			if (difference > Math.abs(martians.get(i).getId() - id) && id != martians.get(i).getId()) {
				difference = Math.abs(martians.get(i).getId() - id);
				m = martians.get(i);
			}
		}
		return m;
	}

	public Martian getMartianClosestTo(Martian martian) {
		int difference = Math.abs(martians.get(0).getId() - martian.getId());
		Martian m = martians.get(0);
		for (int i = 1; i < martians.size(); i++) {
			if (difference > Math.abs(martians.get(i).getId() - martian.getId()) && martian.getId() != martians.get(i).getId()) {
				difference = Math.abs(martians.get(i).getId() - martian.getId());
				m = martians.get(i);
			}
		}
		return m;
	}

	public Martian getMartianWithId(int id) {
		for (int i = 0; i < martians.size(); i++) {
			if (martians.get(i).getId() == id) {
				return martians.get(i);
			}
		}
		return null;
	}

	public int getNumMartians() {
		return martians.size();
	}

	public int getNumTeleporters() {
		return teleporters.size();
	}

	public ArrayList<Martian> getSortedMartians() {
		ArrayList<Martian> sorted = new ArrayList<Martian>();
		for(int i = 0; i < martians.size(); i++) {
			sorted.add(martians.get(i));
		}
		Collections.sort(sorted);
		return sorted;
	}

	public Teleporter getTeleprterAt(int i) {
		if (martians.get(i) instanceof Teleporter) {
			//Teleporter t = (Teleporter) martians.get(i);
			GreenMartian g = (GreenMartian) martians.get(i);
			return g;
		}
		return null;
	}

	public String groupSpeak() {
		String s = "";
		for (int i = 0; i < martians.size(); i++) {
			s +=  martians.get(i).speak() + "\n";
		}
		return s;
	}

	public String groupTeleport() {
		String s = "\n";
		for (int i = 0; i < martians.size(); i++) {
			if (martians.get(i) instanceof Teleporter) {
				Teleporter t = (Teleporter) martians.get(i) ;
				s += t + "\n";
			}
		}
		return s;
	}

	public void obliterateTeleporters() {
		int size = teleporters.size();
		for (int i = 0; i < size; i++) {
				martians.remove(teleporters.get(0));
				teleporters.remove(0);
		}
	}

	public Martian removeMartian(int id) {
		Martian toRemove = null;
		Martian dumby = new GreenMartian(id, 0);
		int i = martians.indexOf(dumby);
		if(i >= 0) {
			toRemove= martians.get(i);
		}
		martians.remove(toRemove);
		if(toRemove instanceof GreenMartian) {
		GreenMartian g = (GreenMartian) toRemove;
		teleporters.remove(g);
		}
		return toRemove;
	}

	public String toString() {
		String s = "Martians:";
		for (int i = 0; i < martians.size(); i++) {
			s += "\n" + martians.get(i).toString();
		}
		
		s+= "\nTeleporters:";
		
		for(int i = 0; i< teleporters.size(); i++) {
			s+= "\n" + teleporters.get(i).toString();
		}
		return s;
	}


	// helper method
	private int getPower(Martian m) {
		if (m instanceof RedMartian) {
			RedMartian r = (RedMartian) m;
			return r.getVolume() + r.getTenacity();
		} 
		else {
			return m.getVolume();
		}
	}

}
