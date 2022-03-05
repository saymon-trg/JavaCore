package DZ1;

public class Team {


    String teamName;
    Challenger[] team;

    // массив из четырех участников — в конструкторе можно сразу всех участников указывать
    public Team(String teamName, Challenger[] teamMates) {
        this.teamName = teamName;
        this.team = teamMates;
    }
    public Challenger[] getTeam() {
        return team;
    }

    // метод вывода информации обо всех членах команды
    public void teammatesList() {
        System.out.println("DZ1.Team \"" + teamName + "\" is: ");
        for (Challenger mate: team){
            System.out.println("     " + mate.getName()
                    + ": jump " + mate.getHigh() + "m.");
        }
    }

    // метод для вывода информации о членах команды, прошедших дистанцию
    public void showResults(){
        System.out.println("\nOnly this chellenger(s) of team \"" + teamName + "\" finished course:");
        for (Challenger mate : team){
            if (mate.isFinish()){
                System.out.println(mate.getName());
            }
        }
    }
}
