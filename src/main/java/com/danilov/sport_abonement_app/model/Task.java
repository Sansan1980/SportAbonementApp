package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private double rental;
    private double individualTraining;
    private List<String> commentary;

//    private double excursionThreeMan;
//    private double excursionMoreThreeMan;
//     private  double rentingSled;
//     private  double carriageRental;
//     private  double ponyRental;
//     private double coefficient;
//     private double other;
//     private long employeeId;

    // gpt накидал
    //  private Long id;
    //    private String title;
    //    private String description;
    //    private LocalDateTime startDate;
    //    private LocalDateTime endDate;
    //    private String status;
    //    private String priority;
    //    private User assignedTo;
    //    private String recurrence;
    //    private String location;
    //    private List<User> participants;
    //    private LocalDateTime createdDate;
    //    private LocalDateTime updatedDate;


    public Task() {
        this.rental = rental;
        this.individualTraining = individualTraining;
        this.commentary = new ArrayList<String>();

//        this.excursionThreeMan = excursionThreeMan;
//        this.excursionMoreThreeMan = excursionMoreThreeMan;
//        this.rentingSled = rentingSled;
//        this.carriageRental = carriageRental;
//        this.ponyRental = ponyRental;
//        this.coefficient = coefficient;
//        this.other = other;
//        this.employeeId = employeeId;
    }

    public double getRental() {
        return rental;
    }

    public void setRental(double rental) {
        this.rental = rental;
    }

    public double getIndividualTraining() {
        return individualTraining;
    }

    public void setIndividualTraining(double individualTraining) {
        this.individualTraining = individualTraining;
    }
    public List<String> getCommentary() {
        return commentary;
    }

    public void setCommentary(List<String> commentary) {
        this.commentary = commentary;
    }
//
//    public double getExcursionThreeMan() {
//        return excursionThreeMan;
//    }
//
//    public void setExcursionThreeMan(double excursionThreeMan) {
//        this.excursionThreeMan = excursionThreeMan;
//    }
//
//    public double getExcursionMoreThreeMan() {
//        return excursionMoreThreeMan;
//    }
//
//    public void setExcursionMoreThreeMan(double excursionMoreThreeMan) {
//        this.excursionMoreThreeMan = excursionMoreThreeMan;
//    }
//
//    public double getRentingSled() {
//        return rentingSled;
//    }
//
//    public void setRentingSled(double rentingSled) {
//        this.rentingSled = rentingSled;
//    }
//
//    public double getCarriageRental() {
//        return carriageRental;
//    }
//
//    public void setCarriageRental(double carriageRental) {
//        this.carriageRental = carriageRental;
//    }
//
//    public double getPonyRental() {
//        return ponyRental;
//    }
//
//    public void setPonyRental(double ponyRental) {
//        this.ponyRental = ponyRental;
//    }
//
//    public double getCoefficient() {
//        return coefficient;
//    }
//
//    public void setCoefficient(double coefficient) {
//        this.coefficient = coefficient;
//    }
//
//    public double getOther() {
//        return other;
//    }
//
//    public void setOther(double other) {
//        this.other = other;
//    }
//
//    public long getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(long employeeId) {
//        this.employeeId = employeeId;
//    }
}
