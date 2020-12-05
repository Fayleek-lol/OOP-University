class Main{
    public static void main(String args []){
        Chair chair = new Chair();
        
        chair.getLect().getAud().setAudienceNumber(56);
        chair.getLect().getAud().setNumberOfPlaces(12);
        chair.getLect().getAud().setAudienceType("практическая");
        chair.getLect().getAud().setAvailabilityOfEquipment(true);
        
        chair.getLect().getSub().setCodeOfSubject(345);
        chair.getLect().getSub().setNameOfSubject("ТРПО");
        chair.getLect().getSub().setNumberOfHoursOfTheSubject(20);
        chair.getLect().getSub().setSubjectControlType("диференцированный зачет");
        chair.getLect().getSub().setTypeOfSubject("технический");
        
        chair.getLect().setLecturerNumder("88005553535");
        chair.getLect().setAddressLecturer(" у.Маяковского 69");
        chair.getLect().setNameLecturer("Зубенко Михаил Петрович");
        chair.getLect().setPostOfLecturer("преподователь");
        
        chair.getGro().setGroupNumber(95);
        chair.getGro().setNumberOfStudents(11);
        chair.getGro().setGroupSpecialty("информационные технологии");
        
        chair.setCodeChair(1357);
        chair.setNameChair("Информатика");
        chair.setManagerNumber("89123583975");
        
        chair.printAboutObject();
    }
}