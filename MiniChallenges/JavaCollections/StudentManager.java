package JavaCollections;

import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Map<String, Student> studentMap = new HashMap<>();


    public void addStudent(Student s) {
        students.add(s);
        studentMap.put(s.getId(), s);
    }

    public void removeStudent(String id) {
        Student s = studentMap.remove(id);
        if (s != null) {
            students.remove(s);
        }
    }

    public Student findById(String id) {
        return studentMap.get(id);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getTopStudent() {
        if (students.isEmpty()) return null;

        Student top = students.getFirst();
        for (Student s : students) {
            if (s.getGrade() > top.getGrade()) {
                top = s;
            }
        }
        return top;
    }

    public double getAverageGrade() {
        if(studentMap.isEmpty()) return 0.0;

        double sum = 0;
        for(Student s :students){
            sum += s.getGrade();
        }
        return sum / students.size();
    }

    public List<Student> getStudentsSortedByGrade(){
        List<Student> sortedList = new ArrayList<>(students);

        //Collections.sort(sortedList, (o1, o2) -> Double.compare(o2.getGrade(), o1.getGrade()));
        //sortedList.sort(Comparator.comparing(Student::getGrade).reversed());

        Collections.sort(sortedList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getGrade(),o1.getGrade());
            }
        });
        return sortedList;
    }

    public List<Student> getStudentsSortedByName() {
        List<Student> sortedList = new ArrayList<>(students);

        //sortedList.sort(Comparator.comparing(Student::getName));

        Collections.sort(sortedList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        return sortedList;
    }

}
