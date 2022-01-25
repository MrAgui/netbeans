/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume.volume;

/**
 *
 * @author Gigabyte
 */
class Volume {
   //Sphere
    public double volume(double a){
       return (4*Math.PI*a*a*a)/3;
    }  
   //Cylinder
    public double volume(double a, double b ){
        return Math.PI * a * a * b;
    } 
   //Rectangle
    public double volume(double a, double b, double c){
        return a*b*c;
    }
}

public class VolumeDemo {
    
    public static void main (String[]args){
//        double a = 5, b = 4, c = 3 ;

        Volume volAns = new Volume();
        
        double volSphere = volAns.volume (5);
        double volCylinder = volAns.volume(5,4);        
        double volRectangle = volAns.volume(5,4,3);
        System.out.println("Volume of Sphere with radius: 5 is: "+  volSphere + "\n");
        System.out.println("Volume of Sphere with radius: 5 and height: 4 is: "+  volCylinder + "\n");
        System.out.println("Volume of Sphere with length:  5, width: 4, height: 3 is: "+  volSphere + "\n");
        
    
    }
}

