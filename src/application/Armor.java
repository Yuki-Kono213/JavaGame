package application;

public class Armor extends Item {
    
    public Armor(String name, int hp, int sp, int atk, int def, int skl, int spd, int luc, int mat, int mdf){
        this.name = name;
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
}
