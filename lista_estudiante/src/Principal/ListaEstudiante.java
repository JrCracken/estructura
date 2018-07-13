package Principal;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;


/**
 *
 * @author Cracken
 */
public class ListaEstudiante {

    public int getTamano() {
        return tam;
    }

    public boolean esVacia() {

        return inicio == null;

    }
    
    int max;
    private Nodo inicio;
    private int tam = 0, op = 0;

    public ListaEstudiante() {

        while (op != 8) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú"
                    + "\n 1 ~> Agregar Estudiante"
                    + "\n 2 ~> Mostrar"
                    + "\n 3 ~> Buscar"
                    + "\n 4 ~> Eliminar"
                    + "\n 5 ~> Salir"));

            switch (op) {
                case 1: {
                    agregarAlInicio();
                    break;
                }

                case 2: {
                    mostrar();

                    break;
                }
                case 3: {
                      buscar();
                   
                    break;
                }

                case 4: {
                   eliminar();
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }

            }
        }

    }

    public void agregarAlInicio() {
        Nodo nuevo = new Nodo();

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        nuevo.setNombre(nombre);
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        nuevo.setApellido(apellido);
        String residencia = JOptionPane.showInputDialog("Ingrese el lugar de residencia");
        nuevo.setResidencia(residencia);
        String nacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento formato: 00/00/0000 ");
        nuevo.setNacimiento(nacimiento);
        String tipoID = JOptionPane.showInputDialog("Ingrese el tipo de indentificación");
        nuevo.setTipoID(tipoID);
        int ID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de identificación"));
        nuevo.setID(ID);

        String trabaja = JOptionPane.showInputDialog("Trabaja actualmente si/no");
        nuevo.setTrabaja(trabaja);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);

            inicio = nuevo;

        }
        tam++;
        try
{

File archivo=new File(nombre + ".txt");


FileWriter escribir=new FileWriter(archivo,true);

escribir.write(" Nombre: "+nombre);
escribir.write(" Apellidos: "+apellido);
escribir.write(" Residencia: "+residencia);
escribir.write(" Fecha de nacimiento: "+nacimiento);
escribir.write(" Tipo de identificación"+tipoID);
escribir.write(" Numero de identificaicón: "+ID);
escribir.write(" Trabaja: "+trabaja);


escribir.close();
}


catch(Exception e)
{
System.out.println("Error al escribir");
}
    }

   public void agregarAlFinal() {
        Nodo nuevo = new Nodo();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        nuevo.setNombre(nombre);
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        nuevo.setApellido(apellido);
        String Residencia = JOptionPane.showInputDialog("Ingrese el lugar de residencia");
        nuevo.setResidencia(Residencia);
        String Nacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento");
        nuevo.setNacimiento(Nacimiento);
        String tipoID = JOptionPane.showInputDialog("Ingrese el tipo de indentificación");
        nuevo.setTipoID(tipoID);
        int ID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n° de identificación"));
        nuevo.setID(ID);
        String trabaja = JOptionPane.showInputDialog("El estudiante se encuentra Trabajando actualmente?");
        nuevo.setTrabaja(trabaja);

        if (esVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

            }
            aux.setSiguiente(nuevo);
        }
        tam++;

    }

    public boolean buscar() {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "No se encontró registro.");
        }

        Nodo aux = inicio;
        boolean encontrado = false;
        int buscar;
        while (aux != null && encontrado != true) {
            buscar = Integer.parseInt(JOptionPane.showInputDialog("Busque el estudiente con su #ID"));

            if (buscar == aux.getID()) {
                JOptionPane.showMessageDialog(null, "Estudiante encontrado.");
                encontrado = true;

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró registro");
                aux = aux.getSiguiente();
            }

        }

        return encontrado;
    }

    public void mostrar() {
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;

            while (aux != null) {
                String objetoEst = "";

                objetoEst = "Registro #" + i + "\n" + " Nombre: "
                        + aux.getNombre() + "\n" + " Apellido: "
                        + aux.getApellido() + "\n" + " Residencia: "
                        + aux.getResidencia()
                        + "\n" + " Nacimiento: " + aux.getNacimiento()
                        + "\n" + " Tipo de ID: " + aux.getTipoID()
                        + "\n" + " # de ID: " + aux.getID() + "\n" + " Trabaja: "
                        + "" + aux.getTrabaja();

                aux = aux.getSiguiente();
                i++;
                JOptionPane.showMessageDialog(null, objetoEst);
                try {

                    FileWriter texto = new FileWriter("backup.txt");
                    texto.write(objetoEst);
                    texto.close();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }

        }
    }

    public void eliminar() {
        inicio = null;
        tam = 0;
        JOptionPane.showMessageDialog(null, "Informacion del estudiante eliminado");
    }




    
}
