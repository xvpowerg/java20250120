/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20250219.ch11_8_interface8;
import java.util.function.Supplier;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class MyExceptionSupplier implements Supplier<Exception> {
    public Exception get(){
        return new IOException();
    }
}
