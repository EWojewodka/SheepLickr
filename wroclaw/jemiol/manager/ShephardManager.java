package wroclaw.jemiol.manager;

import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;

import wroclaw.jemiol.GUI.ShepherdInformation;
import wroclaw.jemiol.entity.Shepherd;

public class ShephardManager {

	private List<Shepherd> shepherdList;

	public ShephardManager() {
		shepherdList = new ArrayList<>();
		try {
			shepherdList.add(new Shepherd());
		} catch (JSONException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public List<Shepherd> getShepherdList() {
		return shepherdList;
	}

	public void setShepherdList(List<Shepherd> shepherdList) {
		this.shepherdList = shepherdList;
	}

	public ShepherdInformation showShepherdInfo(MouseEvent e) {
		for (Shepherd shepherd : shepherdList) {
			if (shepherd.getShepherdRectangle().contains(e.getX(), e.getY())) {
				return new ShepherdInformation(shepherd);
			}
		}
		return null;
	}
}
