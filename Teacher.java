public class Teacher {
    private String Name;
    private int ID;
    private int Salary;
    private int salaryEarned;


    public Teacher(int ID, int Salary, String Name){
        this.ID = ID;
        this.Name = Name;
        this.Salary = Salary;
        this.salaryEarned = 0;


        public String getName() {
            return Name;
        }


        public int getID() {
            return ID;
        }


        public int getSalary() {
            return Salary;
        }

        public void setSalary(int salary) {
            this.Salary = salary;
        }

        public int getSalaryEarned() {
            return salaryEarned;
        }

        public void setSalaryEarned(int salaryEarned) {
            this.salaryEarned = salaryEarned;

            public void recieveSalary(){
                salaryEarned = salaryEarned + Salary;
            }
        }
    }
}
