public class CuentaBancaria {
        private String numeroCuenta;
        private double saldo;
        private String tipoCuenta;
    
        // Constructor por defecto
        public CuentaBancaria() {
            this.numeroCuenta = "000000";
            this.saldo = 0.0;
            this.tipoCuenta = "Ahorros";
        }
    
        // Constructor parametrizado
        public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = 0.0;
            this.tipoCuenta = tipoCuenta;
        }
    
        // Constructor sobrecargado
        public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
            this.tipoCuenta = tipoCuenta;
        }
    
        // Método para mostrar los detalles de la cuenta
        public void mostrarDetalles() {
            System.out.println("Número de Cuenta: " + this.numeroCuenta);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Tipo de Cuenta: " + this.tipoCuenta);
        }
    
}
