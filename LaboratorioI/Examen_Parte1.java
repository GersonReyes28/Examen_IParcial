/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaboratorioI;
import java.util.Scanner;
/**
 *
 * @author GERSON
 */
public class Examen_Parte1 {
    public static void main(String[] args) {
        int amountStudents=0;
        String TemporalName="";
        double TemporalAcGrade=0;
        double TemporalExGrade=0;
        Scanner read=new Scanner(System.in);
        boolean error = false;
        System.out.print("Ingrese la Cantidad de estudiantes:");
        amountStudents=read.nextInt();
        double noteHigh = 0;
        double noteLow = 100;
        double TemporaltotalGrade = 0;
        double totalGrade = 0;
        double TemporalLow = 0;
        int countNote = 0;
        double Average = 0;
        String nameHigh = "";
        double studentAcHigh = 0;
        double studentExHigh = 0;
        
        
        //System.out.println(amountStudents);
        
        String[] namesStudents=new String[amountStudents];
        double[] acGrades=new double[amountStudents];
        double[] exGrades=new double[amountStudents];
        
        
        for(int i=0; i < amountStudents; i++)
        {
            System.out.println(i);
            System.out.print("Ingrese nombre del estudiante: ");
            TemporalName=read.next();
            namesStudents[i]=TemporalName;
            TemporaltotalGrade = 0;
            do{
                System.out.print("Ingrese nota acumulada: ");
                acGrades[i]=TemporalAcGrade;
                TemporalAcGrade=read.nextDouble();
                if (TemporalAcGrade > 50){
                    error = true;
                    System.out.println("Ingrese una Nota Valida");
                }
                else{
                    error = false;
                TemporaltotalGrade += TemporalAcGrade;
                TemporalLow = TemporaltotalGrade;
                }
            }while(error);
            do{
                System.out.print("Ingrese nota examen:");
                exGrades[i]=TemporalExGrade;
                TemporalExGrade=read.nextDouble();
                if (TemporalExGrade > 50){
                    error = true;
                    System.out.println("Ingrese una Nota Valida");
                }
                else{
                    error = false;
                    TemporaltotalGrade += TemporalExGrade;
                    totalGrade +=TemporaltotalGrade;
                    if(noteHigh < TemporaltotalGrade){
                        noteHigh = TemporaltotalGrade;
                        nameHigh = TemporalName;
                        studentAcHigh = TemporalAcGrade;
                        studentExHigh = TemporalExGrade;
                    }
                        
                    if (TemporalLow < noteLow){
                        noteLow = TemporaltotalGrade;
                    }
                
                }
                
            }while(error);
            countNote++;
            
        }
        Average = totalGrade / countNote;
        System.out.println("");
        System.out.println("El estudiante con Mejor nota.");
        System.out.println("Nombre: "+nameHigh+" Acumulados: "+studentAcHigh+" Examenes: "+studentExHigh);
        System.out.println("");
        System.out.println("La nota Menor fue: "+noteLow);
        System.out.println("El Promedio fue: "+Average);
        
        for (int x=0; x<namesStudents.length;x++){
            System.out.println("________________________________");
            System.out.println("Nombre: "+namesStudents[x]);
            for(int y = 0;y<acGrades.length;y++){
                System.out.println("Acumulados: "+acGrades[y]);
                for (int w = 0;w<exGrades.length;w++){
                    System.out.println("Examenes: "+exGrades[w]);
                    System.out.println("________________________________");
                }
            }
        }
       
    }
}
