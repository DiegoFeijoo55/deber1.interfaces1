package application;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MyLayout extends BorderPane {

    public MyLayout() {
        this.setPadding(new Insets(30, 30, 10, 10));

        VBox leftPanel = new VBox();
        leftPanel.setAlignment(Pos.TOP_LEFT);
        leftPanel.setSpacing(40);

        HBox item1 = createItem("Diego Feijoo", "media/diego.jpg");
        HBox item2 = createItem("Travis Scott", "media/travis.jpg");
        HBox item3 = createItem("Metro Boomin", "media/metro.jpg");
        HBox item4 = createItem("Eladio Carrion", "media/eladio.jpg");

        leftPanel.getChildren().addAll(item1, item2, item3, item4);

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("1", "2", "3", "4");
        listView.setMaxHeight(900);

        TextField textField = new TextField();
        textField.setPrefSize(70, 50);

        VBox rightPanel = new VBox(listView, textField);
        rightPanel.setSpacing(10);
        rightPanel.setPadding(new Insets(0, 20, 0, 0));

        this.setLeft(leftPanel);
        this.setRight(rightPanel);
    }

    private HBox createItem(String name, String imageName) {
        Label nameLabel = new Label(name);

        Image image = new Image(getClass().getResourceAsStream(imageName));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(80);
        imageView.setFitHeight(80);

        HBox hbox = new HBox(imageView, nameLabel);
        hbox.setAlignment(Pos.CENTER_LEFT);
        hbox.setSpacing(10);

        return hbox;
    }
}