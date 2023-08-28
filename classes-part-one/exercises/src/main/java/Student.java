public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public String getName() {
                return name;
        }
        public int getStudentId(){
                return studentId;
        }
        private int getNumberOfCredits(){
                return numberOfCredits;
        }
        public double getGpa(){
                return gpa;
        }

        public void setName(String name){
               this.name = name;
        }
        public void setStudentId(int studentId){
                this.gpa = gpa;
        }
        public void setNumberOfCredits(int numberOfCredits){
                this.numberOfCredits = numberOfCredits;
        }
        public void setGpa(double gpa){
                this.gpa = gpa;
        }
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
