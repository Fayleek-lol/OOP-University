public class Subject 
{
    private int codeOfSubject;
    private String nameOfSubject;
    private int numberOfHoursOfTheSubject;
    private String subjectControlType;
    private String typeOfSubject;
  
    public void setCodeOfSubject(int codeOfSubject){
        this.codeOfSubject = codeOfSubject;
    }
  
    public int getCodeOfSubject(){
        return codeOfSubject;
    }
    
    public void setNameOfSubject(String nameOfSubject){
        this.nameOfSubject = nameOfSubject;
    }
    
    public String getNameOfSubject(){
        return nameOfSubject;
    }
    
    public void setNumberOfHoursOfTheSubject(int numberOfHoursOfTheSubject){
        this.numberOfHoursOfTheSubject = numberOfHoursOfTheSubject;
    }
    
    public int getNumberOfHoursOfTheSubject(){
        return numberOfHoursOfTheSubject;
    }
    
    public void setSubjectControlType(String subjectControlType){
        this.subjectControlType = subjectControlType;
    }
    
    public String getSubjectControlType(){
        return subjectControlType;
    }
    
    public void setTypeOfSubject(String typeOfSubject){
        this.typeOfSubject = typeOfSubject;
    }
    
    public String getTypeOfSubject(){
        return typeOfSubject;
    }
}