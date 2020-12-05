public class Chair 
{
    private Lecturer lect;
    private Group gro;
    private int codeChair;
    private String nameChair;
    private String managerNumber;
    
    public Chair(){
        this.lect = new Lecturer();
        this.gro = new Group();
    }
    
    public Lecturer getLect(){
        return lect;
    }
    
    public Group getGro(){
        return gro;
    }
    
    public void setCodeChair(int codeChair){
        this.codeChair = codeChair;
    }
    
    public int getCodeChair(){
        return codeChair;
    }
    
    public void setNameChair(String nameChair){
        this.nameChair = nameChair;        
    }
    
    public String getNameChair(){
        return nameChair;
    }
    
    public void setManagerNumber(String managerNumber){
        this.managerNumber = managerNumber;
    }
    
    public String getManagerNumber(){
        return managerNumber;
    }
    
    public void printAboutObject(){
        System.out.println("Кафедра:");
        System.out.println("Название - " + nameChair);
        System.out.println("Код - " + codeChair);
        System.out.println("Номер заведующего кафедрой - " + managerNumber);
        System.out.println();
        System.out.println("Преподователь:");
        System.out.println("ФИО - " + this.lect.getNameLecturer());
        System.out.println("Должность - " + this.lect.getPostOfLecturer());
        System.out.println("Номер - " + this.lect.getLecturerNumder());
        System.out.println("Адрес - " + this.lect.getAddressLecturer());
        System.out.println();
        System.out.println("Группа");
        System.out.println("Номер группы - " + this.gro.getGroupNumber());
        System.out.println("Специальность - " + this.gro.getGroupSpecialty());
        System.out.println("Количество человек - " + this.gro.getNumberOfStudents());
        System.out.println();
        System.out.println("Предмет: ");
        System.out.println("Название - " + this.lect.getSub().getNameOfSubject());
        System.out.println("Код - " + this.lect.getSub().getCodeOfSubject());
        System.out.println("Количество часов - " + this.lect.getSub().getNumberOfHoursOfTheSubject());
        System.out.println("Тип предмета - " + this.lect.getSub().getTypeOfSubject());
        System.out.println("Тип контроля - " + this.lect.getSub().getSubjectControlType());
        System.out.println();
        System.out.println("Аудитория:");
        System.out.println("Номер - " + this.lect.getAud().getAudienceNumber());
        System.out.println("Количество мест - " + this.lect.getAud().getNumberOfPlaces());
        System.out.println("Тип аудитории - " + this.lect.getAud().getAudienceType());
        System.out.println("Наличие техники - " + this.lect.getAud().getAvailabilityOfEquipment());
    }
}