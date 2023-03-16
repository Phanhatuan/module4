package ss4.baiTap.BT3.model;

import java.util.Date;

public class Declaration {
    private String name;
    private String birthYear;
    private String gender;
    private String nationality;
    private String id;
    private String infoMoving;
    private String idVehicle;
    private String seatNumber;
    private String startDay;
    private String endDay;
    private String recentMove;
    private String city;
    private String district;
    private String ward;
    private String street;
    private String phoneNumber;
    private String email;
    private boolean fever;
    private boolean cough;

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    private boolean breathless;
    private boolean soreThroat;
    private boolean vomiting;
    private boolean diarrhea;
    private boolean skinHemorrhage;
    private boolean rash;
    private boolean animalExposure;
    private boolean patientExposure;


    public Declaration(String name, String birthYear, String gender, String nationality, String id, String infoMoving, String idVehicle, String seatNumber, String startDay, String endDay, String recentMove, String city, String district, String ward, String street, String phoneNumber, String email, boolean fever, boolean cough, boolean breathless, boolean soreThroat, boolean vomiting, boolean diarrhea, boolean skinHemorrhage, boolean rash, boolean animalExposure, boolean patientExposure) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.nationality = nationality;
        this.id = id;
        this.infoMoving = infoMoving;
        this.idVehicle = idVehicle;
        this.seatNumber = seatNumber;
        this.startDay = startDay;
        this.endDay = endDay;
        this.recentMove = recentMove;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.street = street;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.fever = fever;
        this.cough = cough;
        this.breathless = breathless;
        this.soreThroat = soreThroat;
        this.vomiting = vomiting;
        this.diarrhea = diarrhea;
        this.skinHemorrhage = skinHemorrhage;
        this.rash = rash;
        this.animalExposure = animalExposure;
        this.patientExposure = patientExposure;
    }

    public Declaration() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public String getStartDay() {
        return startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfoMoving() {
        return infoMoving;
    }

    public void setInfoMoving(String infoMoving) {
        this.infoMoving = infoMoving;
    }

    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }


    public String getRecentMove() {
        return recentMove;
    }

    public void setRecentMove(String recentMove) {
        this.recentMove = recentMove;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isBreathless() {
        return breathless;
    }

    public void setBreathless(boolean breathless) {
        this.breathless = breathless;
    }

    public boolean isSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public boolean isVomiting() {
        return vomiting;
    }

    public void setVomiting(boolean vomiting) {
        this.vomiting = vomiting;
    }

    public boolean isDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public boolean isSkinHemorrhage() {
        return skinHemorrhage;
    }

    public void setSkinHemorrhage(boolean skinHemorrhage) {
        this.skinHemorrhage = skinHemorrhage;
    }

    public boolean isRash() {
        return rash;
    }

    public void setRash(boolean rash) {
        this.rash = rash;
    }

    public boolean isAnimalExposure() {
        return animalExposure;
    }

    public void setAnimalExposure(boolean animalExposure) {
        this.animalExposure = animalExposure;
    }

    public boolean isPatientExposure() {
        return patientExposure;
    }

    public void setPatientExposure(boolean patientExposure) {
        this.patientExposure = patientExposure;
    }

    @Override
    public String toString() {
        return "Declaration{" +
                "name='" + name + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", id='" + id + '\'' +
                ", infoMoving='" + infoMoving + '\'' +
                ", idVehicle='" + idVehicle + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                ", recentMove='" + recentMove + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", ward='" + ward + '\'' +
                ", street='" + street + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", fever=" + fever +
                ", cough=" + cough +
                ", breathless=" + breathless +
                ", soreThroat=" + soreThroat +
                ", vomiting=" + vomiting +
                ", diarrhea=" + diarrhea +
                ", skinHemorrhage=" + skinHemorrhage +
                ", rash=" + rash +
                ", animalExposure=" + animalExposure +
                ", patientExposure=" + patientExposure +
                '}';
    }
}
