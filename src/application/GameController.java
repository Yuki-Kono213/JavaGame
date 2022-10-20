package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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
		
		tablePerson.getItems().add(new Person(Util.nameList[0],1,Util.jobList[1],100,50,25,20,20,25,50,10,15));
		
		tablePerson.getItems().add(new Person(Util.nameList[1],1,Util.jobList[2],80,60,15,10,30,20,45,25,20));
		
		tablePerson.getSelectionModel().selectedItemProperty().addListener((observable, oldVal, newVal) ->
        {
			try {
				if(newVal.name != "") {
					//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Person.fxml"));
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Person.fxml"));
					BorderPane root = (BorderPane) fxmlLoader.load();
			        //sc2 = new Scene(root2);
					Scene scene = new Scene(root,600,600);
		            PersonController pc = (PersonController) fxmlLoader.getController();
					Stage stage = new Stage();
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					stage.setScene(scene);
					pc.SetTable(newVal);
					stage.show();
				    stage.setOnCloseRequest(event -> saveStatus());
				}
				

			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
        });
        
	}
	
	private void saveStatus() {
		Main.mainStage.show();
	}

}
