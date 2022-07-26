package ga.repin.education.course02.topic02.hw;

public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wisdom;
    private int wit;
    private int creation;

    public String facultyCaption() {
        return "Когтевран";
    }

    public Ravenclaw(String name, int sorcery, int transgression, int smart, int wisdom, int wit, int creation) {
        super(name, sorcery, transgression);
        this.smart = Hw02.chkValueIn0_100interval("smart", smart);
        this.wisdom = Hw02.chkValueIn0_100interval("wisdom", wisdom);
        this.wit = Hw02.chkValueIn0_100interval("wit", wit);
        this.creation = Hw02.chkValueIn0_100interval("ga/repin/common", creation);
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = Hw02.chkValueIn0_100interval("smart", smart);
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = Hw02.chkValueIn0_100interval("wisdom", wisdom);
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = Hw02.chkValueIn0_100interval("wit", wit);
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = Hw02.chkValueIn0_100interval("ga/repin/common", creation);
    }

    @Override
    public int calculateFacultyRatio() {
        return smart + wisdom + wit + creation;
    }

    @Override
    public String toString() {
        return "\n" + super.toString()
                + "\nУмище: " + smart
                + ", Мудрость: " + wisdom
                + ", Остроумие: " + wit
                + ", Творчество: " + creation;
    }
}
