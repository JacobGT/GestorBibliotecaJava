import java.util.Arrays;
import java.util.Scanner;

public class menu {
    public void menuOpciones(){
        boolean salir = false;
        System.out.println("Bienvenido al gestor de biblioteca virtual." +
                "\nPor favor ingrese una opcion:" +
                "\n---------------------------------------------------------------" +
                "\n1) Agregar obras a la biblioteca." +
                "\n2) Agregar prestamo." +
                "\n3) Ver obras disponibles." +
                "\n4) Ver ususarios y sus prestamos" +
                "\n5) Actualizar prestamo" +
                "\n6) Salir." +
                "\n---------------------------------------------------------------");
        System.out.print("Ingrese una opcion:");
        Scanner input = new Scanner(System.in);
        int menuop = input.nextInt();
        int posUser = 0;
        int numLibros = 0;
        int menuop2;
        System.out.print("Cuantas obras desea ingresar?");
        int cant = input.nextInt();
        Libros[] libro = new Libros[cant];
        Revistas[] revista = new Revistas[cant];
        Otros[] otro = new Otros[cant];
        System.out.print("Cuantos usuarios van a hacer un prestamo?");
        int cantTwo = input.nextInt();
        Usuarios[] user = new Usuarios[cantTwo];
        while (!salir){
            if (menuop == 1){
                System.out.println("Agruegue obras a la biblioteca.");
                System.out.println("Que tipo de obra es:" +
                        "\n1) Libro." +
                        "\n2) Revista." +
                        "\n3) Otros.");
                System.out.print("Ingrese una opcion:");
                menuop2 = input.nextInt();
                if (menuop2 == 1){
                    for (int posLibro = 0; posLibro < cant; posLibro++) {
                        Libros libTemp = new Libros();
                        System.out.print("Ingrese el Titulo: ");
                        input.nextLine();
                        libTemp.setTitulo(input.nextLine());
                        //libro[posLibro].titulo = input.nextLine();
                        System.out.print("Ingrese el nombre del autor: ");
                        libTemp.setAutor(input.nextLine());
                        System.out.print("Ingrese el anno de publicacion: ");
                        //int annopub = input.nextInt();
                        libTemp.setAnoPub(input.nextInt());
                        //libro[posLibro].anoPub = annopub;
                        input.nextLine();
                        System.out.print("Ingrese el genero del libro:");
                        //String gen = input.nextLine();
                        libTemp.setGenero(input.nextLine());
                        //libro[posLibro].genero = gen;
                        System.out.print("Ingrese el volumen del libro(si no tiene volumen especificado ingrese 1):");
                        libTemp.setVolumen(input.nextInt());
                        //int vol = input.nextInt();
                        //libro[posLibro].volumen = vol;
                        //libro[posLibro].disponible = true;
                        libTemp.setDisponible(true);
                        libro[posLibro] = libTemp;
                        numLibros = numLibros + 1;
                        //posLibro = posLibro + 1;
                        //System.out.println(libro);
                    /*System.out.println();
                    for (int counter = 0; counter < 10; counter++){
                        System.out.println(libro[posLibro]);
                    }*/
                        System.out.println("Libro ingresado con exito.");
                    }
                } else if (menuop2 == 2){
                    for (int posRev = 0; posRev < cant; posRev++) {
                        Revistas revTemp = new Revistas();
                        System.out.print("Ingrese el Titulo:");
                        revTemp.titulo = input.nextLine();
                        System.out.println("Ingrese el autor:");
                        revTemp.autor = input.nextLine();
                        //revista[posRev].autor.nombre = autor;
                        System.out.println("Ingrese el anno de publicacion:");
                        revTemp.anoPub = input.nextInt();
                        //revista[posRev].anoPub = annopub;
                        System.out.println("Ingrese el numero de edicion de la revista:");
                        revTemp.edicion = input.nextInt();
                        //revista[posRev].edicion = edNum;
                        System.out.println("Ingrese el genero de la revista:");
                        revTemp.genero = input.nextLine();
                        //revista[posRev].genero = genero;
                        System.out.println("Ingrese el mes de publicacion de la revista(en valor numerico):");
                        revTemp.mesPublicacion = input.nextInt();
                        //revista[posRev].mesPublicacion = mesPub;
                        //revista[posRev].disponible = true;
                        revTemp.disponible = true;
                        revista[posRev] = revTemp;
                        numLibros = numLibros + 1;
                        System.out.println("Revista ingresada con exito.");
                    }
                } else if (menuop2 == 3){
                    for (int posOtro = 0; posOtro < cant; posOtro++) {
                        Otros otroTemp = new Otros();
                        System.out.print("Ingrese el Titulo:");
                        otroTemp.titulo = input.nextLine();
                        //otro[posOtro].titulo = nombre;
                        System.out.println("Ingrese el autor:");
                        otroTemp.autor = input.nextLine();
                        //otro[posOtro].autor.nombre = autor;
                        System.out.println("Ingrese el anno de publicacion:");
                        otroTemp.anoPub = input.nextInt();
                        //otro[posOtro].anoPub = annopub;
                        System.out.println("Ingrese el tipo de documento (si no ponga N/A):");
                        otroTemp.tipoDoc = input.nextLine();
                        //otro[posOtro].tipoDoc = tipoDoc;
                        System.out.println("Ingrese cual quier otra informacion extra, o N/A:");
                        otroTemp.otraInfo = input.nextLine();
                        //otro[posOtro].otraInfo = otraInfo;
                        otroTemp.disponible = true;
                        //otro[posOtro].disponible = true;
                        otro[posOtro] = otroTemp;
                        numLibros = numLibros + 1;
                        System.out.println("Documento ingresado con exito.");
                    }
                } else {
                    System.out.println("Error. Opcion no valida.");
                    salir = true;
                }
            } else if (menuop == 2){
                if (numLibros <= 0){
                    System.out.println("Error... no hay libros en la biblioteca virtual.");
                    salir = true;
                } else {
                    for (int userPos = 0; userPos < cantTwo; userPos++) {
                        Usuarios userTemp = new Usuarios();
                        System.out.println("Agregue prestamo.");
                        System.out.print("Ingrese el nombre del usuario:");
                        input.nextLine();
                        userTemp.nombre = input.nextLine();
                        //user[posUser].nombre = nombre;
                        System.out.print("Ingrese el apellido del usuario:");
                        userTemp.apellido = input.nextLine();
                        //user[posUser].apellido = apellido;
                        System.out.println("\nLibros:");
                        for (int posLibro = 0; posLibro < cant; posLibro++) {
                            System.out.println("\n---------------------\n" + (posLibro+1) + "\n");
                            System.out.println(libro[posLibro]);
                        }
                        System.out.println("\nRevistas:");
                        for (int posRev = 0; posRev < cant; posRev++){
                            System.out.println("\n---------------------\n" + (posRev+1) + "\n");
                            System.out.println(revista[posRev]);
                        }
                        System.out.println("\nOtros Documentos:");
                        for (int posOtro = 0; posOtro < cant; posOtro++){
                            System.out.println("\n---------------------\n" + (posOtro+1) + "\n");
                            System.out.println(otro[posOtro]);
                        }

                        System.out.print("Que obra va a ser prestada al cliente:" +
                                "\n1) Libro" +
                                "\n2) Revista" +
                                "\n3) Otro Documento" +
                                "\n Ingrese su opcion:");
                        int opcMenu3 = input.nextInt();
                        if (opcMenu3 == 1) {
                            System.out.print("Cuantos Libros van a ser prestadas al usuario:");
                            int numPrests = (input.nextInt());
                            for (int times = 0; times < numPrests; times++) {
                                System.out.println("Ingresa el numero de Libro que desea prestar al cliente:");
                                int prests = (input.nextInt() - 1);
                                if (libro[prests].getDisponible() == false){
                                    System.out.println("Error...Libro no esta disponible..." +
                                            "\nProbablemente otro usuario ya lo haya pedido prestado..." +
                                            "\nY por el momento somos una biblioteca con pocos recursos y solo tenemos una copia de ese libro... Sorry my friend...    :/");
                                } else {
                                    libro[prests].setDisponible(false);
                                    System.out.println("Libro/s prestado con exito!");
                                }
                            }
                            System.out.print("Ingerese todas las posiciones de libros que seran prestados, separados por una coma:");
                            input.nextLine();
                            userTemp.setPosLib(input.nextLine());
                        } else if (opcMenu3 == 2){
                            System.out.print("Cuantas Revistas van a ser prestadas al usuario:");
                            int numPrests = input.nextInt();
                            for (int times = 0; times < numPrests; times++) {
                                System.out.println("Ingresa el numero de libro que desea prestar al cliente:");
                                int prests = (input.nextInt() - 1);
                                if (revista[prests].getDisponible() == false){
                                    System.out.println("Error...Revista no esta disponible..." +
                                            "\nProbablemente otro usuario ya lo haya pedido prestado..." +
                                            "\nY por el momento somos una biblioteca con pocos recursos y solo tenemos una copia de ese libro... Sorry my friend...    :/");
                                } else {
                                    revista[prests].setDisponible(false);
                                    System.out.println("Revista/s prestado con exito!");
                                    String prest = (prests + 1) + ", ";
                                    userTemp.setPosRev(prest);
                                }
                            }
                            System.out.println("Ingerese todas las posiciones de revistas que seran prestados, separados por una coma:");
                            input.nextLine();
                            userTemp.setPosRev(input.nextLine());
                        }else if (opcMenu3 == 3){
                            System.out.print("Cuantos Documentos van a ser prestadas al usuario:");
                            int numPrests = input.nextInt();
                            for (int times = 0; times < numPrests; times++) {
                                System.out.println("Ingresa el numero de Documento que desea prestar al cliente:");
                                int prests = (input.nextInt() - 1);
                                if (otro[prests].getDisponible() == false){
                                    System.out.println("Error...Documento no esta disponible..." +
                                            "\nProbablemente otro usuario ya lo haya pedido prestado..." +
                                            "\nY por el momento somos una biblioteca con pocos recursos y solo tenemos una copia de ese libro... Sorry my friend...    :/");
                                } else {
                                    otro[prests].setDisponible(false);
                                    System.out.println("Documento/s prestado con exito!");
                                    String prest = (prests + 1) + ", ";
                                    userTemp.setPosOtro(prest);
                                }
                            }
                            System.out.println("Ingerese todas las posiciones de documentos que seran prestados, separados por una coma:");
                            input.nextLine();
                            userTemp.setPosOtro(input.nextLine());
                        }else{
                            System.out.println("Error...Opcion no valida.");
                        }

                        System.out.println("Tarifas:" +
                                "\nPrestamo Hora: Máximo de 8 horas, tiene que devolver las obras el mismo dia (1 dia). Cobro: Q0" +
                                "\nPrestamo Dia: Máximo de 5 días. Cobro: Q0" +
                                "\n Prestamo Tarifa: De 5 dias en adelante. Cobro: Q20 cada 5 dias.");
                        System.out.println("Ingrese el periodo (dias) estimado del prestamo:");
                        int duracionPrestamo = input.nextInt();
                        userTemp.duracionPrestamo = duracionPrestamo;
                        int saldo = 0;
                        if (duracionPrestamo <= 0) {
                            System.out.println("Error... Tiempo de prestamo NO valido.");
                            userTemp.setSaldo(saldo);
                        } else if (duracionPrestamo == 1) {
                            System.out.println("La duracion del prestamo es de un dia o menos." +
                                    "\nEl cobro es de: Q" + saldo);
                            userTemp.setSaldo(saldo);
                        } else if (duracionPrestamo >= 2 && duracionPrestamo <= 5) {
                            System.out.println("La duracion del prestamo es de " + duracionPrestamo + " dias." +
                                    "\nEl cobro es de: Q" + saldo);
                            userTemp.setSaldo(saldo);
                        } else {
                            int tiempoPrest = duracionPrestamo / 5;
                            saldo = tiempoPrest * 20;
                            System.out.println("La duracion del prestamo es de " + duracionPrestamo + " dias." +
                                    "\nEl cobro es de: Q" + saldo);
                            userTemp.setSaldo(saldo);
                        }
                        user[userPos] = userTemp;
                        numLibros = numLibros - 1;
                        System.out.println("Prestamo realizado con exito.");
                    }
                }
            } else if (menuop == 3){
                System.out.println("\nLibros:");
                for (int posLibro = 0; posLibro < cant; posLibro++) {
                    System.out.println("\n---------------------\n" + (posLibro+1) + "\n");
                    System.out.println(libro[posLibro]);
                }
                System.out.println("\nRevistas:");
                for (int posRev = 0; posRev < cant; posRev++){
                    System.out.println("\n---------------------\n" + (posRev+1) + "\n");
                    System.out.println(revista[posRev]);
                }
                System.out.println("\nOtros Documentos:");
                for (int posOtro = 0; posOtro < cant; posOtro++){
                    System.out.println("\n---------------------\n" + (posOtro+1) + "\n");
                    System.out.println(otro[posOtro]);
                }
            } else if(menuop == 4){
                System.out.println("\nUsuarios:");
                for (int userPos = 0; userPos < cant; userPos++) {
                    System.out.println("\n---------------------\n" + (posUser+1) + "\n");
                    System.out.println(Arrays.toString(user));
                }
            } else if (menuop == 5){
                System.out.println("\nUsuarios:");
                for (int userPos = 0; userPos < cant; userPos++) {
                    System.out.println("\n---------------------\n" + (posUser+1) + "\n");
                    System.out.println(Arrays.toString(user));
                }
                System.out.println("Que numero de usuario desea actualizar el prestamo:");
                int devolver = (input.nextInt() - 1);
                System.out.println("Que obras desea actualizar del prestamo:" +
                        "\n1) Libro" +
                        "\n2) Revista" +
                        "\n3) Otro Documento" +
                        "\nSeleccione una opcion:");
                int finMenu = input.nextInt();
                if (finMenu == 1){
                    user[devolver].getPosLib();
                    System.out.println("Que posicion de libro desea actualizar(por el momento solo se puede uno por uno):");
                    int devLib = (input.nextInt() - 1);
                    libro[devLib].setDisponible(true);
                    user[devolver].setUpdatePos(Integer.toString(devLib));

                } else if (finMenu == 2){
                    user[devolver].getPosRev();
                    System.out.println("Que posicion de revista desea actualizar (por momento solo se puede uno por uno):");
                    int devRev = (input.nextInt() - 1);
                    revista[devRev].setDisponible(true);
                    user[devolver].setUpdatePosR(Integer.toString(devRev));
                }else if (finMenu == 3){
                    user[devolver].getPosOtro();
                    System.out.println("Que posicion de Documento desea actualizar (por momento solo se puede uno por uno):");
                    int devOtr = (input.nextInt() - 1);
                    otro[devOtr].setDisponible(true);
                    user[devolver].setUpdatePos(Integer.toString(devOtr));
                }else{
                    System.out.println("Error...Opcion no valida.");
                }
                System.out.println("Si el/los ususarios ya devolvieron todos los libros se reiniciara su saldo, y prestamos:" +
                        "\nEl ususario ya devolvio todos los libros: (S)i o (N)o");
                String reiniciarUser = input.nextLine();
                if (reiniciarUser.equals("S") || reiniciarUser.equals("s")){
                    user[devolver].setPosLib("");
                    user[devolver].setUpdatePos("");
                    user[devolver].setPosRev("");
                    user[devolver].setUpdatePosR("");
                    user[devolver].setPosOtro("");
                    user[devolver].setUpdatePosO("");
                    user[devolver].setSaldo(0);
                } else{
                    System.out.println("Ok, cuando el usuario page su deuda, y devuelva los libros me avisas....");
                }
            } else if (menuop == 6){
                System.out.println("Cerrando programa..." +
                        "\nGracias por usar el programa de biblioteca virtual.");
                System.out.println("Estas seguro de querer salir?");
                salir = true;
            } else{
                System.out.println("Error, opcion no valida. Por favor ingrese una opcion valida.");
            }
            System.out.println("Bienvenido al gestor de biblioteca virtual." +
                    "\nPor favor ingrese una opcion:" +
                    "\n---------------------------------------------------------------" +
                    "\n1) Agregar obras a la biblioteca." +
                    "\n2) Agregar prestamo." +
                    "\n3) Ver obras disponibles." +
                    "\n4) Ver ususarios y sus prestamos" +
                    "\n5) Actualizar prestamo" +
                    "\n6) Salir." +
                    "\n---------------------------------------------------------------");
            System.out.print("Ingrese una opcion:");
            menuop = input.nextInt();        }
    }
}
//String autor = input.nextLine();
//libTemp.setAutNombre(input.nextLine());
//libTemp.autor.setNombre(input.nextLine());
//libTemp.autor.nombre= input.nextLine();
//libro[posLibro].autor.nombre = autor;
//System.out.print("Ingrese apellido del autor:");
//libTemp.setAutApellido(input.nextLine());
//libTemp.autor.setApellido(input.nextLine());
//libTemp.autor.apellido = input.nextLine();
//String apellido = input.nextLine();
//libro[posLibro].autor.apellido = apellido;
//otra forma de cargar autor
//libro.autor.Persona(autor,);