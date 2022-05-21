public class Student {
    private int ID;
    private int Grades;
    private int Feestotal;
    private int Feespaid;
    private String Name;

    public Student (int ID, int Grades, String Name) {
        Feestotal = 10000
        Feespaid = 0

        this.name = name;
        this.Grades = Grades;
        this.ID = ID;

        public void setGrade(int Grades){
            this.Grades = Grades;
        }

        public void payFees(int Fees){
            fees paid = feespaid + fees;
        }

        // Getters and Setters
        public int getID() {
            return ID;
        }

        public int getGrades() {
            return Grades;
        }

        public int getFees() {
            return Fees;
        }

        public String getName() {
            return Name;
        }
        public int getFeesTotal() {
            return Feestotal
        }
        public int getRemainingFees(){
            return Feestotal - Feespaid;
        }
    }

}
