package pack.model;

import java.util.ArrayList;

public class HobbyModel {
	private static HobbyModel model = new HobbyModel();
	
	public static HobbyModel getInstance() {
		return model;
	}
	
	public ArrayList<String> getHobby(String hobby) {
		ArrayList<String> list = new ArrayList<String>();
		
		if(hobby.equals("m")) {
			list.add("설악산");
			list.add("지리산");
		} else if(hobby.equals("p")) {
			list.add("웹");
			list.add("인사관리");
		} else if(hobby.equals("t")) {
			list.add("남해안");
		} else if(hobby.equals("s")) {
			list.add("수영장");
		}
		
		return list;
	}
}