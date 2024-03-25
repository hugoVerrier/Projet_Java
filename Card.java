package Projet_Java;


import java.util.Map;
import java.util.HashMap;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Card extends Pane {
    public int id;
    public String name;
    private int mana;
    private int attaque;
    private int pv;
    private Boolean visible;
    private Map<String, Boolean> pouvoir;
    private String imagePath;
    private ImageView imageView;

    public Card(int id, String name, int mana, int attaque, int pv, Boolean visible, String pouvoir, String imagePath) {
        this.id = id;
        this.name = name;
        this.mana = mana;
        this.attaque = attaque;
        this.pv = pv;
        this.visible = visible;
        this.pouvoir = new HashMap<>();
        this.imagePath = imagePath;
        this.imageView = new ImageView(new Image(imagePath));
        this.getChildren().add(imageView);
    }
}
