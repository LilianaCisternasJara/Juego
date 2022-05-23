
public class AppMarioBross {

	public static void main(String[] args) {
		
		Mario m1 = new Mario("Mario", 2, 2, "azul", "ninguno", "a la derecha", "hacia arriba", "pequenio", "normal", 1);
		Mario m2 = new MarioFuego("Mario Fuego", 3, 6, "rojo", "ninguno", "a la derecha", "hacia arriba", "grande", "grande y rojo", 2, 100);
		Mario m3 = new Mario("MarioB", 3, 6, "blanco", "tira bolas de fuego", "a la derecha", "hacia arriba", "grande", "grande y blanco", 2);
		
		
		Yoshi y1 = new Yoshi("Yoshi", 3, 5, "verde", "comer enemigos", "derecha", "arriba", 4);
		Dino d1 = new Dino ("Dino", 3, 5, "marrón", "matar", "izquierda", "arriba", false);
		Bowser b1 = new Bowser("Bowser", 5, 8, "verde", "gran poder de ataque", "izquierda", "abajo", "mucha ira");
		Peach p1 = new Peach("Peach", 2, 6, "rosada", "ser bonita", "izquierda", "abajo", false);
		Goomba g1 = new Goomba("Goomba", 2, 2, "marrón", "matar con solo chocar", "izquierda", "arriba", false);
		PlantaPoder pp1 = new PlantaPoder("Planta Poder", 2, 3, "fuego");
		
		
		
		y1.comerMatar();
		m1.chocar(d1);
		d1.chocar(m1);
		pp1.darPoder();
		y1.chocar(p1);
		d1.chocar(m1);
		
		Mario m = new MarioFuego("Mario", 3, 5, "blanco", "tirar bolas de fuego", "izquierda", "arriba", "grande", "Traje blanco", 3, 100);
		m = new MarioHelice("Mario Hélice", 3, 5, "rojo", "volar", "derecha", "izquierda", "arriba", "grande", 3, 4);
	
		m.cambiarTraje();
		m2.cambiarTraje();
		m.agacharse();
		m.chocar(d1);
		m.entrarTubo();
		m.matar();
		m.montarYoshi();
		m.morir();
		m.moverseDerecha();
		m.moverseIzquierda();
		
		
		PlantaCarnivora pc1 = new PlantaCarnivora("Planta Carnívora", 2, 4, "demasiado");
		
		pc1.aparecer();
		pc1.matarPorTocar();
		
		Hongo h1 = new Hongo("Hongo");
		
		h1.darPoder();
		h1.salirdelBloque();
		
		Tubo t1 = new Tubo("Tubo", 4, 8, "bajo el bloque");
		
		t1.ubicar();
	}
	

}
