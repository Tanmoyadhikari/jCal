
package developertanmoy.firstjavaproject;
import java.util.Scanner;
public class selectModule01 {
    public static void main(String[] args){
        String[] types = {"Compare Number in x,y","Math Factorial n'th","Get Odd Number x to y","Check Natural Number"};
        Scanner input = new Scanner(System.in);
        
        
        int x = types.length;
      
       for(int i=0;i<x;i++){
           System.out.println(i+". "+types[i]);
       }
        System.out.println("Selecn an Item :");
        int selectMethod = input.nextInt();
          
        if(selectMethod<=x){
              System.out.print("You are Selected :"+selectMethod+"\n");
                          if(selectMethod==0){
         System.out.print("Enter The Number X:");  
        int xVal = input.nextInt();
         System.out.print("Enter The Number Y:");  
        int yVal = input.nextInt();
        System.out.print(Math.max(xVal,yVal)+" Is Big Number");
            }
             else if(selectMethod==1){
                 System.out.print("Enter The Number :");  
        int n=input.nextInt();
        int nxt=1;
        
        for(int i=1;i<=n;i++){
     
          nxt=nxt*i;   
        }
           System.out.println("The factorial Of "+n+" is ="+nxt);
              }
                           else    if(selectMethod==2){
         System.out.print("Enter The Number X :");  
        int xVal2 = input.nextInt();
        System.out.print("Enter The Number Y:");  
        int yVal2 = input.nextInt();
       
        
       for(int xMin=xVal2;xMin<=yVal2;xMin++){
           if(xMin%2==0){
                System.out.println(xMin);
           }
          
       }
            }
                                   else    if(selectMethod==3){
         System.out.print("Enter The Number :");  
        int nn =input.nextInt();
        if(nn<=9){
             if(nn==0){
                System.out.println("Zero");
            }else if(nn==1){
                System.out.println("One");
            }else if(nn==2){
                System.out.println("Two");
            }else if(nn==3){
                System.out.println("Three");
            }else if(nn==4){
                System.out.println("Four");
            }else if(nn==5){
                System.out.println("Five");
            }else if(nn==6){
                System.out.println("Six");
            }else if(nn==7){
                System.out.println("Seaven");
            }else if(nn==8){
                System.out.println("Eight");
            }else if(nn==9){
                System.out.println("Nine");
            }
        }
        else{
            System.out.println("This is Not A Natural Number");
        }
            }
          
           }
        else{
         System.out.println("An Error Ocured...Please Type an Valid Number");
        System.out.println("Please Re-Open The Program..");
        
        }
        
       

    }
}
