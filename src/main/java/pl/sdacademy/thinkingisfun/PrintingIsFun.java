package pl.sdacademy.thinkingisfun;

import java.io.IOException;
import java.io.OutputStream;

public class PrintingIsFun {
    private OutputStream output = System.out;

    public void printRectangle(int width, int height) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < width; i++) {
            sb.append('*');
        }
        for (int j = 0; j < height; j++) {
            printLineToScreen(sb.toString());
        }
    }

    public void printBox(int width, int height) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbGap = new StringBuilder("*");

        for (int i = 0; i < width; i++) {
            sb.append('*');
        }
        if (width > 1) {
            for (int i = 0; i < width - 2; i++) {
                sbGap.append(' ');
            }
            sbGap.append('*');
        }
        printLineToScreen(sb.toString());
        if (height > 1) {
            for (int i = 0; i < height - 2; i++) {
                printLineToScreen(sbGap.toString());
            }
            printLineToScreen(sb.toString());
        }
    }

    public void printTriangle(int height) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < height; i++) {
            sb.append('*');
        }
        for (int i = height; i > 0; i--) {
            printLineToScreen(sb.toString());
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public void printTree(int height) {
        StringBuilder sb = new StringBuilder("*");

        for (int j = 0; j < height - 1; j++) {
            sb.insert(0, " ");
            sb.append(" ");
        }
        for (int i = 0; i < height; i++) {
            printLineToScreen(sb.toString());
            sb.insert(sb.length() / 2, "**");
            sb.delete(0, 1);
            sb.delete(sb.length() - 1, sb.length());
        }
    }

    private void printLineToScreen(String line) {
        try {
            output.write((line + System.lineSeparator()).getBytes());
            output.flush();
        } catch (IOException e) {
            System.out.println("Problem with console output...");
        }
    }
}
