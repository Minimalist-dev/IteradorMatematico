/*
https://docs.oracle.com/javase/tutorial/java/annotations/basics.html
 */
package x.ficheros;
/*
Nota:  Para que la información @ClassPreamble aparezca en la documentación generada por Javadoc, 
debe anotar la @ClassPreamble definición con la @Documented anotación:

// importar esto para usar @Documented
import java.lang.annotation.*;

@Documented
@interface ClassPreamble {

   // Definiciones de elementos de anotación 
}
*/

/** @author neury

@Autor(
   name = "Benjamin Franklin",
   fecha = "3/27/2003"
)

@Author(name = "Jane Doe")
@Author(name = "John Smith")

@interface ClassPreamble {
   String author();
   String date();
   int currentRevision() default 1;
   String lastModified() default "N/A";
   String lastModifiedBy() default "N/A";
   // Note use of array
   String[] reviewers();
} 

@ClassPreamble (
   author = "John Doe",
   date = "3/17/2002",
   currentRevision = 6,
   lastModified = "4/12/2004",
   lastModifiedBy = "Jane Doe",
   // Note array notation
   reviewers = {"Alice", "Bob", "Cindy"}
)
*/
public class Anotaciones {    
/** @param args the command line arguments
 
 @SuppressWarnings(value = "sin marca") → @SuppressWarnings ("sin marcar")
 */
    public static void main(String[] args) {
        // TODO code application logic here
    } 
}
