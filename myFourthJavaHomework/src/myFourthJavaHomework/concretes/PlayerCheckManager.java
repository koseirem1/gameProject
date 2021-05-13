package myFourthJavaHomework.concretes;

import myFourthJavaHomework.abstracts.PlayerCheckService;
import myFourthJavaHomework.entities.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}

}
