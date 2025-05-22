public class Board {

    public int[] dots;

    public Board(int a, int b, int c){
        dots = new int[3];
        dots[0]=a;
        dots[1]=b;
        dots[2]=c;

    }
    public void printInfo(){
        System.out.println("A="+ dots[0] + "B=" + dots[1] + "C=" + dots[2]);


    }

}
