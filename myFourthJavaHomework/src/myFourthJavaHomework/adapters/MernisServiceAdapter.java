package myFourthJavaHomework.adapters;

import myFourthJavaHomework.abstracts.PlayerCheckService;
import myFourthJavaHomework.entities.Player;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		System.out.println("Mernis kontrol� yap�ld� " + player.getFirstName());
		return true;
	}

}
