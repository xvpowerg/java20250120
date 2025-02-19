/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20250219.ch11_8_interface8;
import java.sql.SQLException;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class MyExceptionSupplier2 implements Supplier<Exception> {
    public Exception get(){
        return new SQLException();
    }
}
