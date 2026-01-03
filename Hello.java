package javaDemo;
class Hello{
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println("Java Agrs Sum :: <num1> <num2>");
        }

        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            int sum = x + y;
            System.out.println("Sum = "+sum);
        }catch(Exception ex){
            System.out.println("Error : Arguments must be integers.");
        }
    }
}