import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader {

    public static void main(String[] args) {
        // Provide the path to your image file
        String imagePath = "D:\\welcome image.jpg";

        try {
            // Read the image file
            BufferedImage image = ImageIO.read(new File("D:\\welcome image.jpg"));

            // Display some information about the image
            int width = image.getWidth();
            int height = image.getHeight();
            int type = image.getType();

            System.out.println("Image Information:");
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
            System.out.println("Image Type: " + type);

            // You can perform further operations with the 'image' object as needed

        } catch (IOException e) {
            // Handle exception if the image file cannot be read
            e.printStackTrace();
        }
    }
}
