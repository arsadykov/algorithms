package com.github.arsadykov.algorithms;

/**
 *
 * @author Arthur Sadykov
 */
public class Stopwatch {

    private final long initTime;

    //--------------------------------------------------------------------------
    public Stopwatch() {
        //Сохранение в переменной initTime текущего времени в мс
        initTime = System.currentTimeMillis();
    }

    //--------------------------------------------------------------------------
    public long elapsedTime() {
        //Сохранение в переменной time текущего времени в мс
        long time = System.currentTimeMillis();
        //Вычисление прошедшего с момента создания таймера времени в мс
        long elapsedTime = time - initTime;
        return elapsedTime;
    }
    //---------------------------------------------------------------------------
}
