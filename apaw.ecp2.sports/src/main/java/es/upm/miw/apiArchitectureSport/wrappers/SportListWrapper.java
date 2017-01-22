package es.upm.miw.apiArchitectureSport.wrappers;

import java.util.ArrayList;
import java.util.List;

public class SportListWrapper {
	List<SportWrapper> sportList;

	public SportListWrapper() {
		sportList = new ArrayList<SportWrapper>();
	}

	public List<SportWrapper> getUserLis() {
		return this.sportList;
	}

	public void addUserWrapper(SportWrapper sportWrapper) {
		sportList.add(sportWrapper);
	}

	@Override
	public String toString() {
		String result = "{\"sportList\":[ ";
		for (SportWrapper sportWrapper : this.sportList) {
			result += sportWrapper.toString() + ",";
		}
		return result.substring(0, result.length() - 1) + "]}";
	}
}
