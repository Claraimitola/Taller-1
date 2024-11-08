public class Estudiante {
        private String nombre;
        private int edad;
        private String curso;
    
        // Constructor por defecto
        public Estudiante() {
            this.nombre = "Nombre genérico";
            this.edad = 18;
            this.curso = "Curso genérico";
        }
    
        // Constructor con nombre y edad
        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
            this.curso = "Curso genérico";
        }
    
        // Constructor con todos los parámetros
        public Estudiante(String nombre, int edad, String curso) {
            this(nombre, edad); // Llamada a otro constructor
            this.curso = curso;
        }
    
        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        // Método para mostrar los detalles del estudiante
        public void mostrarDetalles() {
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Edad: " + this.edad);
            System.out.println("Curso: " + this.curso);
        }

}
