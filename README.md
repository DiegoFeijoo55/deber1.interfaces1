# Interfaces Layout con Eclipse 💻

Esta aplicación muestra una interfaz gráfica simple utilizando JavaFX. La interfaz consta de dos paneles: uno a la izquierda que muestra una lista de nombres con imágenes asociadas, y otro a la derecha que contiene una lista desplegable y un campo de texto.
### Requisitos para ejecutar el programa
- Java Development Kit (JDK) instalado en tu máquina
- eclipse IDE
- libreria de JavaFX

### Características
- Diseño personalizado con JavaFX.
- Uso de imágenes (ImageView) y texto (Label) en el diseño.
- Interacción con un ListView y un TextField.

### Estructura del Proyecto
El proyecto está estructurado en dos clases principales:

- **Main.java:** Esta clase inicia la aplicación JavaFX y configura la ventana principal (Stage). Se crea una instancia de MyLayout y se establece como la escena principal.

```java
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        MyLayout myLayout = new MyLayout();
        primaryStage.setTitle("Interfaz layout");
        primaryStage.setScene(new Scene(myLayout, 500, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

- **MyLayout.java:** Esta clase extiende BorderPane y define la estructura y el contenido de la interfaz gráfica. Contiene un panel de la izquierda (VBox) con una lista de nombres e imágenes, y un panel de la derecha (VBox) con una lista desplegable y un campo de texto.

```java
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
```

### Ejecución
Para ejecutar la aplicación, se utiliza el método **main** en la clase **Main.java.** Se pueden agregar más elementos a la lista de la izquierda y modificar el contenido del panel derecho según sea necesario.

![image](https://github.com/DiegoFeijoo55/deber1.interfaces1/assets/169406880/1bab2bcd-2240-4089-9253-dde2ceb3fa7c)
