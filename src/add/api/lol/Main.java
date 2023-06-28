package add.api.lol;

import add.api.lol.mapeo.ChampionMastery;

public class Main {

	public static void main(String[] args) {
		String summoner_name = "Entamoeba";
		String api_key = "RGAPI-4bf430de-c095-485b-b024-d73110573141";
		
//		int nivel = OperacionesAPI.getLevel(summoner_name, api_key);
//		System.out.println("Nivel: " + nivel);
		
		String summoner_id = OperacionesAPI.getEncryptedSummonerId(summoner_name, api_key);
		ChampionMastery[] champions = OperacionesAPI.getChampionMastery(summoner_id, api_key);
		
		for(int i = 0; i < champions.length; i++) {
			ChampionMastery champion = champions[i];
			
			long id = champion.getChampionId();
			int level = champion.getChampionLevel();
			boolean cofre = champion.getChestGranted();
			
			System.out.print("Tengo nivel " + level + " con el campeon " + id + " -> ");
			if(cofre) {
				System.out.print("Cofre disponible");
			}
			else {
				System.out.print("Cofre no disponible");
			}
			System.out.println();
		}
	}

}
