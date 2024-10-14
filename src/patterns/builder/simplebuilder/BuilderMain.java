package patterns.builder.simplebuilder;

public class BuilderMain {
    public static void main(String[] args) {
        Student student = new Student.Builder(1)
                .name("최민현")
                .grade("A")
                .phoneNumber("01012345678")
                .build();
        System.out.println(student);
    }
}
