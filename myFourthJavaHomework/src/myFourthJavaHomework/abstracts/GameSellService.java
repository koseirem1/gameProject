package myFourthJavaHomework.abstracts;

import myFourthJavaHomework.entities.Campaign;
import myFourthJavaHomework.entities.GameSell;
import myFourthJavaHomework.entities.Player;

public interface GameSellService {
	
	void sellGame(Player player, GameSell game);
	void campaignGames(GameSell game, Campaign campaign);
}
