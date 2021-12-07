/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovel;

/**
 *
 * @author IFSC
 */
public class Automovel {
    Motor motor;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Direçao getDireçao() {
        return direçao;
    }

    public void setDireçao(Direçao direçao) {
        this.direçao = direçao;
    }
    private Direçao direçao;
    
    public void ImpressaoDadosAutomovel(){
        System.out.println("Potencia do Motor: "+motor.getPotencia());
        System.out.println("Cor da Direção: "+direçao.getCor());      
    }
    
    public void ligarPelaPrimeiraVez(){
        motor = new Motor();        
    }
    
    public void ligarPelaPrimeiraVez(int potencia){
        motor = new Motor (potencia);
    }
    
    public Automovel(){
        motor = new Motor();
        direçao = new Direçao();
    }
    
    public Automovel(int potencia, String cor){
        motor = new Motor(potencia);
        direçao = new Direçao(cor);
    }
    
    

}  

