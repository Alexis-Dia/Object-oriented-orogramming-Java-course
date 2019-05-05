package by.bntu.fitr.povt.alexeyd.lab3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;

/**
 * Number of laboratory work is 'Basics of the simplest console I / O in Java. Using Java classes and objects'
 * This programme was created by Alexey Nikolaevich Druzik in 19.04.2019, v1.5. Number of group is 30701117.
 * Main aim of this programme is to develop system which print to console slogan which based on scale which user entered
 * from 1 to 3 scale in console.
 */
public class AsciiArt {

    public static final int SCALE_1 = 16;
    public static final int SCALE_2 = 21;
    public static final int SCALE_3 = 27;

    public static void main(String[] args) throws IOException {

        // user input
        Scanner scanner = new Scanner(System.in);
        int i;
        while (true) {
            System.out.println("Input scale from 1 to 3:");
            // checks if user entered smth
            if (scanner.hasNextInt()) {
                // reads int value
                i = scanner.nextInt();
                // checks if user entered a number from 1 to 3
                if (i >=1 && i <= 3) {
                    switch(i) {
                        case 1:
                            // passes scale 1 to method draw
                            draw(SCALE_1);
                            break;
                        case 2:
                            // passes scale 2 to method draw
                            draw(SCALE_2);
                            break;
                        case 3:
                            // passes scale 3 to method draw
                            draw(SCALE_3);
                            break;
                    }
                }
            } else {
                //clears buffer
                scanner.nextLine();
            }
        }
    }

    public static void draw(int scale) {
        // initializes width and height of console
        int width = 200;
        int height = 30;

        // creates BufferedImage
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        // initializes font, scale
        g.setFont(new Font("SansSerif", Font.BOLD, scale));

        // creates and initializes Graphics2D object
        Graphics2D graphics = (Graphics2D) g;
        // initializes Graphics2D object antialiasing
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        // passes parameters
        graphics.drawString("I " + '\u2764' + " JAVA", 0, 20);

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {
                // appends line
                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }
    }

}
