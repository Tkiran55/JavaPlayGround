package OOP.Polymorphism;

public class School {
    private Person[] members;

    public School(Person[] members){
        this.members = members;
    }

    public void listAllMembers(){
        for(Person p: members){
            System.out.println("[" + p.getRole() + "] " + p.getName());
        }
    }
    public int countStudents(){

        int count = 0;
        for(Person p : members){
            if(p instanceof Student){

                count++;
            }
        }
        return count;


    }
    public int countTeachers(){

        int count = 0;
        for(Person p : members){
            if(p instanceof Teacher){
                count++;
            }
        }
        return count;

    }
    public Person findByName(String name){

        for(Person p : members){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
}
