public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMadgic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMadgic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility(){return nobility;}
    public void setNobility(int nobility){this.nobility = nobility;}
    public int getHonor(){return.honor;}
    public void setHonor(int honor) {this.honor = honor;}
    public int getBravery(){return bravery;}
    public void setBravery(int bravery){this bravery = bravery;}

    protected int getPower(){
        return this.nobility + this.honor + this.bravery;

        public void printPowerDifference(Gryffindor student){
            if (this.getPower() > student.getPower()) {
                System.out.println("%s лучший Гриффиндорец, чем %s", this.getName(), student.getName());
            }else if (this .getPower() < student.getPower()) {
                System.out.println("%s лучший Гриффиндорец чем %s", student.getName(), this.getName());
            }else {
                System.out.println("%s такой же Гриффиндорец, как и %s", this.getName(), student.getName());

                @Override
                public String toString() {
                    return super.toString() +
                    "\nФакультет:Гриффиндор" +
                    "\nБлагородство: " + this.nobility +
                    "\nЧесть:" + this.honor +
                    "\nХрабрость: " + this.bravery;
                }
            }
        }
    }

}
