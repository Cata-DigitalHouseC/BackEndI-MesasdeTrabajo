package com.company.daos;

import com.company.entities.Estudiante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoH2 implements IDao<Estudiante>{

    String queryCreate= "CREATE TABLE estudiantes (id bigint, nombre varchar(255), apellido varchar(255));";

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_estudiantes";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "sa";
    @Override
    public Estudiante guardar(Estudiante estudiante) {
        Connection connection = null;
        PreparedStatement preparedStatement=null;

        try {
            //1 levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            //2 Crear una sentencia
            String queryInsert="INSERT INTO estudiantes values(?,?,?)";
            preparedStatement = connection.prepareStatement(queryInsert);
            preparedStatement.setLong(1,estudiante.getId());
            preparedStatement.setString(2,estudiante.getNombre());
            preparedStatement.setString(3,estudiante.getApellido());

            //3 Ejecutar la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return estudiante;

    }

    @Override
    public void eliminar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement=null;

        try {
            //1 levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            //2 Crear una sentencia
            String queryDelete="DELETE FROM estudiantes WHERE id=?";
            preparedStatement = connection.prepareStatement(queryDelete);
            preparedStatement.setLong(1,id);

            //3 Ejecutar la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Estudiante buscar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement=null;
        Estudiante estudiante=null;
        try {
            //1 levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            //2 Crear una sentencia
            String querySearchOne="SELECT * FROM estudiantes WHERE id=?";
            preparedStatement = connection.prepareStatement(querySearchOne);
            preparedStatement.setLong(1,id);

            //3 Ejecutar la sentencia
            ResultSet resultSet = preparedStatement.executeQuery();


            //4 evaluar los resultados
            while(resultSet.next()){
                Long idEstudiante = resultSet.getLong("id");
                String nombre= resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");

                estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);

            }
            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return estudiante;
    }

    @Override
    public List<Estudiante> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement=null;
        List<Estudiante> estudiantes = new ArrayList();
        try {
            //1 levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            //2 Crear una sentencia
            String querySearchOne="SELECT * FROM estudiantes;";
            preparedStatement = connection.prepareStatement(querySearchOne);

            //3 Ejecutar la sentencia
            ResultSet resultSet = preparedStatement.executeQuery();


            //4 evaluar los resultados
            while(resultSet.next()){
                Long idEstudiante = resultSet.getLong("id");
                String nombre= resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");

                Estudiante estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);

                estudiantes.add(estudiante);

            }
            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return estudiantes;
    }
}
