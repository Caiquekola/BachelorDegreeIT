/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maven;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author ADMIN
 */
public class Maven {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LocalDate ld = LocalDate.of(2015, 8, 5);
        DayOfWeek nld = ld.getDayOfWeek();
        System.out.println(nld.toString());
    }
}
