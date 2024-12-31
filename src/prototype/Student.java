package prototype;

public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private String batch;
    private double psp;
    private double avgBatchPsp;

    Student(){

    }

    Student(Student student){

        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.psp = student.psp;
        this.avgBatchPsp = student.avgBatchPsp;
    }

    @Override
    public Student clone() {

        Student student = new Student();

//        student.name = this.name;
//        student.age = this.age;
//        student.batch = this.batch;
//        student.psp = this.psp;
//        student.avgBatchPsp = this.avgBatchPsp;

        return new Student(student);
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String getBatch() {
//        return batch;
//    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

//    public double getPsp() {
//        return psp;
//    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

//    public double getAvgBatchPsp() {
//        return avgBatchPsp;
//    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }


}
