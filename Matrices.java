import java.awt.Color;

public class Matrices {
    public static final int yellow = new Color(250, 201, 20).getRGB();
    public static final int blue = new Color(17, 13, 99).getRGB();
    public static final int red = new Color(196, 0, 15).getRGB();
    public static final int black = new Color(5, 5, 5).getRGB();
    public static final int white = new Color(255, 255, 255).getRGB();
    public static final int green = new Color(35, 138, 51).getRGB();

    public static int[][] createCOLFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 4;
        rowEnd = (height * 2) / 4;
        colIni = (widht * 0) / 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = yellow;
        }
        rowIni = (height * 2) / 4;
        rowEnd = (height * 3) / 4;
        colIni = (widht * 0) / 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = blue;
        }
        rowIni = (height * 3) / 4;
        rowEnd = (height * 4) / 4;
        colIni = (widht * 0) / 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        return flag;
    }

    public static int[][] createVENFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = (widht * 0) / 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = yellow;
        }
        rowIni = (height * 1) / 3;
        rowEnd = (height * 2) / 3;
        colIni = (widht * 0) / 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = blue;
        }
        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = (widht * 0) / 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        return flag;
    }

    public static int[][] createPOLFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (widht * 0) / 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (widht * 0) / 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        return flag;
    }

    public static int[][] createPANFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (widht * 0) / 2;
        colEnd = (widht * 1) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (widht * 1) / 2;
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (widht * 0) / 2;
        colEnd = (widht * 1) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = blue;
        }
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (widht * 1) / 2;
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        return flag;
    }

    public static int[][] createCHLFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (height * 0) / 2;
        colEnd = (height * 1) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = blue;
        }
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (height * 1) / 2;
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (widht * 0) / 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        return flag;
    }

    public static int[][] createCZEFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (height * 0) / 2;
        colEnd = (height * 1) / 2;
        for (int c = colIni; c < colEnd; c += 1) {
            for (int r = rowIni; r < rowEnd - (c * 2); r++)
                flag[r + c][c] = blue;
        }
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = 0;
        colEnd = widht;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni + r + 1; c < colEnd; c += 1) {
                flag[r][c] = white;
                flag[height - 1 - r][c] = red;
            }
        }
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (height * 1) / 2;
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        return flag;
    }

    public static int[][] createKWTFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = 0;
        colEnd = widht;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni + r + 1; c < colEnd; c += 1) {
                flag[r][c] = green;
                flag[height - 1 - r][c] = red;
            }
        }
        rowIni = (height * 1) / 3;
        rowEnd = (height * 2) / 3;
        colIni = ((widht * 1) / 5) + 1;
        colEnd = (widht * 1) / 1;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        return flag;
    }

    public static int[][] createFINFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = 4;
        int x = (widht - rowIni * 0) / 5;
        int y = (height - rowIni * 1) / 2;
        for (int r = y; r < y + rowIni; r++) {
            for (int c = 0; c < widht; c++) {
                flag[r][c] = blue;
            }
        }
        for (int r = 0; r < height; r++) {
            for (int c = x; c < x + rowIni; c++) {
                flag[r][c] = blue;
            }
        }
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = ((widht * 0) / 3) + 8;
        colEnd = (widht * 3) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = ((widht * 0) / 3) + 8;
        colEnd = (widht * 3) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = (height * 0) / 3;
        colEnd = (height * 1) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = (height * 0) / 3;
        colEnd = ((height * 1) / 3);
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        return flag;
    }

    public static int[][] createDNKFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = 4;
        int x = (widht - rowIni * 0) / 5;
        int y = (height - rowIni * 1) / 2;
        for (int r = y; r < y + rowIni; r++) {
            for (int c = 0; c < widht; c++) {
                flag[r][c] = white;
            }
        }
        for (int r = 0; r < height; r++) {
            for (int c = x; c < x + rowIni; c++) {
                flag[r][c] = white;
            }
        }
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = ((widht * 0) / 3) + 7;
        colEnd = (widht * 3) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = ((widht * 0) / 3) + 7;
        colEnd = (widht * 3) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = (height * 0) / 3;
        colEnd = (height * 1) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = (height * 0) / 3;
        colEnd = ((height * 1) / 3);
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        return flag;
    }

    public static int[][] createUSAFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        for (int b = 0; b < 12; b += 1) {
            rowIni = (height * b) / 12;
            rowEnd = (height * (b + 1)) / 12;
            colIni = (b < 6) ? (height * 1) / 2 : (widht * 0) / 1;
            colEnd = (widht * 1) / 1;
            for (int r = rowIni; r < rowEnd; r += 1) {
                for (int c = colIni; c < colEnd; c += 1)
                    if (b % 2 == 0) {
                        flag[r][c] = red;
                    } else {
                        flag[r][c] = white;
                    }
            }
        }
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (height * 0) / 2;
        colEnd = (height * 1) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = blue;
        }
        return flag;
    }

    public static int[][] createDOMFlag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (widht * 0) / 2;
        colEnd = (widht * 1) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = blue;
        }
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (widht * 1) / 2;
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (widht * 0) / 2;
        colEnd = (widht * 1) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = red;
        }
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (widht * 1) / 2;
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = blue;
        }
        rowIni = (height * 8) / 20;
        rowEnd = (height * 12) / 20;
        colIni = ((widht * 0) / 2);
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = ((widht * 8) / 20);
        colEnd = (widht * 12) / 20;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = white;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] flagMatrix = {};

        for (int h = 1; h <= 2; h += 1)
            for (int w = 1; w <= 2; w += 1) {
                flagMatrix = createCZEFlag(h * 12, w * 24);
                JOptionPaneArrays.showColorArray2D(null, flagMatrix);
        }
    }
}
