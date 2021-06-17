/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

/**
 *
 * @author ricas
 */
public class extra2 {

    

        private int codigoCliente, edad;
        protected String nombre, apellidoPaterno, apellidoMaterno, telefono, direccion;

        public extra2() {
        }

        public extra2(int codigoCliente, int edad, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String direccion) {
            this.codigoCliente = codigoCliente;
            this.edad = edad;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.telefono = telefono;
            this.direccion = direccion;
        }

        public int getCodigoCliente() {
            return codigoCliente;
        }

        public void setCodigoCliente(int codigoCliente) {
            this.codigoCliente = codigoCliente;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }

