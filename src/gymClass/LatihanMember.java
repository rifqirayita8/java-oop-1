/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymClass;

/**
 *
 * @author Adam R
 */
public class LatihanMember {
    private Member member;
    private Instructor instructor;
    private Training training; 

    public LatihanMember(Member member, Instructor instructor, Training training) {
        this.member = member;
        this.instructor = instructor;
        this.training = training;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    @Override
    public String toString() {
        return "LatihanMember{" + "member=" + member.getNama() + ", instructor=" + instructor.getName() + ", training=" + training + '}';
    }
    
    
    
}
