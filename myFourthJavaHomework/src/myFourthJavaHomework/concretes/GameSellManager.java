package myFourthJavaHomework.concretes;

import myFourthJavaHomework.abstracts.GameSellService;
import myFourthJavaHomework.entities.Campaign;
import myFourthJavaHomework.entities.GameSell;
import myFourthJavaHomework.entities.Player;

public class GameSellManager implements GameSellService{

	@Override
	public void sellGame(Player player, GameSell game) {
		System.out.println("Tebrikler! " + player.getFirstName() + " " + game.getName() + " oyununu baþarýyla satýn aldýnýz" );
		
	}

	@Override
	public void campaignGames(GameSell game, Campaign campaign) {
		System.out.println( game.getName() + " oyunu  % " + campaign.getDiscount() + " indirimdedir. Kaçýrmayýn !!" );
		
	}




}
