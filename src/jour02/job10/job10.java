package jour02.job10;


public interface job10 {
    public static void main(String[] args){
        String str = "1234";
        char first = str.charAt(0), second = str.charAt(str.length() - 3), third = str.charAt(str.length() - 2), last = str.charAt(str.length() - 1);
        int num1 = Character.getNumericValue(first), num2 = Character.getNumericValue(second);
        int num3 = Character.getNumericValue(third), num4 = Character.getNumericValue(last);

        int sum = num1+num2+num3+num4;
        System.out.println("L'addition 1+2+3+4 = " + sum);
    }
}
