/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20250324.ch25_6_nio6;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
public class Ch25_6 {

    private static Person srToPerson(String data){
        String[] dataArray = data.split(",");
        String name = dataArray[0];
        int score =  Arrays.stream(dataArray).skip(1).
                mapToInt(Integer::parseInt).sum();
        Person p1 = new Person(name,score);
        return p1;
    }
    public static void main(String[] args) {
        // TODO code application logic here

        //1 讀入data.txt
        //2 轉換成Person
        //3 幫我根據姓名分組
      Path path = Paths.get("c:","mydir","dir","data.txt");
      try{
            Stream<String> dataStr = Files.lines(path);
        Map<String,List<Person>>  group = 
                dataStr.map(Ch25_6::srToPerson).
                        collect(Collectors.groupingBy(Person::getName));
        System.out.println(group);
      }catch(IOException ex){
          System.out.println(ex);
      }
    
    }
    
}
