package application;

import java.util.ArrayList;
import java.util.List;

public class Wizard extends Job {

	public Wizard() {
	    name = "魔法使い";
	
	    baseHp = 10;
	    baseSp = 50;
	    baseAtk = 0;
	    baseDef = 5;
	    baseSkl = 15;
	    baseSpd = 10;
	    baseLuc = 20;
	    baseMat = 20;
	    baseMdf = 15;
	}

    public List<Magic> useMagic(int level)
    {
    	List<Magic> magicList = new ArrayList<>();
    	if(level >= 1) {
    		magicList.add(Util.magicList.stream().filter(s -> s.name == "魔法の矢").findFirst().get());
    	}
    	return magicList;
    }
}