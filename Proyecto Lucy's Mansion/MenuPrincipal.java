import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es un Mundo, que comprende el menú principal del juego.
 * Con botoncitos y asi bien bonita la cosa
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.1:28.10.16
 */
class MenuPrincipal extends World{
    private IniciaJuego inicio;
    private Instrucciones instrucciones;
    private SalirJuego salirJuego;
    
    /**
     * Constructor para objetos de la clase MenuPrincipal.
     * Que en sí, en el proyecto, sólo será 1.
     */
    public MenuPrincipal(){    
        super(850, 480, 1);
        inicio = new IniciaJuego("BontonInicaJ.png");
        instrucciones = new Instrucciones("BotonInstrucciones.png");
        salirJuego = new SalirJuego("BotonSalirJ.png");
    }
    
    /**
     * Act - aquí está lo que se quiere que el mundo haga. Este método es
     * llamado cada que los botones 'Act' o 'Run' son presionados. Un ciclo.
     */
    public void act(){
        dibujaMenu();
    }
    
    private void dibujaMenu(){
        showText("Menú Principal", 425, 140);
        
        addObject(inicio, 425, 300);
        addObject(instrucciones, 425, 400);
        addObject(salirJuego, 425, 500);
    }
}
