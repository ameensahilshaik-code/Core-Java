package com.example.encapsulation;

    public class Student {
        // Private data (hiding data)
        private String name;
        private int age;
        private String course;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Age must be positive!");
            }
        }

        public void setCourse(String course) {
            this.course = course;
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCourse() {
            return course;
        }


        public void displayInfo() {
            System.out.println("Student Name : " + name);
            System.out.println("Age          : " + age);
            System.out.println("Course       : " + course);
        }

        public static void main(String[] args) {
            Student s = new Student();
            s.setName("Ameen");
            s.setAge(20);
            s.setCourse("Java Programming");

            s.displayInfo();
        }
    }
