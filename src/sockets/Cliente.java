package sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import sockets.Conexion;
import java.util.Scanner;

public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
        try
        {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escribe tu nombre: ");
            String nombre = scanner.next();
            
            salidaServidor.writeUTF("Nombre " + nombre + "\n");
            
            //Se enviarán dos mensajes
            for (int i = 0; i < 5; i++)
            {
                //Se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n");
            }
            
            

            cs.close();//Fin de la conexión

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

// Fuente: https://www.programarya.com/Cursos-Avanzados/Java/Sockets