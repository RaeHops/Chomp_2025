import java.util.ArrayList;

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

        OneMove(3,0,0);
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

    public void OneMove(int a, int b, int c) {
       FoundWinningBoard = false;

        int x = a;
        int y = b;
        int z = c;

        if (z > 0) {
            for (int i = 3; i >= 0; i--) {


                System.out.println(x + ", " + y + ", " + i);

                if (x == loserBoards.get(0).dots[0] && y == loserBoards.get(0).dots[1] && i == loserBoards.get(0).dots[2]) {
                    //create a loop that loops thrugh your loser boards
                    //check for each loser board if x == a and if y== b and if i == c
                    //if so, then the board is a winning board and we don't need to do anything yet.
                    //if not, then proceced.
                    System.out.println("yay, this original board is a winning board");
                    FoundWinningBoard = true;
                } else{
                    System.out.println("this is not a winning board");


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

                if (x == loserBoards.get(0).dots[0]  && i == loserBoards.get(0).dots[1] ) {
                    //create a loop that loops thrugh your loser boards
                    //check for each loser board if x == a and if y== b and if i == c
                    //if so, then the board is a winning board and we don't need to do anything yet.
                    //if not, then proceced.
                    System.out.println("100 is there");
                    FoundWinningBoard = true;
                } else{
                    System.out.println("100 is not there");


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
        System.out.println("x" + x + " y " + y + "z " + z);
        if (FoundWinningBoard == false){

            loserBoards.add(new Board(x, y, z));
            System.out.println(" we added this og board to the loser list");
        }else{
            System.out.println("this og board is a winner");
        }
        //suppose you never find a losing board "match" after all of this.
        //add the board x, y, z to the loserBoards list
    }
    //then print all the loser boards

/** what im confused about is: why do you say "create a loop that loops through loser boards" if im not storing any of the losing boards?
    // also, take 333 for example. That's a winning board, but you cant get to 100 in one move.
 **/
}
