/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package githab;

/**
 *
 * @author Student
 */
public class Githab {

   

    public static void main(String[] args) {
       try{ 
        Fraction drobA = null; //ссылка
        Fraction drobB = null; //ссылка
        Fraction drobC = null; //ссылка
        Fraction drobD = null; //ссылка
        
        //drobA.add(drobD);
        
        drobA = new Fraction(0,2);
        drobB = new Fraction(0,2);
        drobC = new Fraction(0,4);
        drobD = new Fraction(0,4);
        
        System.out.println("Count of Objects = "+ Fraction.getCountObject());
        
        if(drobA == drobB)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        
        if(drobA.isEqual(drobB))
           System.out.println("Equal");
        else
            System.out.println("Not Equal");
        
             
        
       Fraction drobF = drobA.add(drobB);
       System.out.println("Count of Objects = "+ Fraction.getCountObject());
       drobF = drobA.del(drobB);
       System.out.println("Count of Objects = "+ Fraction.getCountObject());
       
      drobF =  drobA.add(drobB.add(drobC.add(drobD)));
      drobF =  ((drobA.add(drobB)).add(drobF)).add(drobF);//.add(drobC.add(drobD)));
      System.out.println("Count of Objects = "+ Fraction.getCountObject());
      System.out.println( drobF.toFormatString());
      
      drobD = drobF;
      System.out.println( drobD.toFormatString());
      drobD.setCh(1);
      drobD.setZn(2);
      System.out.println( drobF.toFormatString());
      drobD.CopyFraction(drobF);
      
      
       //System.out.println("Count of Objects = "+ Fraction.getCountObject());
       
        
      //  System.out.println("Count of Objects = "+ Fraction.getCountObject());
              
       }
       catch(Exception e){
           System.out.println("The Error detectid "+e.getMessage());
       }

    }
}


