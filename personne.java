package amis;

import java.util.ArrayList;


public class personne {
    private String name;
    private String nat;
    private int age;

    public personne(String name,String nat,int age) {
    this.name=name;
    this.nat=nat;
    this.age=age;
    }
     String getName(){
     return this.name;
     }
     String getNat(){
     return this.nat;
     }
     int getAge(){
     return this.age;
     }
     
     void ajouter( ArrayList <personne> L,personne p){
         L.add(p);
     }
     void afficher( ArrayList <personne> L){
         if(L.size()==-1){
             System.out.println("your list is empty ....you must add first");
         }
         else{
         for (int i=0;i<L.size();i++){
             System.out.println("friend n"+(i+1)+" :");
             System.out.println("name :"+L.get(i).getName());
             System.out.println("name :"+L.get(i).getNat());
             System.out.println("name :"+L.get(i).getAge());
         }
         }
         }
     void afficherAmisEtr( ArrayList <personne> L){
         int k=0;
         for (int i=0;i<L.size();i++){
             if(!(L.get(i).getNat().contains("algeria"))){
             k++;    
             System.out.println("friend n"+k+" :");
             System.out.println("name :"+L.get(i).getName());
             System.out.println("name :"+L.get(i).getNat());
             System.out.println("name :"+L.get(i).getAge());
             }
             if(k==0)
                 System.out.println("you dont have any stranger friends");
         }        
     
     }
}//
