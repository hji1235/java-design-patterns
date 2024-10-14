package patterns.builder.simplebuilder;

public class Student {
    private final int id;
    private String name;
    private String grade;
    private String phoneNumber;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.grade = builder.grade;
        this.phoneNumber = builder.phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder {
        private int id;
        private String name;
        private String grade;
        private String phoneNumber;

        public Builder(int id) { // 생성자를 통해 필수값 설정
            this.id = id;
        }

        public Builder name(String name) {
            // 멤버 검증 로직
            if (name.length() > 3) {
                throw new IllegalArgumentException(name);
            }
            this.name = name;
            return this;
        }

        public Builder grade(String grade) {
            this.grade = grade;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
