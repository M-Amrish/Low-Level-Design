package builder;

public class Client {

    public static void main(String[] args) {

        //Builder builder = new Builder();

//        Builder builder = Student.getBuilter();
//
//
//        builder.setName("Amrish");
//        builder.setAge(24);
//        builder.setPsp(22.2);
//        builder.setGradYear(2021);
//
//        Student student = builder.build();

        Student student = Student.getBuilter()
                .setName("Amrish")
                .setAge(24)
                .setBatch("Apl 23")
                .setGradYear(2022)
                .setUnivName("VCET")
                .build();

    }

}
