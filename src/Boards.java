public class Boards {


    public static void main(String[] args) {

        Boards myApp = new Boards();


        System.out.println("");


    }

    public Boards() {
        OneMove();

        System.out.println("" +
                "" +
                "" +
                "" +
                "");

        for (int x = 1; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {


                    if (x >= y && y >= z) {
                        System.out.println(x + ", " + y + ", " + z);
                    } else {
                    }
                }
            }
        }
    }

//    public void OneMove(){
//
//
//        for (int x = 3; x >= 1; x--) {
//            for (int y = 3; y >= 0; y--) {
//                for (int z = 3; z >= 0; z--) {
//                    System.out.println("hi");
//
//
//                    if (x >= y && y >= z ) {
//                        System.out.println(x + ", " + y + ", "+z);
//                    } else {
//                    }
//                }
//            }
//        }
//
//        System.out.println("");
//    }

    public void OneMove() {
        int x = 3;
        int y = 3;
        int z = 3;

        if (z > 0) {
            for (int i = 3; i >= 0; i--) {


                System.out.println(x + ", " + y + ", " + i);


            }
        }
        if (y > 0) {
            for (int i = 3; i >= 0; i--) {
                if (i <= z) {
                    System.out.println(x + ", " + i + ", " + i);
                } else {
                    System.out.println(x + ", " + i + ", " + z);
                }


            }
        }
        if (x > 0) {
            for (int i = 3; i >= 0; i--) {
                if (i <= y && z<i) {
                    System.out.println(i + ", " + i + ", " + z );
                } else if (i <= y && i <= z) {
                    System.out.println(i + ", " + i + ", " + i );
                } else {
                    System.out.println(i + ", " + y + ", " + z );
                }


            }


        }
    }
}
