import javax.swing.*;

public class EmpleadoContratista extends Empleado
{
    double tarifaPorHora;
    double horasTrabajadas;
    double tarifaPorProyecto;

    public EmpleadoContratista(String nombre, double salario, double tarifaPorHora, double tarifaPorProyecto)
    {
        super(nombre, salario);
        this.tarifaPorHora = tarifaPorHora;
        this.tarifaPorProyecto = tarifaPorProyecto;
        this.horasTrabajadas = 0;
    }

    public void agregarHoras(double horasTrabajadas)
    {
        if(horasTrabajadas > 0)
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
        return (horasTrabajadas * tarifaPorHora) + tarifaPorProyecto;
    }


}
