import javax.swing.*;

public class EmpleadoPorHora extends Empleado
{
    private double tarifaPorHora;
    private double horasTrabajadas;

    public EmpleadoPorHora(String nombre, double salario, double tarifaPorHora)
    {
        super(nombre, salario);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = 0;
    }

    public void agregarHoras(double horasTrabajadas)
    {
        if(horasTrabajadas < 0)
        {
            this.horasTrabajadas += horasTrabajadas;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La cantidad de horas trabajadas debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public double calcularPago()
    {
        return tarifaPorHora * horasTrabajadas;
    }
}
