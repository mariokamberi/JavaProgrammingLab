package loops;

public class UtopianTree {
    public static void main(String[] args) {

        // your code
        // ----------------------------

        int growth = 0;
        int treeSize = 0;

        for (int i = 1; i <=10 ; i++) {
            if (i<4){
                treeSize=1;
            }else {
                treeSize=2;
            }
            growth+=treeSize;
            System.out.println("year "+i+" - growth "+treeSize+" cm");
            System.out.println("tree size: "+growth+"cm");
        }

        /*
        int sizeThree =0;
        for(int i= 1;i <=10;i++){
            if(i<=3){
                sizeThree += 1;
                System.out.printf("year %d - growth 1 cm\n", i);
                System.out.printf("tree size: %dcm\n",sizeThree);

            } else {
                sizeThree += 2;
                System.out.printf("year %d - growth 2 cm\n", i);
                System.out.printf("tree size: %dcm\n",sizeThree);

            }
        }
         */

    }
}

/*
The Utopian Tree grows exactly 1 cm for the first three years,
and after that it grows by 2 cm every year.
Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm

year 2 - growth 1 cm
tree size: 2cm

year 3  - growth 1 cm
tree size:3cm

year 4 - growth 2 cm
tree size: 5cm

year 5 - growth 2 cm
tree size: 7cm

year 6 - growth 2 cm
tree size: 9cm

... until you reach year 10
 */