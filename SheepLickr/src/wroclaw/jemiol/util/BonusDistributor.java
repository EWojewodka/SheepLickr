package wroclaw.jemiol.util;

import java.io.FileNotFoundException;

import org.json.JSONException;

import wroclaw.jemiol.entity.SheepEntity;
import wroclaw.jemiol.entity.Shepherd;
import wroclaw.jemiol.enums.SheepBonusGift;
import wroclaw.jemiol.manager.GameManager;

public class BonusDistributor {

	//TODO
	public static void getSheepBonus(SheepEntity sheep) {
		SheepBonusGift bonus = sheep.getBonus();
		if(bonus == SheepBonusGift.NOTHING) {
		
		} else if(bonus == SheepBonusGift.SUPER_GOLD) {
			GameManager.getInstance().getPlayerManager().getPlayer().setScore(SheepBonusGift.SUPER_GOLD.getGold());
		} else if(bonus == SheepBonusGift.BONUS_SHEPHERD) {
			try {
				GameManager.getInstance().getPlayerManager().getPlayer().getPlayerShepherd().add(new Shepherd());
			} catch (JSONException | FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
