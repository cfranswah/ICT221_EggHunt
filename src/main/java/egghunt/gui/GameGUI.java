package egghunt.gui;

import egghunt.engine.GameEngine;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.image.Image;




/**
 * GUI for the Maze Runner Game.
 *
 * NOTE: Do NOT run this class directly in IntelliJ - run 'RunGame' instead.
 */
public class GameGUI extends Application {
    // TODO: move this to Controller class if you use FXML...
    private GameEngine engine = new GameEngine(10);

    @Override
    public void start(Stage primaryStage) throws Exception {
                Button btnLeft = new Button("Left");
                btnLeft.setFont(Font.font("Times New Roman"));
                Button btnRight = new Button("Right");
                btnRight.setFont(Font.font("Times New Roman"));
                Button btnUp = new Button("Up");
                btnUp.setFont(Font.font("Times New Roman"));
                Button btnDown = new Button("Down");
                btnDown.setFont(Font.font("Times New Roman"));
                Button btnHelp = new Button("Help");
                Button btnSave = new Button("Save");
                Button btnLoad  = new Button("Load");
                HBox hbox = new HBox(10, btnLeft, btnRight, btnUp, btnDown);
                hbox.setAlignment(Pos.CENTER);

                btnLeft.setOnAction(e -> {
                    System.out.println("Left button clicked");
                    // Perform left button action
                });

                btnRight.setOnAction(e -> {
                    System.out.println("Right button clicked");
                    // Perform right button action
                });

                btnUp.setOnAction(e -> {
                    System.out.println("Up button clicked");
                    // Perform up button action
                });

                btnDown.setOnAction(e -> {
                    System.out.println("Down button clicked");
                    // Perform down button action
                });

                btnSave.setOnAction(event -> {
                System.out.println("Game saved");

    });
        btnLoad.setOnAction(event -> {
            System.out.println("Game loaded");

        });
        btnHelp.setOnAction(event -> {
            System.out.println("1.\tThe player can move in 4 directions: left, right, up, and down inside the map. Each movement is considered as 1 step.\n" +
                    "2.\tVisiting an egg collects 1 egg. The egg is picked up, and the cell becomes empty.\n" +
                    "3.\tVisiting a key collects 1 key. The key is picked up, and the cell becomes empty. The number of keys that the player has increases by 1.\n" +
                    "4.\tThe player can only move into a lock when the play has one or more keys. Once moving into a lock, one key is consumed. As a result, the number of keys that the player has decreases by 1 and the lock in the cell disappears (empty cell). \n" +
                    "5.\tThe game finishes when \n" +
                    "•\t(Win) The player collects all 5 eggs and is at the exit cell. The score is: (time limit – steps of the player).\n" +
                    "•\t(Lose) The time limit has reached. The score is -1.\n" +
                    "6.\tThe score is shown at the end of a game.\n");

        });

                Scene scene = new Scene(hbox, 400, 200);
                primaryStage.setScene(scene);
                primaryStage.setTitle("Button Demo");
                primaryStage.show();
            }

            public class ShowImage extends Application {

                @Override
                public void start(Stage primaryStage) throws Exception {
                    GridPane gridPane = new GridPane();

                    // Add image using ImageView to GridPane
                    Image imageE1 = new Image("egg_icon.png");
                    ImageView imageViewE1 = new ImageView(imageE1);
                    gridPane.add(imageViewE1, 3, 0);

                    Image imageE2 = new Image("egg_icon.png");
                    ImageView imageViewE2 = new ImageView(imageE2);
                    gridPane.add(imageViewE2, 5, 2);

                    Image imageE3 = new Image("egg_icon.png");
                    ImageView imageViewE3 = new ImageView(imageE3);
                    gridPane.add(imageViewE3, 2, 6);

                    Image imageE4 = new Image("egg_icon.png");
                    ImageView imageViewE4 = new ImageView(imageE4);
                    gridPane.add(imageViewE4, 7, 10);

                    Image imageE5 = new Image("egg_icon.png");
                    ImageView imageViewE5 = new ImageView(imageE5);
                    gridPane.add(imageViewE5, 10, 1);

                    Image image = new Image("key_icon.png");
                    ImageView imageView2 = new ImageView(image2);
                    gridPane.add(imageView2, 1, 0);

                    Image image3 = new Image("lock_icon.png");
                    ImageView imageView3 = new ImageView(image3);
                    gridPane.add(imageView3, 2, 0);

                    Image image4 = new Image("gate_icon.png");
                    ImageView imageView4 = new ImageView(image4);
                    gridPane.add(imageView4, 0, 0);


                    Scene scene = new Scene(gridPane);
                    primaryStage.setScene(scene);
                    primaryStage.setTitle("Show Image");
                    primaryStage.show();
                }


                /**
                 * In IntelliJ, do NOT run this method.  Run 'RunGame.main()' instead.
                 */
                public static void main(String[] args) {
                }
            }
