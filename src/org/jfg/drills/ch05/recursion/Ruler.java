package org.jfg.drills.ch05.recursion;

public class Ruler {


    public static void main(String[] args) {

        // test drawing a line
//        Ruler.drawLine(5);
//        Ruler.drawInterval(5);
        Ruler.drawRuler(5, 5);

        System.out.println("End.");


    }

    private static void drawRuler(int numberOfInches, int maximumRuleMarkLength) {
        for (int i = 1; i <= numberOfInches; i++) {
            drawInterval(maximumRuleMarkLength -1);
            drawLine(maximumRuleMarkLength, i);
        }
    }

    private static void drawInterval(int centralLineLength) {
        if (centralLineLength >= 1) {
            drawInterval(centralLineLength - 1);
            drawLine(centralLineLength);
            drawInterval(centralLineLength -1);
        }
    }

    private static void drawLine(int lineLenght) {
        drawLine(lineLenght, 0);
    }

    private static void drawLine(int lineLenght, int label) {
        if (lineLenght >= 1) {
            System.out.print("-");
            drawLine(lineLenght - 1, label);
        } else {
            // Esto se ejecuta al final de los ciclos de recursion cuando lineLength es 0
            if (label > 0)
               System.out.print(label);
            System.out.print("\n");
        }

    }


}
