/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch10_20250217.Ch10_5_interface5;

/**
 *
 * @author xvpow
 */
public interface Walk {
    int UP = 1;
    int DOWN = 2;
    int LEFT = 3;
    int RIGHT = 4;
    void walk(int forwod);
    //只有要呼叫介面抽象方法時才使用default方法
    public default void upWalk(){
        walk(Walk.UP);
    }
    public default void downWalk(){
        walk(Walk.DOWN);
    }
    public default void leftWalk(){
        walk(Walk.LEFT);
    }
    public default void rightWalk(){
        walk(Walk.RIGHT);
    }
}
