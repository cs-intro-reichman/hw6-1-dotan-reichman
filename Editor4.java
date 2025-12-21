
import java.awt.Color;

public class Editor4 {

    public static void main(String[] args) {
        String filename = args[0];
        int x = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(filename);
        Color[][] targetImage = Runigram.read(filename);
        Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage, Runigram.grayScaled(targetImage), x);

    }
}