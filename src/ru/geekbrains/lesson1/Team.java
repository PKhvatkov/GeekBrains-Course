package ru.geekbrains.lesson1;

/**
 * Класс - комманда участников соревнований
 */
public class Team {

    private Participant[] participants;

    // здесь используется конструктор с переменным числом параметров
    public Team(Participant... participants) {
        // внутри метода переменное число параметров интерпретируется как массив
        this.participants = participants;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void showParticipants(Team team){
        System.out.println("#### Участники ####");
        for (Participant participant : team.getParticipants()){
            participant.showInfo();
        }
        System.out.println("##############");
    }

    public void showResults(Team team) {
        System.out.println("******** Результаты ********");
        for (Participant participant : team.getParticipants()) {
            System.out.print(participant.getName());
            if (participant.isOnDistance()) {
                System.out.println(" прошел дистанцию!");
            } else {
                System.out.println(" сошел с дистанции!");
            }
        }
        System.out.println("****************************");
    }
}
