package DZ1;

public class Main {
    public static void main(String[] args) { //

        Challenger Challenger1 = new Challenger("Трус", 2);
        Challenger Challenger2 = new Challenger("Балбес",0);
        Challenger Challenger3 = new Challenger("Бывалый",2);
        Challenger Challenger4 = new Challenger("Шурик",4);

        Team team = new Team("Спортсмены", new Challenger[]{Challenger1, Challenger2, Challenger3, Challenger4}); // Создаем команду

        Obstacle obstacle1 = new Obstacle("smallWall", 1);
        Obstacle obstacle2 = new Obstacle("bigWall", 3);


        Course course = new Course("IronMan", new Obstacle[]{obstacle1,obstacle2}); // Создаем полосу препятствий5

        team.teammatesList(); // выводим список участников команды
        course.goCourse(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
