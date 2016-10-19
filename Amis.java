
package amis;

import java.util.ArrayList;
import java.util.Scanner;


public class Amis {

    public static void main(String[] args) {
        String name;
        String nat;
        int age;
        Scanner s= new Scanner(System.in);
        System.out.println("give me your name ");
        name=s.nextLine();
        System.out.println("give me your nationality ");
        nat=s.nextLine();
        System.out.println("give me your age ");
        age=s.nextInt();
        personne p=new personne(name, nat, age);
        ArrayList <personne> L=new ArrayList(); 
        boolean v=false;
        while(v==false){
            System.out.println("make your choice : ");
            System.out.println("1) add a new friend");
            System.out.println("2) show ur friendList");
            System.out.println("3) shut down");
            int x;
            do{
                x=s.nextInt();
            }while((x>3)||(x<1));
                switch (x){
                case 1 :
                    s=new Scanner(System.in);
                    System.out.println("give me your friend's name ");
                    name=s.nextLine();
                    System.out.println("give me your friend's nationality ");
                    nat=s.nextLine();
                    System.out.println("give me your friend's age ");
        age=s.nextInt();
        personne p1=new personne(name, nat, age);
                        p.ajouter(L,p1 );
                    break;
                case 2 :
                    System.out.println("make yor choice :");
                    System.out.println("1) show all friends");
                    System.out.println("2) show stranger friends");
                    System.out.println("other to exit");
                    do{
                        x=s.nextInt();
                        }while((x>2)||(x<1));
                        switch (x){
                            case 1 :
                                 p.afficher(L);
                            break;
                            case 2:
                                 p.afficherAmisEtr(L);
                            break;
                    }
                    break;
                case 3 :
                    v=true;
                    break;
            }
        }
        
        
    }
    
}
