public class Audience 
{
    private int audienceNumber;
    private int numberOfPlaces;
    private String audienceType;
    private boolean availabilityOfEquipment;
    
    public void setAudienceNumber(int audienceNumber){
        this.audienceNumber = audienceNumber;
    } 
    
    public int getAudienceNumber(){
        return audienceNumber;
    }
    
    public void setNumberOfPlaces(int numberOfPlaces){
        this.numberOfPlaces = numberOfPlaces;
    }
    
    public int getNumberOfPlaces(){
        return numberOfPlaces;
    }
    
    public void setAudienceType(String audienceType){
        this.audienceType = audienceType;
    }
    
    public String getAudienceType(){
        return audienceType;
    }
    
    public void setAvailabilityOfEquipment(boolean availabilityOfEquipment){
        this.availabilityOfEquipment = availabilityOfEquipment;
    }
    
    public boolean getAvailabilityOfEquipment(){
        return availabilityOfEquipment;
    }
}