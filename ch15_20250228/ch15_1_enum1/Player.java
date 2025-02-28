/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20250228.ch15_1_enum1;

/**
 *
 * @author xvpow
 */
public class Player {
    public static final int PLAY = 1;
    public static final int STOP = 30;
    public static final int EXIT = 15;
    
    public static enum Action{
        PLAY,
        STOP,
        EXIT
    }
    
    public static void playEnum(String name,Action action){
        switch(action){
            case PLAY:
                System.out.println("Enum PLAY:"+name);
                break;
            case STOP:
                System.out.println("Enum STOP:"+name);
                break;
            case EXIT:   
                System.out.println("Enum EXIT:"+name);
                break;
        }
    }
    public static void play(String name,int action){
        
        switch(action){
            case PLAY:
                System.out.println("Paly:"+name);
                break;
            case STOP:
                System.out.println("Stop:"+name);
                break;
            case EXIT:
                System.out.println("Exit:"+name);
                break;
            default:
                System.out.println("Error");                
                break;
                        
        }
    }
}
