package com.cecurity.app1;

import java.io.File;
import java.util.Map;
import java.util.Properties;
import java.io.FileOutputStream;

public class GetPropertySample {

    public static void main(String[] args) throws Exception {

        // On récupère le dossier contenant les fichiers temporaires.
        String tempFolder = System.getProperty( "java.io.tmpdir" );
        String user_home= System.getProperty( "user.home" );
        // On récupère le séparateur de dossier associé à notre OS.
        String folderSeparator = System.getProperty( "file.separator" );
        System.out.println("Step 1 -------------------------");
        System.out.println( "user.home == " + user_home );
        System.out.println("Step 2 -------------------------");
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
        System.out.println("Step 3 -------------------------");
        // On récupère toutes les propriétés d'environnement
        Properties properties = System.getProperties();

        // Pour chacune d'entre elle, et on affiche son nom et sa valeur
        for( Object key : properties.keySet() ) {
            String value = System.getProperty( (String) key );
            System.out.printf( "%-30s == %s\n", key, value );
        }
        System.out.println("Step 4 -------------------------");
        // On génère le nom d'un fichier temporaire.
        File file = new File( tempFolder + folderSeparator + "myAppLock.txt" );
        System.out.println( "Temp file == " + file );

        // Et on créé ce nouveau fichier temporaire.
        try ( FileOutputStream fos = new FileOutputStream( file ) ) {
            fos.write( "Des données quelconques".getBytes() );
        }

        // Le fichier temporaire doit être supprimé à la fin du programme.
        file.deleteOnExit();

        // Vérifier rapidement la présence du fichier temporaire.
        Thread.sleep( 60_000 );        // Vous avez une minute !

    }

}