package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PersonController {

	@FXML
	private Label labelName;
	@FXML
	private Label labelLevel;
	@FXML
	private Label labelJob;
    @FXML
	private Label labelLifePoint;
	@FXML
	private Label labelSkillPower;
	@FXML
	private Label labelSTR;
	@FXML
	private Label labelCON;
	@FXML
	private Label labelDEX;
	@FXML
	private Label labelAGI;
	@FXML
	private Label labelLUC;
	@FXML
	private Label labelMAG;
	@FXML
	private Label labelMEN;
	@FXML
	private Label labelHP;
	@FXML
	private Label labelSP;
	@FXML
	private Label labelATK;
	@FXML
	private Label labelDEF;
	@FXML
	private Label labelHIT;
	@FXML
	private Label labelAVO;
	@FXML
	private Label labelCRI;
	@FXML
	private Label labelMAT;
	@FXML
	private Label labelMDF;
	@FXML
	private Label labelWeapon;
	@FXML
	private Label labelArmor;
	@FXML
	private Label labelSub;
	@FXML
	private Label labelEqu1;
	@FXML
	private Label labelEqu2;
	
	public void SetTable(Person newVal) {


				labelName.setText("名前" + newVal.name);
				
				labelLevel.setText("レベル" + String.valueOf(newVal.level));
				
				labelJob.setText("職業" + newVal.job.name);
			    
				labelLifePoint.setText("耐久"+String.valueOf(newVal.hp + newVal.job.baseHp));
				
				labelSkillPower.setText("技力" +String.valueOf(newVal.sp + newVal.job.baseSp));
				
				labelSTR.setText("腕力" + String.valueOf(newVal.atk + newVal.job.baseAtk));
				
				labelCON.setText("頑強" + String.valueOf(newVal.def + newVal.job.baseDef));
				
				labelDEX.setText("技量" + String.valueOf(newVal.skl + newVal.job.baseSkl));
				
				labelAGI.setText("速度" + String.valueOf(newVal.spd + newVal.job.baseSpd));
				
				labelLUC.setText("幸運" + String.valueOf(newVal.luc + newVal.job.baseLuc));
				
				labelMAG.setText("魔力" + String.valueOf(newVal.mat + newVal.job.baseMat));
				
				labelMEN.setText("精神" + String.valueOf(newVal.mdf + newVal.job.baseMdf));
				
				labelHP.setText("HP  " +String.valueOf(newVal.getHP()));
				
				labelSP.setText("SP  " + String.valueOf(newVal.getSP()));
				
				labelATK.setText("攻撃" + String.valueOf(newVal.getATK()));
				
				labelDEF.setText("防御" + String.valueOf(newVal.getDEF()));
				
				labelHIT.setText("命中" + String.valueOf(newVal.getHit()));
				
				labelAVO.setText("回避" + String.valueOf(newVal.getAvo()));
				
				labelCRI.setText("必殺" + String.valueOf(newVal.getLUC()));
				
				labelMAT.setText("魔攻" + String.valueOf(newVal.getMAT()));
				
				labelMDF.setText("魔防" + String.valueOf(newVal.getMDF()));
				
				labelWeapon.setText(newVal.weapon.name);
				
				labelArmor.setText(newVal.armor.name);
				
				labelSub.setText(newVal.sub.name);
				
				labelEqu1.setText(newVal.equip1.name);
				
				labelEqu2.setText(newVal.equip2.name);
				
				Main.mainStage.hide();
        
	}

}
