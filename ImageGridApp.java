package progexec;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane layout
        GridPane gridPane = new GridPane();

        // Load images (ensure images are in the same folder as your project or provide full path)
        Image image1 = new Image("file:resources/image1.jpg"); // Use the correct path
        Image image2 = new Image("file:resources/image2.jpg");
        Image image3 = new Image("file:resources/image3.jpg");
        Image image4 = new Image("file:resources/image4.jpg");

        // Create ImageView objects for each image
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        // Adjust image size if necessary
        imageView1.setFitWidth(200);
        imageView1.setFitHeight(200);
        imageView2.setFitWidth(200);
        imageView2.setFitHeight(200);
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(200);
        imageView4.setFitWidth(200);
        imageView4.setFitHeight(200);

        // Add ImageViews to the GridPane
        gridPane.add(imageView1, 0, 0);  // Add image1 at row 0, column 0
        gridPane.add(imageView2, 1, 0);  // Add image2 at row 0, column 1
        gridPane.add(imageView3, 0, 1);  // Add image3 at row 1, column 0
        gridPane.add(imageView4, 1, 1);  // Add image4 at row 1, column 1

        // Create a Scene and set it on the stage
        Scene scene = new Scene(gridPane, 500, 500); // Set the scene size
        primaryStage.setTitle("Image Grid Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
