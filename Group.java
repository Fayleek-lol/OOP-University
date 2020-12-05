public class Group
{
    private int groupNumber;
    private int numberOfStudents;
    private String groupSpecialty;
    
    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }
    
    public int getGroupNumber(){
        return groupNumber;
    }
    
    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents; 
    }
    
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    
    public void setGroupSpecialty(String groupSpecialty){
        this.groupSpecialty = groupSpecialty;
    }
    
    public String getGroupSpecialty(){
        return groupSpecialty;
    }
}