package application;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Pagination;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class Bibliotheque extends Application {

	public void start(Stage primaryStage){
	try {
		
		Group root = new Group();
		//Group root2 = new Group();
		Scene scene = new Scene(root, 600,700);
		
		Label la = new Label("Catalogue");
		la.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		la.setLayoutX(30);
		la.setLayoutY(20);
		Label la1 = new Label("Recherche");
		la1.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		la1.setLayoutX(60);
		la1.setLayoutY(60);
		
		RadioButton ra1 = new RadioButton("Par Thème");
		ra1.setLayoutX(70);
		ra1.setLayoutY(85);
		RadioButton ra2 = new RadioButton("Par Titre");
		ra2.setLayoutX(70);
		ra2.setLayoutY(105);
		RadioButton ra3 = new RadioButton("Par Auteur");
		ra3.setLayoutX(70);
		ra3.setLayoutY(125);
		
		ToggleGroup tg = new ToggleGroup();
		ra1.setToggleGroup(tg);
		ra2.setToggleGroup(tg);
		ra3.setToggleGroup(tg);
		ra1.setSelected(true);
		
		Label la2 = new Label("Thèmes");
		la2.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		la2.setLayoutX(60);
		la2.setLayoutY(285);
		
		CheckBox ch = new CheckBox("Littérature");
		ch.setLayoutX(70);
		ch.setLayoutY(310);
		CheckBox ch1 = new CheckBox("Education");
		ch1.setLayoutX(70);
		ch1.setLayoutY(330);
		CheckBox ch2 = new CheckBox("Loisir");
		ch2.setLayoutX(70);
		ch2.setLayoutY(350);
		
		TextField te = new TextField();
		te.setLayoutX(60);
		te.setLayoutY(450);
		te.setText("Text Box");
		
		Button bu = new Button("Filtrer");
		bu.setLayoutX(60);
		bu.setLayoutY(480);
		Button bu1 = new Button("Tout afficher");
		bu1.setLayoutX(126);
		bu1.setLayoutY(480);
		
		Label la3 = new Label("Liste Bibliothèques");
		la3.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		la3.setLayoutX(30);
		la3.setLayoutY(580);
		
		Label la4 = new Label("Livres");
		la4.setFont(Font.font("Verdana", FontWeight.BOLD,  30));
		la4.setLayoutX(330);
		la4.setLayoutY(50);
		
		Label la5 = new Label("Localisation");
		la5.setFont(Font.font("Verdana", FontWeight.BOLD,  30));
		la5.setLayoutX(330);
		la5.setLayoutY(460);
		
		Label la6 = new Label("Bibliothèque 1");
		la6.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		la6.setLayoutX(330);
		la6.setLayoutY(510);
		
		TextField te1 = new TextField();
		te1.setLayoutX(330);
		te1.setLayoutY(540);
		te1.setText("Auteur - Titre Livre - Date de Parution");
		
		Label la7 = new Label("Bibliothèque 2");
		la7.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		la7.setLayoutX(330);
		la7.setLayoutY(610);
		
		TextField te2 = new TextField();
		te2.setLayoutX(330);
		te2.setLayoutY(640);
		te2.setText("Auteur - Titre Livre - Date de Parution");
		
		root.getChildren().addAll(la, la1, ra1, ra2, ra3, la2, ch, ch1, ch2, te, bu, bu1, la3, la4, la5, la6, la7, te1, te2);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Bibliothèque");
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		launch(args);
	}
		
	}