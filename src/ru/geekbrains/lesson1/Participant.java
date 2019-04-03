package ru.geekbrains.lesson1;

/**
 * Интерфейс - участник соревнований
 */
public interface Participant {

    boolean isOnDistance();

    String getName();

    void showInfo();

    void run(int distance);

    void jump(int height);

    void swim(int distance);
}
