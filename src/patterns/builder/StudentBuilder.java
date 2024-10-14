package patterns.builder;

public class StudentBuilder {
    private int id;
    private String name;
    private String grade = "B"; // 기본값으로 설정
    private String phoneNumber;

    public StudentBuilder(int id) { // 생성자를 통해 필수값 설정
        this.id = id;
    }

    public StudentBuilder name(String name) {
        // 멤버 검증 로직
        if (name.length() > 3) {
            throw new IllegalArgumentException(name);
        }
        this.name = name;
        return this;
    }

    public StudentBuilder grade(String grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Student build() {
        return new Student(id, name, grade, phoneNumber);
    }
}
