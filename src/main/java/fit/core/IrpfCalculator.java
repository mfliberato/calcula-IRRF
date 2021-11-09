package fit.core;

public class IrpfCalculator{
    public static final double exemptionValue = 1903.98;

    public static double descontInss(double totalSalary) {
        return totalSalary * 0.11;
        
    }

    public static double calculateBaseSalary(double totalSalary) {
        return totalSalary - descontInss(totalSalary);
        
    }

    public static double calculateExemption(){
        return  exemptionValue;
    }

    public static double calculateDiscount(double baseSalary){
        return baseSalary - calculateExemption();

    }

    public static double calculateTaxLayer(double baseSalary){
        if (baseSalary <= 1903.98) return 0;
        if (baseSalary <=2826.65)  return 0.075;
        if (baseSalary <=3751.05)  return 0.15;
        if (baseSalary <= 4664.68) return 0.225;
        return 0.275;
        
    }

    public static double calculateIrpf(double totalSalary){
        var baseSalary = calculateBaseSalary(totalSalary);
        var discountSalary = calculateDiscount(baseSalary);
        var tax = calculateTaxLayer(baseSalary);
        return discountSalary * tax; 

    }

    
}