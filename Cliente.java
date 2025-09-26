import java.util.ArrayList;
import java.util.List;

import Prototipo.Personaje;
import PrototiposConcretos.Arquero;
import PrototiposConcretos.Guerrero;
import PrototiposConcretos.Mago;

public class Cliente {
    
      public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();

        // Personajes base
        Guerrero guerreroBase = new Guerrero("GuerreroBase", 1, "Espada");
        Mago magoBase = new Mago("MagoBase", 1, "Bola de Fuego");
        Arquero arqueroBase = new Arquero("ArqueroBase", 1, "Arco Largo");

        // Clonación
        Personaje g1 = guerreroBase.clone();
        Personaje g2 = guerreroBase.clone();
        Personaje m1 = magoBase.clone();
        Personaje m2 = magoBase.clone();
        Personaje a1 = arqueroBase.clone();
        Personaje a2 = arqueroBase.clone();

        personajes.add(g1);
        personajes.add(g2);
        personajes.add(m1);
        personajes.add(m2);
        personajes.add(a1);
        personajes.add(a2);

      for (Personaje p : personajes) {
            p.mostrarInfo();
            
        }

        g2.setNombre("Guerrero 2");
        m2.setNombre("Mago 2");
        a2.setNombre("Arquero 2");

        System.out.println("\n");
        System.out.println("Después de modificar algunos personajes:\n");

      for (Personaje p : personajes) {
            p.mostrarInfo();
        }
    }
}
