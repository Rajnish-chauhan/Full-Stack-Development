package test;
public class LambdaFun1 {
    public static void main(String[] args) {
        int a=2;
        LambdaEXP lexp = () -> {
            return "100";
            };
        LambdaEXP lam=new LambdaEXP() {
            int a=2;
            @Override
            public String getSalary() {
                System.out.println(this.a);
                return "";
            }
        };
        System.out.println("Salary is: "+lexp.getSalary());
        }
    }
