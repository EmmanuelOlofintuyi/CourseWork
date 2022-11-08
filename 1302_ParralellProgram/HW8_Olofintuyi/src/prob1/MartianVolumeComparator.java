package prob1;

import java.util.Comparator;

public class MartianVolumeComparator implements Comparator<Martian>{
	public int compare(Martian a, Martian b) {
		int v = a.getVolume() - b.getVolume();
		if(v == 0) {
			return a.getId() - b.getId();
		}
		else {
			return v;
		}
	}
	
	
}
