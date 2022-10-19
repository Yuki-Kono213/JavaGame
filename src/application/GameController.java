package application;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class GameController {

	@FXML
	private TableView <Person> tablePerson;
	@FXML
	private TableColumn <Person,String> tableName;
	@FXML
	private TableColumn <Person,Integer> tableLevel;
	@FXML
	private TableColumn <Person,String> tableJob;
	@FXML
	private TableColumn <Person,Integer> tableHP;
	@FXML
	private TableColumn <Person,Integer> tableSP;
	@FXML
	private TableColumn <Person,Integer> tableATK;
	@FXML
	private TableColumn <Person,Integer> tableDEF;
	@FXML
	private TableColumn <Person,Integer> tableSKL;
	@FXML
	private TableColumn <Person,Integer> tableSPD;
	@FXML
	private TableColumn <Person,Integer> tableLUC;
	@FXML
	private TableColumn <Person,Integer> tableMAT;
	@FXML
	private TableColumn <Person,Integer> tableMDF;
	
	public void SetTable() {

		tableName.setCellValueFactory(new PropertyValueFactory<Person, String>("Name"));
		
		tableJob.setCellValueFactory(new PropertyValueFactory<Person, String>("Job"));

		tableLevel.setCellValueFactory(new PropertyValueFactory<Person, Integer>("Level"));
		tableHP.setCellValueFactory(new PropertyValueFactory<Person, Integer>("HP"));
		tableSP.setCellValueFactory(new PropertyValueFactory<Person, Integer>("SP"));
		tableATK.setCellValueFactory(new PropertyValueFactory<Person, Integer>("ATK"));
		tableDEF.setCellValueFactory(new PropertyValueFactory<Person, Integer>("DEF"));
		tableSKL.setCellValueFactory(new PropertyValueFactory<Person, Integer>("SKL"));
		tableSPD.setCellValueFactory(new PropertyValueFactory<Person, Integer>("SPD"));
		tableLUC.setCellValueFactory(new PropertyValueFactory<Person, Integer>("LUC"));
		tableMAT.setCellValueFactory(new PropertyValueFactory<Person, Integer>("MAT"));
		tableMDF.setCellValueFactory(new PropertyValueFactory<Person, Integer>("MDF"));
		
		tablePerson.getItems().clear();
		
		tablePerson.getItems().add(new Person(Util.nameList[0],1, Util.jobList[0],100,50,25,20,20,25,50,10,15));
		
		tablePerson.getItems().add(new Person(Util.nameList[1],1,Util.jobList[1],80,60,15,10,30,20,45,25,20));
	}
}
