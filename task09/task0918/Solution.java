package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.IOException;
import java.sql.SQLException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends RuntimeException{
    }

    static class MyException2 extends  VirtualMachineError{
    }

    static class MyException3 extends SQLException {
    }

    static class MyException4 extends IOException {
    }
}

