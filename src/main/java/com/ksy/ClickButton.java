package com.ksy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ClickButton extends Application {
    private Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FileInputStream input = new FileInputStream("C:/Users/ksy_ke/IdeaProjects/Magic8Ball/src/main/java/resources/image/ball.png");
        Image image = new Image(input);

        primaryStage.setTitle("Sample");
        button = new Button("click");
        button.setWrapText(true);

        BorderPane pane = new BorderPane();

        button.setStyle("-fx-background-radius: 120; " +
                "-fx-min-width: 120px; " +
                "-fx-min-height: 120px; " +
                "-fx-max-width: 120px; " +
                "-fx-max-height: 120px;" +
                "-fx-base: #191529;" +
                "-fx-text-alignment: CENTER;");
        button.setOnAction(event -> button.setText(Answer.getAny().toString()));

        pane.setCenter(button);

        BackgroundImage bgImg = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        pane.setBackground(new Background(bgImg));

        Scene scene = new Scene(pane, 340, 340);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
