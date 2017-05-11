package wroclaw.jemiol.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import org.json.*;

import wroclaw.jemiol.enums.Gender;
import wroclaw.jemiol.enums.Powers;
import wroclaw.jemiol.enums.Religion;
import wroclaw.jemiol.enums.SheepBonusGift;

public class RandomVar {

	public static Gender getRandomGender() {
		return Math.random() < 0.5 ? Gender.FEMALE : Gender.MALE;
	}

	public static SheepBonusGift getRandomBonusSheep() {
		double ratio = Math.random();
		if (ratio <= 0.7) {
			return SheepBonusGift.NOTHING;
		} else if (ratio < 0.8 && ratio > 0.7) {
			return SheepBonusGift.SUPER_GOLD;
		} else if (ratio < 0.90 && ratio > 0.8) {
			return SheepBonusGift.COOLDOWN_REDUCTION;
		} else if (ratio < 0.95 && ratio > 0.90) {
			return SheepBonusGift.DOUBLE_MOUSE;
		} else {
			return SheepBonusGift.BONUS_SHEPHERD;
		}
	}

	public static Set<Powers> getRandomPowers() {
		Set<Powers> powerList = new HashSet<>();
		for (int i = 0; i < 3; i++) {
			double ratio = Math.random();
			if (ratio >= 0.5 && ratio < 0.7) {
				powerList.add(Powers.FAST_HAND);
			} else if (ratio >= 0.7 && ratio < 0.8) {
				powerList.add(Powers.HAIRCUT);
			} else if (ratio >= 0.8 && ratio < 0.87) {
				powerList.add(Powers.SHEEP_FRIENDLY);
			} else if (ratio >= 0.87 && ratio < 0.93) {
				powerList.add(Powers.STRONGMAN);
			} else if (ratio >= 0.93 && ratio <= 0.95) {
				powerList.add(Powers.BOSS);
			}
		}
		return powerList;
	}

	public static Religion getRandomReligion() {
		double ratio = Math.random();
		if (ratio < 0.33) {
			return Religion.INNOS;
		} else if (ratio >= 0.33 && ratio < 0.66) {
			return Religion.ADANOS;
		} else {
			return Religion.BELIAR;
		}
	}

	public static int getRandomInt() {
		return (int) Math.random() * 100;
	}

	public static int getRandomIntBetween(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

	public static String getRandomFemaleName() throws JSONException, FileNotFoundException {
		String url = "src/resources/FemaleNames.json";
		JSONObject obj = new JSONObject(new JSONTokener(new FileInputStream(new File(url).getAbsolutePath())));
		JSONArray arr = obj.getJSONArray("names");
		return arr.getString(getRandomIntBetween(0, arr.length()));
	}

	public static String getRandomMaleName() throws JSONException, FileNotFoundException {
		String url = "src/resources/MaleNames.json";
		JSONObject obj = new JSONObject(new JSONTokener(new FileInputStream(new File(url).getAbsolutePath())));
		JSONArray arr = obj.getJSONArray("names");
		return arr.getString(getRandomIntBetween(0, arr.length()));
	}
}
