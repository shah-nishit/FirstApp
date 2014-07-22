import java.util.Scanner;

public class PayRoll
{
	public void calculatePayRoll(double workingHours, double ratePerHour)
	{
		double regularPay = 0;
		double overTimePay = 0;
		double totalPay = 0;
		int timeInterval = 10;
		
		if (workingHours <= 40 )
		{
			regularPay = workingHours * ratePerHour;
		}
		else if (workingHours > 40 && workingHours <= 50 )
		{
			regularPay = 40 * ratePerHour;
			overTimePay = (workingHours - timeInterval) * ratePerHour * 1.5;
		}
		else if (workingHours > 50 && workingHours <= 60 )
		{
			regularPay = 40 * ratePerHour;
			overTimePay = timeInterval * ratePerHour * 1.5 + (workingHours - 50) * ratePerHour * 2.0;
		}
		else if (workingHours > 60)
		{
			regularPay = 40 * ratePerHour;
			overTimePay = timeInterval * ratePerHour * 1.5 + timeInterval * ratePerHour * 2 + (workingHours - 60) * ratePerHour * 2.5;
		}
		
		totalPay = regularPay + overTimePay;
		
		System.out.println("Regualar Pay: $" + regularPay);
		System.out.println("OverTime Pay: $" + overTimePay);
		System.out.println("Total    Pay: $" + totalPay);
	}
	
	public static void main(String[] args)
	{
		double hoursWorked;
		double hourlyRate;
		PayRoll payRoll = new PayRoll();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Hours Worked by an Employee: ");
		hoursWorked = input.nextDouble();
		
		System.out.print("Enter Hourly Rate of an Employee: ");
		hourlyRate = input.nextDouble();
		
		payRoll.calculatePayRoll(hoursWorked, hourlyRate);
	}

}
