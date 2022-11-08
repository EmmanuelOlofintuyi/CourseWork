package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MartianManager {
	protected Map<Integer, Martian> martians = new HashMap<>();
	protected Map<Integer, Teleporter> teleporters = new HashMap<>();
	public MartianManager() {

	}

	public boolean addMartian(Martian m) {
		int id = m.getId();
		if (!martians.containsValue(m)) {
			martians.put(id, m);
			if(m instanceof Teleporter) {
				GreenMartian g = (GreenMartian) m;
				teleporters.put(id, g);
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
		return martians.containsValue(dumby);

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

	public ArrayList<Martian> getSortedMartiansSpring2020(String sortType) {
		ArrayList<Martian> sorted = new ArrayList<Martian>();
		for(int i = 0; i < martians.size(); i++) {
			sorted.add(martians.get(i));
		}
		if(sortType.equals("ID")){
			Collections.sort(sorted,new MartianIdComparator());
		}
		else if(sortType.equals("VOLUME")) {
			Collections.sort(sorted,new MartianVolumeComparator());
		}
		else {
			return null;
		}
	
		return sorted;
	}

	public Teleporter getTeleporterAt(int id) {
		if (martians.get(id) instanceof Teleporter) {
			//Teleporter t = (Teleporter) martians.get(i);
			GreenMartian g = (GreenMartian) martians.get(id);
			return g;
		}
		return null;
	}
	
	public void increaseTeleporterVolume(int idThreshold) {
		for(int i = 0; i < teleporters.size(); i++) {
			GreenMartian teleporter = ((GreenMartian)( teleporters.get(i)));
			if(teleporter.getId() < idThreshold) {
				teleporter.setVolume(teleporter.getVolume() +1);
			}
		}
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
				martians.remove((((GreenMartian)( teleporters.get(0))).getId()));
				teleporters.remove(0);
		}
	}

	public Martian removeMartian(int id) {
		Martian toRemove = null;
		if(martians.containsKey(id)) {
			toRemove= martians.get(id);
			martians.remove(id);
		}
		if(toRemove instanceof GreenMartian) {
		teleporters.remove(id);
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
