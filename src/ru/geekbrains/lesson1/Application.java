package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.animal.Cat;
import ru.geekbrains.lesson1.animal.Dog;
import ru.geekbrains.lesson1.animal.Human;
import ru.geekbrains.lesson1.animal.Robot;
import ru.geekbrains.lesson1.course.Course;
import ru.geekbrains.lesson1.course.Cross;
import ru.geekbrains.lesson1.course.Wall;
import ru.geekbrains.lesson1.course.Water;
import ru.geekbrains.lesson1.enums.Color;

/**
 * Класс для запуска приложения - симулятор кросса
 */
public class Application {

    public static void main(String[] args) {
        Team team = new Team(
                new Cat("Барсик", Color.BLACK, 1, 100, 4),
                new Dog("Шарик", Color.BROWN, 10, 70, 6, 40),
                new Human("Иван", Color.WHITE, 45, 200, 3, 100),
                new Robot("T1000", 1000, 1000, 1000)
        );

        Course course = new Course(
                new Cross(50),
                new Wall(4),
                new Cross(100),
                new Water(5)
        );

        course.doIt(team);
    }
}
