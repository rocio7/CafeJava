public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menú (agrega precio de bebida para café de filtro, café con leche y capuchino)
        double precioMocha = 3.5;
        double precioCafefiltro = 2.0;
        double precioCafeleche = 4.5;
        double precioCapucchino = 2.5;

    
        // Variables de nombre de cliente (agrega Cliente  Sam, Jimmy y Noah)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";

    
        // Finalizaciones de pedidos (agrega las finalizaciones de los pedidos 1,2,3 y 4)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = true;


    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //

        //Cindhuri pidió un café.
        // Ahora mostramos el mensaje de estado de su pedido .

        System.out.println(cliente1 + mensajePendiente);

        //Noah pidió un capuchino. Utiliza una sentencia if para comprobar el estado de su pedido e imprimir el mensaje de estado correcto. 
        //Si está listo, imprime también el mensaje para mostrar el total. Nota: Los resultados pueden ser diferentes según lo que asignaste como estado.
        if (estaListoOrden4) {
            System.out.println(cliente4 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCapucchino);
        }
        else {
            System.out.println(cliente4 + mensajePendiente);
        }

        //Sam acaba de pedir 2 cafés con leche, imprime el mensaje para mostrar el total. A continuación, utiliza una sentencia if para imprimir el mensaje 
        //de estado del pedido correspondiente. Cambia el valor de la bandera estaListo de verdadero a falso, o viceversa, para probar tu lógica de control
        // (sentencia if).

        System.out.println(mensajeMostrarTotal + (precioCafeleche * 2));

        if (estaListoOrden2) {
            System.out.println(cliente2 + mensajeListo);
        }
        else {
            System.out.println(cliente2 + mensajePendiente);
        }

        //Jimmy acaba de darse cuenta de que le cobraron por un café, pero había pedido un café con leche. 
        //Imprime el mensaje total con el nuevo total calculado (lo que debe) para compensar la diferencia.

        System.out.println(cliente3+"," + mensajeMostrarTotal + (precioCafeleche - precioCafefiltro));

    }
}