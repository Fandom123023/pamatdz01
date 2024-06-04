public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = cunning;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {return cunning;}
    public void getCunning(int cunning) {this.cunning = cunning;}
    public int getDetermination() {return determination;}
    public void setDetermination(int determination) {this.determination = determination;}
    public int getAmbition(){return ambition;}
    public void setAmbition(int ambition) {this.ambition = ambition;}
    public int getResourcefulness() {return resourcefulness;}
    public void setResourcefulness(int resourcefulness) {this.resourcefulness = resourcefulness;}
    public int getLustForPower() {return lustForPower; }
    public void setLustForPower(int lustForPower) {this.lustForPower = lustForPower;}


    protected int getPower() {
        return this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
    }

    public void printPowerDifference(Slytherin student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Слизеринец, чем %s", this.getName(), student.getName());
        }else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Слизеринец, чем %s", student.getName(), this.getName());
        }else {
            System.out.printf("%s такой же Слизеринец, как и %s", this.getName(), student.getName());
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nФакультет: Слизеринец" +
                "\nХитрость: " + this.cunning +
                "\nРешительность: " + this.determination +
                "\nАмбициозность: " + this.ambition +
                "\nНаходчивость: " + this.resourcefulness +
                "\nЖажда власти: "+ this.lustForPower;
    }
}