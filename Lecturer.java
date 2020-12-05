public class Lecturer 
{
    private Audience aud;
    private Subject sub;
    private String lecturerNumder;
    private String nameLecturer;
    private String addressLecturer;
    private String postOfLecturer;
    
    public Lecturer(){
        this.aud = new Audience();
        this.sub = new Subject();
    }
    
    public Audience getAud(){
        return aud;
    }
    
    public Subject getSub(){
        return sub;
    }
    
    public void setLecturerNumder(String lecturerNumder){
        this.lecturerNumder = lecturerNumder;
    }
    
    public String getLecturerNumder(){
        return lecturerNumder;
    }
    
    public void setAddressLecturer(String addressLecturer){
        this.addressLecturer = addressLecturer;
    }
    
    public String getAddressLecturer(){
        return addressLecturer;
    }
    
    public void setNameLecturer(String nameLecturer){
        this.nameLecturer = nameLecturer;
    } 
    
    public String getNameLecturer(){
        return nameLecturer;
    }
    
    public void setPostOfLecturer(String postOfLecturer){
        this.postOfLecturer = postOfLecturer;
    }
    
    public String getPostOfLecturer(){
        return postOfLecturer;
    }
}