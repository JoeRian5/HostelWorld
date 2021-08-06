public class CodePractice {

    private static int getRandN(int min, int max){
        if(min >= max){
            throw new IllegalArgumentException("error");
        }
        else{
            return (int)(Math.random() * ((max - min) + 1)) + min;
        }
    }

    public static void main(String[] args) {
        for(int n = 1; n <= 10; n++)
        {
            System.out.println(n + "." + getRandN(100,500));
        }

        for(int i = 1; i <= 10; i++)
        {
            System.out.print("");

        }

    }
}