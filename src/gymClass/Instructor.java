/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymClass;

//import Class.*;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Adam R
 */

/**
 * The `Instructor` class represents a fitness instructor in the Gym Sigma application.
 */
public class Instructor {
    private String name;
    private int experience;
    private List<Training>  dataTrainer;

    /**
     * Initializes an instructor with the given name and experience.
     * @param name The name of the instructor.
     * @param experience The years of experience of the instructor.
     */
    public Instructor(String name, int experience) {
        this.name = name;
        this.experience = experience;
        this.dataTrainer= new LinkedList<Training>();
    }
    
    /**
     * Gets the list of training programs associated with this instructor.
     * @return A list of training programs.
     */
    public List<Training> getDataTrainer() {
        return dataTrainer;
    }
    
    public List<Training> getTrainings() {
        // Implementasikan metode ini sesuai dengan kebutuhan Anda
        return dataTrainer;
    }
    
    /**
     * Generates a string containing a list of training programs associated with this instructor.
     * @return A string representation of the instructor's training programs.
     */
    public String printDataTrainer(){
        String str = "";
        for(int i = 0 ; i < dataTrainer.size(); i++){
            str = str + i + " : " + dataTrainer.get(i).getNameTrain() + "\n";
        }
        return str;
    }
    

    /**
     * Gets the name of the instructor.
     * @return The name of the instructor.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the years of experience of the instructor.
     * @return The years of experience.
     */
    public int getExperience() {
        return experience;
    }
    
    /**
     * Sets the name of the instructor.
     * @param name The new name of the instructor.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the years of experience of the instructor.
     * @param experience The new years of experience.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    /**
     * Returns a string representation of the instructor, including their associated training programs.
     * @return A string representing the instructor and their training programs.
     */
    @Override   
    public String toString() {
        return "Instructor{" + "name=" + name + ", experience=" + experience + ", dataTrainer=" + dataTrainer + '}';
    }

    /**
     * Adds a training program to the instructor's list of training programs.
     * @param T2 The training program to be added.
     */
    public void addTraining(Training T2) {
        dataTrainer.add(T2);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

