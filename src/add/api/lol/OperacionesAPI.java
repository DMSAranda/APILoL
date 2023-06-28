package add.api.lol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

import add.api.lol.mapeo.ChampionMastery;
import add.api.lol.mapeo.SummonerByName;

public class OperacionesAPI {

//	public static void main(String[] args) {
//		String summoner_name = "Entamoeba";
//		String api_key = "RGAPI-4bf430de-c095-485b-b024-d73110573141";
//		
//		int nivel = getLevel(summoner_name, api_key);
//		System.out.println("Nivel: " + nivel);
//	}

	public static ChampionMastery[] getChampionMastery(String summoner_id, String api_key) {
		String cadenaJson = leerUrl("https://euw1.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/" + summoner_id + "?api_key=" + api_key);

		ChampionMastery[] champions = new Gson().fromJson(cadenaJson, ChampionMastery[].class);
		
		return champions;
	}
	
	public static String getEncryptedSummonerId(String summoner_name, String api_key) {
		String cadenaJson = leerUrl("https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + summoner_name + "?api_key=" + api_key);

		SummonerByName summoner = new Gson().fromJson(cadenaJson, SummonerByName.class);
		
		return summoner.getId();
	}
	
	public static int getLevel(String summoner_name, String api_key) {
		String cadenaJson = leerUrl("https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + summoner_name + "?api_key=" + api_key);

		SummonerByName summoner = new Gson().fromJson(cadenaJson, SummonerByName.class);
		
		return summoner.getSummonerLevel();
	}
	
	private static String leerUrl(String sUrl) {
		String output = "";
		try {
			URL url = new URL(sUrl);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			// conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				// si la respuesta del servidor es distinta al codigo 200 lanzaremos una
				// Exception
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			// creamos un StringBuilder para almacenar la respuesta del web service
			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = br.read()) != -1) {
				sb.append((char) cp);
			}
			// en la cadena output almacenamos toda la respuesta del servidor
			output = sb.toString();
			// System.out.println(output);

			conn.disconnect();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return output;
	}

}
