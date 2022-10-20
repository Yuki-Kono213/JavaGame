package application;

import java.util.ArrayList;
import java.util.List;

public class Util{

	public static Job[] jobList = {new Fighter(), new Wizard()};
	
	public static String[] nameList = {"フェデ","シャナ"};
	
	public static List<Magic> magicList = new ArrayList<Magic>();
	public static List<Weapon> weaponList = new ArrayList<Weapon>();
	public static List<Armor> armorList = new ArrayList<Armor>();
	public static List<Sub> subList = new ArrayList<Sub>();
	public static List<Equip> equipList = new ArrayList<Equip>();

	public Util() {
		
	}
	
	public static void InitializeUtil() {
		magicList.add(new Magic("魔法の矢",10,15,0,0,0));
		weaponList.add(new Weapon("なし",0,0,0,0,0,0,0,0,0));
		armorList.add(new Armor("なし",0,0,0,0,0,0,0,0,0));
		subList.add(new Sub("なし",0,0,0,0,0,0,0,0,0));
		equipList.add(new Equip("なし",0,0,0,0,0,0,0,0,0));
	}

}