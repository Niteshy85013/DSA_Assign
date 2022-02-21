package week3;//package week3;
//
//class smallest_integer {
//    public int smallest(String num ) {
//        int n;
//        int[] found;
//
//        found = new int[6];
//        for (int i = 0; i < 6; i++) {
//            found[i] = 0;
//        }
//        for (int i = 0; i < 6; i++) {
//            found[i] = 0;
//        }
//        for (int i = 0; i < 6; i++) {
//            if (found[i] == 0) {
//                return i + 1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[]args ){
//        String n= "689345";
//        smallest_integer w= new smallest_integer();
//        int s = w.smallest(n);
//        System.out.println(s);
//
//
//    }
//}



public class smallest_integer {
    public int smallestnumber(String givennumber){
        int number;
        int n=givennumber.length();
        int num[]=new int[10];

        for (int i=0;i<n;i++){
            number=Integer.parseInt(givennumber.charAt(i)+"");
            num[number]=1;
        }
        for (int i=1;i<10;i++){
            if(num[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String input1="1689";
        String input2="689345";
        smallest_integer num= new smallest_integer();

        int output1= num.smallestnumber(input1);
        System.out.println("First Output:"+output1);
        int output2= num.smallestnumber(input2);
        System.out.println("Second Output:"+output2);
    }
}

