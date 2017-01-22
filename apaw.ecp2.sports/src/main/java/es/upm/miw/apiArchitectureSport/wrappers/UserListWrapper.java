package es.upm.miw.apiArchitectureSport.wrappers;

import java.util.List;
import java.util.ArrayList;

public class UserListWrapper {

	List<UserWrapper> userList;

	public UserListWrapper() {
		userList = new ArrayList<UserWrapper>();
	}

	public List<UserWrapper> getUserLis() {
		return this.userList;
	}

	public void addUserWrapper(UserWrapper userWrapper) {
		userList.add(userWrapper);
	}

	@Override
	public String toString() {
		String result = "{\"userList\":[ ";
		for (UserWrapper userWrapper : this.userList) {
			result += userWrapper.toString() + ",";
		}
		return result.substring(0, result.length() - 1) + "]}";
	}

}
