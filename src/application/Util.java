package application;

import java.util.ArrayList;
import java.util.List;

public class Util{

	public static Job[] jobList = {new Job(), new Fighter(), new Wizard()};
	
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
		weaponList.add(new Weapon("なし",0,0,0,0,100,0,0,0,0));
		weaponList.add(new Weapon("銅の剣",0,0,15,0,100,10,0,0,0));
		weaponList.add(new Weapon("銅の槍",0,0,20,5,90,0,0,0,0));
		weaponList.add(new Weapon("銅の斧",0,0,25,0,80,0,0,0,0));
		armorList.add(new Armor("なし",0,0,0,0,0,0,0,0,0));
		armorList.add(new Armor("布の服",10,0,0,10,0,5,0,0,0));
		subList.add(new Sub("なし",0,0,0,0,0,0,0,0,0));
		equipList.add(new Equip("なし",0,0,0,0,0,0,0,0,0));
	}

}