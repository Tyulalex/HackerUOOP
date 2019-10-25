package com.company.introduction_to_oop.rectangle;

public class Rectangle {


    public static void main(String[] args) {
        byte[][] a = new byte[][]{{1, 1, 0, 0}, {1, 1, 0, 0}, {1, 1, 0, 0}, {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ", shall be 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;

        int x = 0;
        int y = 0;
        boolean v = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) {
                    v = true;
                } else {
                    break;
                }
            }
            if ((a[i][0] == 0) && v) {
                count += 1;
                v = false;
                break;
            }
        }

        return count;
    }


}
