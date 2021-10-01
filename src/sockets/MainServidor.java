package sockets;

import java.io.IOException;
import sockets.Servidor;


//Clase principal que hará uso del servidor
public class MainServidor
{
    public static void main(String[] args) throws IOException
    {
        Servidor serv = new Servidor(); //Se crea el servidor

        System.out.println("Iniciando servidor\n");
        serv.startServer(); //Se inicia el servidor
    }
}

// Fuente: https://www.programarya.com/Cursos-Avanzados/Java/Sockets