import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {

    /**
     * Called once at the beginning of execution, put your size all in this method
     */
    public void settings() {
        size(400, 400);
    }

    /**
     * Called once at the beginning of execution. Add initial set up
     * values here i.e background, stroke, fill etc.
     */
    public void setup() {
        background(255, 255, 255);
    }

    Random myRandom = new Random();

    /**
     * Called repeatedly, anything drawn to the screen goes here
     */
    public void draw() {
        drawEmoji(100, 100, 50);
        drawEmoji(300, 300, 80);
        drawEmoji(200, 200, 65);
        drawEmoji(100, 300, 80);
        drawEmoji(300, 100, 50);
    }
    private void drawEmoji(float positionX, float positionY, float size) {
        // Circle
        fill(myRandom.nextInt(255), myRandom.nextInt(255), myRandom.nextInt(255));
        ellipse(positionX, positionY, size, size);
        
        // Smile
        fill(255);
        float smileWidth = size * 0.5f;
        float smileX = positionX - smileWidth * 0.5f;
        float smileY = positionY + size * 0.25f;
        rect(smileX, smileY, smileWidth, size * 0.1f);
        
        // Eyes
        float eyeY = positionY - size * 0.2f;
        ellipse(positionX, eyeY, size * 0.2f, size * 0.3f);
        ellipse(positionX, eyeY, size * 0.2f, size * 0.3f);
       
    }

    /**
     * A display of emojis with flashing colours using methods 
     * 
     * @param positionX: Impacts x-coordinate of the emoji
     * @param positionY: Impacts Y-coordinate of the emoji
     * @param size: Impacts size of the emoji
     * @return
     * @author: E. Sen
     */

}