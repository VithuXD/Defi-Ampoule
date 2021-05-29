////////////////////
//
// V2
// Le 7 avril 2021
// Defi Ampoule
// 
////////////////////
public class DefiAmpoule {
    public static void main(String args[]) {
        boolean [] ampoules = new boolean[100];
        for(int v=1; v<=100; v++) {
            System.out.println(" ");
            for(int k=0; k<ampoules.length-1; k++) {
                if((k+1)%v==0) {
                    ampoules[k+1] = !(ampoules[k+1]);
                }
                
                    if((ampoules[k+1])==true)
                    System.out.print("1");
                    else System.out.print("0");
            }
            
            System.out.println();
        }
    }
}