package DZ1;

public class Course {

    String name;
    Obstacle[] course;

    public Course(String name, Obstacle[] obstacle) {
        this.name = name;
        this.course = obstacle;
    }
      void goCourse(Team team){           // все участники пробуют пройти полосу
        for (Challenger mate:team.getTeam()) {
            for (Obstacle obs : course){
                    if (mate.getHigh() < obs.size) {
                        mate.setFinish(false);
                        break;          // остановиться, если не преодалел препятсвие

                    }
                }
            }
        }
    }

