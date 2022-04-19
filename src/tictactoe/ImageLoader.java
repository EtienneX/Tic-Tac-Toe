package tictactoe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {
    static Image ImgX, ImgO;
    public ImageLoader(){
        try {
            ImgX = ImageIO.read(new File("res/x.png"));
            ImgO = ImageIO.read(new File("res/o.png"));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
