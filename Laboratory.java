import java.util.ArrayList;

public class Laboratory {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Professor> professors;

  public Laboratory() {
  }

  public Laboratory(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.professors = new ArrayList<Professor>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }

  public void addProfessor(Professor professor) {
    this.professors.add(professor);
  }

  public ArrayList<String> getContactInfos() {

    ArrayList<String> contactInfos = new ArrayList<String>();

    for(Professor p: professors){
      contactInfos.add(p.getContactInfo());
    }
    
    for(Student s: students){
      contactInfos.add(s.getContactInfo());
    }

    return contactInfos;
  }



  public boolean userExists(String userId) {

    ArrayList<Laboratory> lab = new ArrayList<Laboratory>();
    boolean statusId = false;

    for(Student s: students){
      statusId = s.getUserId() == userId;
    }   

    for(Professor p: professors){
      statusId = p.getUserId() == userId;
    }

    return statusId;
  }

  public int countMembers() {

  }
}