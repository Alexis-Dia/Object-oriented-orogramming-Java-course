package by.bntu.fitr.povt.alexeyd.lab3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;

public class AsciiArt {

    public static final int SCALE_1 = 16;
    public static final int SCALE_2 = 21;
    public static final int SCALE_3 = 27;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int i;
        while (true) {
            System.out.println("Input scale from 1 to 3:");
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
                if (i >=1 && i <= 3) {
                    switch(i) {
                        case 1:
                            draw(SCALE_1);
                            break;
                        case 2:
                            draw(SCALE_2);
                            break;
                        case 3:
                            draw(SCALE_3);
                            break;
                    }
                    break;
                } else {
                    scanner.nextLine();
                }
            } else {
                scanner.nextLine();
            }
        }
    }

    public static void draw(int scale) {
        int width = 200;
        int height = 30;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, scale));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("I " + '\u2764' + " JAVA", 0, 20);

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }
    }

}
