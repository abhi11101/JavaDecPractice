package org.com.abhi.Chapter11_20.Chapter15.MethodReference.ConstructorReference;

public class MainClass {
    public static void main(String[] args) {

        Work work = Student::new;
        work.getStudent();

    }
}
