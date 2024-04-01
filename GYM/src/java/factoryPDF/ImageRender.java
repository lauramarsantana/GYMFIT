/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryPDF;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author carla
 */
public class ImageRender {
    public BufferedImage loadImage(String imagePath) throws IOException {
        return ImageIO.read(new File(imagePath));
    }
}
