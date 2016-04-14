/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Donald_Team
 */
public class Constraints {
    public String[] groups;
    public String[] lectures;
    public String[] teachers;
    public String[] rooms;
    public String[] days;
    
    /**
     * La primer posición de "classes" representa cada cromosoma del ADN.
     * classes[0][0] = 2, classes[0][1] = 0. Significa grupo 2 y lecture 0
     */
    public int[][] classes; 
    
    public HashMap<Integer,List<Integer>> group_lectures;
    public HashMap<Integer,List<Integer>> teacher_lectures;
    public HashMap<Integer,List<Integer>> lecture_rooms;
    public HashMap<Integer,List<Integer>> day_hours;
    public HashMap<Integer,List<Integer>> teacher_hours;
    public int total_hours_per_week; // = 10, si lunes a viernes de 8am a 10am
    
}
