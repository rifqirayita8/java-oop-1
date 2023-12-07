/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymClass;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Adam R
 */
public class Training {
    private String nameTrain;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    /**
     * Initializes a training program with the given name, start date, and end date.
     * @param nameTrain The name of the training program.
     * @param dateStart The start date of the training program.
     * @param dateEnd The end date of the training program.
     */
    public Training(String nameTrain, LocalDate dateStart, LocalDate dateEnd) {
        this.nameTrain = nameTrain;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }
    
    /**
     * Gets the name of the training program.
     * @return The name of the training program.
     */
    public String getNameTrain() {
        return nameTrain;
    }

    /**
     * Sets the name of the training program.
     * @param nameTrain The new name of the training program.
     */
    public void setNameTrain(String nameTrain) {
        this.nameTrain = nameTrain;
    }

  
    // tambahkan konstruktor dan metode lainnya
    
    /**
     * Gets the start date of the training program.
     * @return The start date of the training program.
     */
    public LocalDate getDateStart() {
        return dateStart;
    }
    
    /**
     * Sets the start date of the training program.
     * @param dateStart The new start date of the training program.
     */
    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }
    
    /**
     * Gets the end date of the training program.
     * @return The end date of the training program.
     */
    public LocalDate getDateEnd() {
        return dateEnd;
    }
    
    /**
     * Sets the end date of the training program.
     * @param dateEnd The new end date of the training program.
     */
    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Training{" + "nameTrain=" + nameTrain + ", dateStart=" + dateStart + ", dateEnd=" + dateEnd + '}';
    }
    
    
    
}
