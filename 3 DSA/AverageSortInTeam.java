class Team {
    String teamName;
    int p1Age, p2Age;
    Team(String n,int p1,int p2) {
        teamName = n;
        p1Age = p1;
        p2Age = p2;
    }

    boolean lessThan(Team t) {
        if (Math.abs(this.p1Age - this.p2Age) < Math.abs(t.p1Age - t.p2Age)) return true;
        else return false;
    }
}

public class AverageSortInTeam {
    public static void main(String[] args) {
        Team[] teams = new Team[5];
        
        teams[0] = new Team("TeanA", 20, 30);
        teams[1] = new Team("TeanB", 35, 15);
        teams[2] = new Team("TeanC", 15, 19);
        teams[3] = new Team("TeanD", 17, 25);
        teams[4] = new Team("TeanE", 40, 19);

        for (int i = 0; i < teams.length - 1; i++) {
            for (int j = 0; j < teams.length - 1 - i; j++) {
                if (teams[j].lessThan(teams[j + 1])) {
                    Team temp = teams[j];
                    teams[j] = teams[j + 1];
                    teams[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i].teamName);
        }
    }
}
