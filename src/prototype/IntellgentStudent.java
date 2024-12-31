package prototype;

public class IntellgentStudent extends Student{

    private int iq;

    IntellgentStudent(){

    }

    IntellgentStudent(IntellgentStudent student){
        super(student);
        this.iq = student.iq;
    }

    public IntellgentStudent clone() {
//        IntellgentStudent intellgentStudent = new IntellgentStudent();
//        intellgentStudent.setName(this.getName());
//        intellgentStudent.setAge(this.getAge());
//        intellgentStudent.setBatch(this.getBatch());
//        intellgentStudent.setPsp(this.getPsp());
//        intellgentStudent.setAvgBatchPsp(this.getAvgBatchPsp());

        return new IntellgentStudent(this);
    }
}
