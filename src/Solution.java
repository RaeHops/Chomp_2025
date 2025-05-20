import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

public Board exampleBoard;
public boolean FoundWinningBoard = false;
public ArrayList<Board> loserBoards = new ArrayList<>();


    public static void main(String[] args) {

        Solution myApp = new Solution();

        System.out.println("");

    }

    public Solution() {

        loserBoards.add(new Board(1, 0, 0));


        PrintAllBoards();

        for (int d = 0; d < loserBoards.size(); d++) {
            System.out.println(loserBoards.get(d));
        }
       // exampleBoard = new Board(3,2,1);


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

    public void PrintAllBoards(){


        for (int x = 1; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                for (int z = 0; z <= 3; z++) {



                    if (x >= y && y >= z ) {
                        System.out.println("ORIGINAL BOARD "+ x + ", " + y + ", "+z);

                        System.out.println("ALL POSSIBLE MOVES BELOW:");
                        OneMove(x, y, z);

                    } else {
                    }
                }
            }
        }

        System.out.println("");
    }


    public void OneMove(int a, int b, int c) {
       FoundWinningBoard = false;

        int x = a;
        int y = b;
        int z = c;

        if (z > 0) {
            for (int i = c; i >= 0; i--) {


                System.out.println(x + ", " + y + ", " + i);

                for(int d=0;d<loserBoards.size();d++) {
                    if (x == loserBoards.get(d).dots[0] && y == loserBoards.get(0).dots[1] && i == loserBoards.get(0).dots[2]) {
                        //create a loop that loops thrugh your loser boards
                        //check for each loser board if x == a and if y== b and if i == c
                        //if so, then the board is a winning board and we don't need to do anything yet.
                        //if not, then proceced.
                        System.out.println("WINNER, FOUND BASE BOARD");
                        FoundWinningBoard = true;
                    } else {
                        System.out.println("LOSER, DID NOT FIND BASE BOARD");


                    }
                }

            }
        }
        if (y > 0) {
            for (int i = b; i >= 0; i--) {
                if (i <= z) {
                    System.out.println(x + ", " + i + ", " + i);
                } else {
                    System.out.println(x + ", " + i + ", " + z);
                }
                for(int d=0;d<loserBoards.size();d++) {
                    if (x == loserBoards.get(d).dots[0] && i == loserBoards.get(0).dots[1]) {
                        //create a loop that loops thrugh your loser boards
                        //check for each loser board if x == a and if y== b and if i == c
                        //if so, then the board is a winning board and we don't need to do anything yet.
                        //if not, then proceced.
                        System.out.println("WINNER, FOUND BASE BOARD");
                        FoundWinningBoard = true;
                    } else {
                        System.out.println("LOSER, DID NOT FIND BASE BOARD");


                    }
                }


            }
        }
        if (x > 0) {
            for (int i = a; i >= 0; i--) {
                if (i <= y && z<i) {
                    System.out.println(i + ", " + i + ", " + z );

                } else if (i <= y && i <= z) {
                    System.out.println(i + ", " + i + ", " + i );
                } else {
                    System.out.println(i + ", " + y + ", " + z );

                }
                for(int d=0;d<loserBoards.size();d++) {
                    if (i == loserBoards.get(d).dots[0] && y == loserBoards.get(0).dots[1] && z == loserBoards.get(0).dots[2]) {
                        //create a loop that loops thrugh your loser boards
                        //check for each loser board if x == a and if y== b and if i == c
                        //if so, then the board is a winning board and we don't need to do anything yet.
                        //if not, then proceced.

                        System.out.println("WINNER, FOUND BASE BOARD");
                        FoundWinningBoard = true;
                    } else {
                        System.out.println("LOSER, DID NOT FIND BASE BOARD");


                    }
                }


            }


        }
        System.out.println("x" + x + " y " + y + "z " + z);
        if (FoundWinningBoard == false){

            loserBoards.add(new Board(a, b, c));
            System.out.println(" we added this og board to the BASE BOARD LIST");
            System.out.println(a + "" + b + "" + c);
            System.out.println("");
            System.out.println("");

        }else{
            System.out.println("this og board is a winner");
            System.out.println("");
            System.out.println("");
        }
        //suppose you never find a losing board "match" after all of this.
        //add the board x, y, z to the loserBoards list

    }
    //then print all the loser boards



/** what im confused about is: why do you say "create a loop that loops through loser boards" if im not storing any of the losing boards?
    // also, take 333 for example. That's a winning board, but you cant get to 100 in one move.
 **/
}
