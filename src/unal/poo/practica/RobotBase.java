package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
        
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,10, 1, Direction.NORTH,10);
            
            
            
            
            
              boolean puedeTomar = estudiante.canPickThing();
                 
           if(puedeTomar == true)
               estudiante.pickThing();
           
           
           do{
            der();   
           if (estudiante.frontIsClear()== true){
               estudiante.move();
           }
            
           else{
           do{
            if(estudiante.frontIsClear()== false){
            estudiante.turnLeft();     
            }   
           }while(estudiante.frontIsClear()== false);    
           estudiante.move();
           }
        }while(estudiante.canPickThing()== false);
           estudiante.pickThing();
           
                 
            
            
            
            
	}
        public static void der (){
            estudiante.turnLeft();
             estudiante.turnLeft();
              estudiante.turnLeft();
        }
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

