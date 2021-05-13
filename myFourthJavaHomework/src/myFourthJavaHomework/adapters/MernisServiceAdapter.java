package myFourthJavaHomework.adapters;

import myFourthJavaHomework.abstracts.PlayerCheckService;
import myFourthJavaHomework.entities.Player;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		System.out.println("Mernis kontrolü yapýldý " + player.getFirstName());
		return true;
	}

}
