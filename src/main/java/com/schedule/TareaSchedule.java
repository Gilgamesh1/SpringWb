/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Raúl
 */
@Component
public class TareaSchedule {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @Scheduled(fixedRate = 1000, initialDelay = 8000)
    public void mostrarFechaActual() {
        System.out.println("mostrarFechaActual "+sdf.format(new Date()));
    }

    @Scheduled(cron = "01 * * * * ?", zone = "America/Lima")
    public void mostrarFechaActual2() {
        System.out.println("mostrarFechaActual2 "+sdf.format(new Date()));
    }
}
