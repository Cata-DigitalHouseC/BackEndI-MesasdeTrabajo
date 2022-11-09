import com.company.daos.EstudianteDaoH2;
import com.company.entities.Estudiante;
import com.company.services.EstudianteService;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setId(2L);
        estudiante1.setNombre("Cata");
        estudiante1.setApellido("Hernandez");

        EstudianteService estudianteService = new EstudianteService();
        //seteamos estrategia de persistencia, es decir DAO
        estudianteService.setEstudianteIDao(new EstudianteDaoH2());

        estudianteService.guardarEstudiante(estudiante1);
        System.out.println(estudianteService.buscarEstudiante(2L));

    }
}