package prototype;

public class Client {
    public static void main(String[] args) {

    StudentRegistry studentRegistry =new StudentRegistry();

    fillRegistry(studentRegistry);

    Student amrish = studentRegistry.getRegistry("Aug24Batch").clone();
    amrish.setName("Amrish");
    amrish.setAge(24);
    amrish.setPsp(90);


    Student krish = studentRegistry.getRegistry("Aug24Batch").clone();
    krish.setName("Krish");
    krish.setAge(26);
    krish.setPsp(89);


    Student chris = studentRegistry.getRegistry("Aug24BatchIntelligent").clone();
    chris.setName("Chris");
    chris.setAge(39);


        System.out.println("DEBUG");
    }

    private static void fillRegistry(StudentRegistry studentRegistry){

        Student augBatch = new Student();
        augBatch.setBatch("Aug24Batch");
        augBatch.setAvgBatchPsp(80.0);

        studentRegistry.register("Aug24Batch",augBatch);


        Student augBatchIntelligent = new IntellgentStudent();
        augBatchIntelligent.setBatch("Aug24Batch");
        augBatchIntelligent.setAvgBatchPsp(96);

        studentRegistry.register("Aug24BatchIntelligent",augBatchIntelligent);
    }
}
