package wroclaw.jemiol.bonus;

import java.io.FileNotFoundException;

import org.json.JSONException;

import wroclaw.jemiol.entity.Shepherd;
import wroclaw.jemiol.manager.GameManager;

public class AddShepherd {

	public AddShepherd() {
		try {
			GameManager.getInstance().getPlayerManager().getPlayer().getPlayerShepherd().add(new Shepherd());
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
