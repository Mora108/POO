public class Student {
    private final int id;
    private final String name;
    private int[] grades;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
        this.grades = new int[5];
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int[] getGrades(){
        return this.grades;
    }

    public double getFinalGrade(){
        int sum = 0;
        for(int grade: this.grades){
            sum += grade;
        }

        return ((double)sum / this.grades.length);
    }

    public void setScore(int activityNumer, int score){
        int index = activityNumer - 1;

        if (index < this.grades.length){
            this.grades[activityNumer - 1] = score;
        }
    }

    public void setGrades(int...grades){
        if (grades.length == this.grades.length){
            for (int i = 0; i < this.grades.length; i++){
                this.grades[i] = grades[i];
            }
        }
    }
}
