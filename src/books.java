import java.util.Scanner;

class Hrx{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        if(t==0)
            System.out.println("N/A");
        else{
            s.skip("\n");
            while(t-->0){

                String bname=s.nextLine();
                String aname=s.nextLine();
                String num=s.nextLine();
                String temp="---------------------";
                System.out.println(temp);//----------------------
                System.out.println("Book Name:\t"+bname);
                System.out.println("Author Name:\t"+aname);
                System.out.println("ISBN:\t"+num);
                System.out.println(temp);

            }

        }

    }
}