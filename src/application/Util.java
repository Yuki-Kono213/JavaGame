package application;

import java.util.ArrayList;
import java.util.List;

public class Util{

	public static Job[] jobList = {new Fighter(), new Wizard()};
	
	public static String[] nameList = {"フェデ","シャナ"};
	
	public static List<Magic> magicList = new ArrayList<Magic>();

	public Util() {
		
	}
	
	public static void InitializeUtil() {
		magicList.add(new Magic("魔法の矢",10,15,0,0,0));
	}

}