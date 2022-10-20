package application;

import java.util.ArrayList;

public class Person {

    public String name;
    public Job job;
    public int level;
    public int hp;
    public int sp;
    public int hpDamage;
    public int spDamage;
    public int atk;
    public int def;
    public int skl;
    public int spd;
    public int luc;
    public int mat;
    public int mdf;
    public ArrayList<Magic> useMagicList = new ArrayList<>();
    
    public Weapon weapon = Util.weaponList.get(0);
    public Armor armor = Util.armorList.get(1);
    public Sub sub = Util.subList.get(0);
    public Equip equip1 = Util.equipList.get(0);
    public Equip equip2 = Util.equipList.get(0);

    
    public Person(String name, int level, Job job, int hp, int sp, int atk, int def, int skl, int spd, int luc, int mat, int mdf){
        this.name = name;
        this.level = level;
        this.job = job;
        this.hp = hp;
        this.sp = sp;
        this.atk = atk;
        this.def = def;
        this.skl = skl;
        this.spd = spd;
        this.luc = luc;
        this.mat = mat;
        this.mdf = mdf;
    }

    public int HPCalc(){
        return this.hp + this.job.baseHp + this.weapon.hp + this.armor.hp + 
        		this.sub.hp + this.equip1.hp +  this.equip2.hp	- this.hpDamage;
    }
    public int SPCalc(){
        return this.sp + this.job.baseSp + this.weapon.sp + this.armor.sp + 
        		this.sub.sp + this.equip1.sp +  this.equip2.sp - this.spDamage;
    }
    public int ATKCalc(){
        return this.atk + this.job.baseAtk+ this.weapon.atk + this.armor.atk + 
        		this.sub.atk + this.equip1.atk +  this.equip2.atk;
    }
    public int DEFCalc(){
        return this.def + this.job.baseDef+ this.weapon.def + this.armor.def + 
        		this.sub.def + this.equip1.def +  this.equip2.def;
    }
    public int SKLCalc(){
        return this.skl + this.job.baseSkl+ this.weapon.skl + this.armor.skl + 
        		this.sub.skl + this.equip1.skl +  this.equip2.skl;
    }
    public int SPDCalc(){
        return this.spd + this.job.baseSpd+ this.weapon.spd + this.armor.spd + 
        		this.sub.spd + this.equip1.spd +  this.equip2.spd;
    }
    public int LUCCalc(){
        return this.luc + this.job.baseLuc+ this.weapon.luc + this.armor.luc + 
        		this.sub.luc + this.equip1.luc +  this.equip2.luc;
    }
    public int MATCalc(){
        return this.mat + this.job.baseMat+ this.weapon.mat + this.armor.mat + 
        		this.sub.mat + this.equip1.mat +  this.equip2.mat;
    }
    public int MDFCalc(){
        return this.mdf + this.job.baseMdf+ this.weapon.mdf + this.armor.mdf + 
        		this.sub.mdf + this.equip1.mdf +  this.equip2.mdf;
    }
    public void DispParameter(){
        System.out.println("名前:" + this.name);
        System.out.println("LV:" + this.level);
        System.out.println("HP:" + HPCalc());
        System.out.println("SP:" + SPCalc());
        System.out.println("ATK:" + ATKCalc());
        System.out.println("DEF:" + DEFCalc());
        System.out.println("SKL:" + SKLCalc());
        System.out.println("SPD:" + SPDCalc());
        System.out.println("LUC:" + LUCCalc());
        System.out.println("MAT:" + MATCalc());
        System.out.println("MDF:" + MDFCalc());
    }

    public int DamageCalc(Person enemy){
        enemy.hpDamage += (this.ATKCalc() - enemy.DEFCalc());
        return (this.ATKCalc() - enemy.DEFCalc());
    }


    public void Attack(Person enemy){
        System.out.println(this.name + "の攻撃！" + enemy.name + "は" + this.DamageCalc(enemy) +"のダメージを受けた！");
    }
    

	  public String getName(){ return this.name; }
	  public void setName(String name){ this.name = name; }
	  
	  public String getJob(){ return this.job.name; }
	  public void setJob(Job job){ this.job= job; }

	  public Integer getLevel(){ return this.level; }
	  public void setLevel(Integer level){ this.level = level; }

	  
	  public Integer getHP(){ return HPCalc(); }
	  public void setHP(Integer hp){ this.hp = hp; }

	  public Integer getSP(){ return SPCalc(); }
	  public void setSP(Integer sp){ this.sp = sp; }

	  public Integer getATK(){ return ATKCalc(); }
	  public void setATK(Integer atk){ this.atk = atk; }

	  public Integer getDEF(){ return DEFCalc(); }
	  public void setDEF(Integer def){ this.def = def; }

	  public Integer getSKL(){ return SKLCalc(); }
	  public void setSKL(Integer skl){ this.skl = skl; }

	  public Integer getSPD(){ return SPDCalc(); }
	  public void setSPD(Integer spd){ this.spd = spd; }

	  public Integer getLUC(){ return LUCCalc(); }
	  public void setLUC(Integer luc){ this.luc = luc; }

	  public Integer getMAT(){ return MATCalc(); }
	  public void setMAT(Integer mat){ this.mat = mat; }

	  public Integer getMDF(){ return MDFCalc(); }
	  public void setMDF(Integer mdf){ this.mdf = mdf; }
}
