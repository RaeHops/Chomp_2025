import java.util.ArrayList;

public class Solution {

public Board exampleBoard;
public boolean WinningBoard;
public ArrayList<Board> loserBoards;


    public static void main(String[] args) {

        Solution myApp = new Solution();

        System.out.println("");

    }

    public Solution() {
        OneMove();
       // exampleBoard = new Board(3,2,1);

        loserBoards.add(new Board(1, 0, 0));

//        System.out.println("" +
//                "" +
//                "" +
//                "" +
//                "");

//        for (int x = 1; x < 4; x++) {
//            for (int y = 0; y < 4; y++) {
//                for (int z = 0; z < 4; z++) {
//
//
//                    if (x >= y && y >= z) {
//                        System.out.println(x + ", " + y + ", " + z);
//                    } else {
//                    }
//                }
//            }
//        }
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
        int y = 0;
        int z = 0;

        if (z > 0) {
            for (int i = 3; i >= 0; i--) {


                System.out.println(x + ", " + y + ", " + i);

                if (x == 1 && y == 0 && i == 0) {
                    //create a loop that loops thrugh your loser boards
                    //check for each loser board if x == a and if y== b and if i == c
                    //if so, then the board is a winning board and we don't need to do anything yet.
                    //if not, then proceced.
                    System.out.println("yay, winning board");
                    WinningBoard = true;
                } else{
                    System.out.println("no winning board");
                    WinningBoard = false;

                }

            }
        }
        if (y > 0) {
            for (int i = 3; i >= 0; i--) {
                if (i <= z) {
                    System.out.println(x + ", " + i + ", " + i);
                } else {
                    System.out.println(x + ", " + i + ", " + z);
                }

                if (x == 1 && i == 0) {
                    //create a loop that loops thrugh your loser boards
                    //check for each loser board if x == a and if y== b and if i == c
                    //if so, then the board is a winning board and we don't need to do anything yet.
                    //if not, then proceced.
                    System.out.println("100 is there");
                    WinningBoard = true;
                } else{
                    System.out.println("100 is not there");
                    WinningBoard = false;

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
        if (WinningBoard = false){

            loserBoards.add(new Board(x, y, z));
            System.out.println("loser");
        }else{
            System.out.println("winner");
        }
        //suppose you never find a losing board "match" after all of this.
        //add the board x, y, z to the loserBoards list
    }
    //then print all the loser boards


}
