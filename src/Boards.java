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
        int y = 2;
        int z = 1;

if(z>0) {
    for (int i = 1; i >= 0; i--) {


        System.out.println(x + ", " + y + ", " + i);


    }
}
if(y>0) {
    for (y = 2; y >= 0; y--) {
        if (y <= z) {
            z = y;
        } else {
        }
        System.out.println(x + ", " + y + ", " + z);

    }
}
        int y = 2;
        int z = 1;
        for (x = 3; x>=0; x--){
            if (x <= y){
                y = x;
            } else{}
            if (x <= z){
                z = x;
            } else{}
            System.out.println(x+", " + y + ", " +z);
        }


    }
}
