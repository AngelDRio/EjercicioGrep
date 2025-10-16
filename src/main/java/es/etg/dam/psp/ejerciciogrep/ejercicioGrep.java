package es.etg.dam.psp.ejerciciogrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class EjemploGrep {

    private static final String[] COMANDO_GREP = {"grep", "-i", "psp"};

    private static final String[] LINEASTEXTO = {
        "Me gusta PSP y java",
        "PSP se programa en java",
        "es un módulo de DAM",
        "y se programa de forma concurrente en PSP",
        "PSP es programación."
    };

    public static void main(String[] args) throws IOException, InterruptedException {
        Process proceso = Runtime.getRuntime().exec(COMANDO_GREP);
        escribirEntrada(proceso);
        List<String> resultadoSalida = leerSalida(proceso);
        System.out.println(resultadoSalida);
    }

    //Escribe las líneas definidas en la constante en la entrada del proceso
    private static void escribirEntrada(Process proceso) throws IOException {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(proceso.getOutputStream()));
            for (String linea : LINEASTEXTO) {
                pw.println(linea);
            }
            pw.flush();
    }

    //Lee la salida del proceso (las líneas que contienen “psp”)
    private static List<String> leerSalida(Process proceso) throws IOException {
        List<String> salida = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                salida.add(linea);
            }
            return salida;
    }
}
