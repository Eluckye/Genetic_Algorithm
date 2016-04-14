/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all;

import java.util.List;

/**
 *
 * @author Donald_Team
 */
public abstract class Genetic_Reproducer {

    protected final int parents_number;
    protected final int max_population;
    protected final int max_generations;
    protected final double mutation_probability;
    protected final long k;
    protected long current_best_fitness = -1;
    protected int current_generation = 0;
    protected List<Individuo> population;

    public Genetic_Reproducer(int parents_number, int max_population, 
            int max_generations, double mutation_probability, long k) {
        this.parents_number = parents_number;
        this.max_population = max_population;
        this.max_generations = max_generations;
        this.mutation_probability = mutation_probability;
        this.k = k;
        
        generate_initial_population();
    }
    
    public Individuo reproduce(){
        for (;current_generation<max_generations;current_generation++){
            crossover();
            selection();
        }
        return population.get(0);
    }
    
    protected void generate_initial_population(){
        
    }
    
    protected long calculate_fitness(int[] dna){
        return -1;
    }
    
    protected void sort_population(){
        
    }
    

    protected abstract void crossover();
    protected abstract void selection();
}
