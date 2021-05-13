package myFourthJavaHomework.concretes;

import myFourthJavaHomework.abstracts.PlayerCheckService;
import myFourthJavaHomework.abstracts.PlayerService;
import myFourthJavaHomework.entities.Player;

public class PlayerManager implements PlayerService {
	
	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " succesfully added.");
		} else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println("player updated");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("player deleted");
		
	}


}
