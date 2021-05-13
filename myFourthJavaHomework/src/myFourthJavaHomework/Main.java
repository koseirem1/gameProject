package myFourthJavaHomework;

import java.time.LocalDate;
import myFourthJavaHomework.adapters.MernisServiceAdapter;
import myFourthJavaHomework.concretes.GameSellManager;
import myFourthJavaHomework.concretes.PlayerManager;
import myFourthJavaHomework.entities.Campaign;
import myFourthJavaHomework.entities.GameSell;
import myFourthJavaHomework.entities.Player;

public class Main {

	public static void main(String[] args) {
		PlayerManager player = new PlayerManager(new MernisServiceAdapter());
		player.add(new Player(1, "Irem", "Ilhan", "123456789101", LocalDate.of(1995, 5, 20)));
		
		GameSell game = new GameSell(1, "Sims 3", 300);
		Campaign campaign = new Campaign(1, "Bayram Ýndirimi", 75);
		GameSellManager gameManager = new GameSellManager();
		gameManager.campaignGames(game, campaign);
		gameManager.sellGame(new Player(1, "Fatih", "Ilhan", "123456789101", LocalDate.of(1993,4,21)), game);
		

	}

}
