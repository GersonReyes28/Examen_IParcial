/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaboratorioI;
import java.util.Scanner;

public class ProyectoI {

public static void main (String arg[]){
        
        //----- Variables -----
        String player1;
        String player2;
        String symbol1;
        String symbol2;
        String position2 ;
        boolean ganador = false;
        Scanner read = new Scanner(System.in);
        int menu = 0;
        boolean finish = false;
        boolean error = false;        
        boolean tie = false;
        String step1a = "_",step1b = "_",step1c = "_"; //0,1,2
        String step2a = "_",step2b = "_",step2c = "_"; //3,4,5
        String step3a = "_",step3b = "_",step3c = "_"; //6,7,
        int position = 0;
        int turn = 1;
        String symbol3 = "";
        int win1=0;
        int win2=0;

        //----- Main Menu ------
        System.out.print("Enter the name of the player one: ");
        player1 = read.nextLine();
        System.out.print("Enter your Symbol: ");
        symbol1 = read.next();
        System.out.println("");
        System.out.print("Enter the name of the player two: ");
        player2 = read.next();
        System.out.print("Enter your Symbol: ");
        symbol2 = read.next();
        System.out.println("");
        
        do{
            //----- Game Logic -------
            while(finish != true){
                
                error=false;
                tie=false;
                            
                System.out.println("\t\t   A\t    B\t    C");
                System.out.println("");
                System.out.println("\t1\t   "+step1a+"\t|   "+step1b+"\t|   "+step1c);
                System.out.println("");
                System.out.println("\t2\t   "+step2a+"\t|   "+step2b+"\t|   "+step2c);
                System.out.println("");
                System.out.println("\t3\t   "+step3a+"\t|   "+step3b+"\t|   "+step3c);
                
                if(
                    ((step1a == step1b && step1a == step1c && step1a != "_")|| //columnas
                    (step2a == step2b && step2a == step2c && step2a != "_")||
                    (step3a == step3b && step3a == step3c && step3a != "_")||

                    (step1a == step2a && step1a == step3a && step1a != "_")|| //filas
                    (step1b == step2b && step1b == step3b && step1b != "_")||
                    (step1c == step2c && step1c == step3c && step1c != "_")||

                    (step1a == step2b && step1a == step3c && step1a != "_")|| //diagonales
                    (step3a == step2b && step3a == step1c && step3a != "_"))
                   )
                    ganador = true;
                else if(
                        (step1a != "_" && step1b != "_" && step1c != "_" &&
                         step2a != "_" && step2b != "_" && step2c != "_" &&
                         step3a != "_" && step3b != "_" && step3c != "_")
                  )
                {
                    tie = true;
                    break;
                }                
                if(ganador)
                {
                    if(turn == 1)
                    {
                        System.out.println("");
                        System.out.println("The winner is "+player2);
                        win2++;
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("The winner is " +player1);
                        win1++;
                    }
                    finish = true;
                    break;
                    
                }
                else
                {
                    int i = 0;
                    boolean letter = false;
                    System.out.println("____________________________________________________");
                    System.out.println("\t\t   1\t   2\t   3");
                    System.out.println("\t\t   4\t   5\t   6");
                    System.out.println("\t\t   7\t   8\t   9");
                    System.out.println("____________________________________________________");
                    
                    
                        System.out.print("select:");   
                        position2 = read.next();
                        
                        
                 /*
                if (position2 == "1" || position2 =="2" || position2 =="3" || position2 =="4"
                         || position2 =="5" ||position2 =="6" || position2 =="7" || position2 =="8"
                         || position2 =="9")
                {
                   
                    error = false;
                }
                        else if(position2 != "1" && position2 !="2" && position2 !="3" && position2 !="4" 
                         && position2 !="5" && position2 !="6" && position2 !="7" && position2 !="8"
                         && position2 !="9")
                {
                    error = true;
                     System.out.println("Invalid option");
                    position2 = "1";
                }

               
                position = Integer.parseInt(position2);
                */
                position = Integer.parseInt(position2);
                if(error)
                {
                    if(turn == 1)
                        turn++;
                    else
                        turn--;
                    error = false;
                }
                
                    if  (turn == 1)
                    {
                        
                        turn++;
                        symbol3 = symbol1;
                    }
                    
                    else if ( turn == 2)
                    {
                        turn--;
                        symbol3 = symbol2;
                            
                    }
                if (position > 9 || position < 1)
                {
                    error = true;
                    System.out.println("There is no such position");

                }
                
                           
                switch(position){
                    case 1:
                        

                        if (step1a == "_")
                        {
                             step1a = symbol3;
                        }
                        else
                        {
                            error = true;
                            System.out.println("position is not available");
                        }
                        
                        
                        break;
                        
                    case 2:
                        if (step1b =="_")
                        {
                            step1b = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                    case 3:
                        if ( step1c =="_")
                        {
                            step1c = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                    case 4:
                        if (step2a =="_")
                        {
                             step2a = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                    case 5:
                        if (step2b=="_")
                        {
                             step2b = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                    case 6:
                        if (step2c=="_")
                        {
                            step2c = symbol3;
                        }
                        else 
                            System.out.println("Position is not avalible");
                        break;
                        
                    case 7:
                        if (step3a=="_")
                        {
                            step3a = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                    case 8:
                        if(step3b=="_")
                        {
                            step3b = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                    case 9:
                        if(step3c=="_")
                        {
                        
                             step3c = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                }
                

                
                }
            }
            if(tie){
                System.out.println("Tie");
            }
            
            ganador = false;
            finish = false;
            
            step1a = step1b = step1c = "_";
            step2a = step2b = step2c = "_";
            step3a = step3b = step3c = "_";
            
            System.out.println("");
            System.out.println("1. Play again");
            System.out.println("2. View stadistics");
            System.out.print("Choose your choice:");
            menu = read.nextInt();
            
        }while(menu !=2);
        System.out.println("");
        System.out.println(player1+" has won "+win1+" games and lost "+win2+" games");
        System.out.println(player2+" has won "+win2+" games and lost "+win1+" games");
    }
   }