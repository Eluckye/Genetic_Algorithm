/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all;

/**
 *
 * @author Donald_Team
 */
public class Individuo {
    public long fitness;
    public long qk;
    public int[] dna;
    
    public Individuo(int[] dna, long fitness){
        this.fitness = fitness;
        this.dna = dna;
    }

    public Individuo() {
    }
}
