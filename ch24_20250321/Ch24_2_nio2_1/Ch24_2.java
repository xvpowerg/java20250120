/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_2_nio2_1;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Ch24_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 =  Paths.get("c:", "mydir","msg.txt");
        System.out.println(p1);
        
        Path p2 = Paths.get("c:","A","B","C","D");
        System.out.println(p2);
        System.out.println(p2.getNameCount());
        System.out.println(p2.getRoot());
       
        System.out.println(p2.subpath(1, 3));
        System.out.println(p2.subpath(2, 4));
        //C\D
        Path p3 = Paths.get("c", "X","Y","Z","G");
        System.out.println(p3.subpath(2, 4));
        System.out.println(p3.getRoot());
        System.out.println(p3.getNameCount());
        
        Path p4 = Paths.get("c:", "A","B");
        Path p5 = Paths.get("myImage.jpg");
        Path p6 =  p4.resolve(p5);
        System.out.println(p6);
        
        Path p7 = Paths.get("c:","A","B");
        Path p8 = Paths.get("c:","X","image.jpg");
        Path p9 =  p7.resolve(p8);
        System.out.println(p9);
        
        Path p10 = Paths.get("c:","mydir","myimage","dir");
        Path p11 = Paths.get("image.jpg");
        Path p12 =  p10.resolve(p11);
        System.out.println(p12);
        
       Path newPath = 
                p10.subpath(0,p10.getNameCount() -1);
       newPath =  p10.getRoot().resolve(newPath);
       Path imagePath2 =  newPath.resolve(p11);
       System.out.println(imagePath2);
       
      Path imagePath3 =  p10.resolveSibling(p11);
      System.out.println(imagePath3);
       
       
        
    }
    
}
