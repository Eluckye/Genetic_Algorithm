/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.reproducers;

import all.Genetic_Reproducer;

/**
 *
 * @author francisco
 */
public class Reproducer_Best_Less_Conflicts extends Genetic_Reproducer{
    
    public Reproducer_Best_Less_Conflicts(int parents_number, int max_population, int max_generations, double mutation_probability, long k) {
        super(parents_number, max_population, max_generations, mutation_probability, k);
    }
    
    protected void crossover(){
        
    }
    
    protected void selection(){
        
    }
}
